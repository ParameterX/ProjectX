package com.github.parameterx.blocks.entities;

import com.github.parameterx.BlockEntityRegister;
import com.github.parameterx.ItemRegister;
import com.github.parameterx.recipes.ElectrolyzerRecipe;
import com.github.parameterx.screens.ElectrolyzerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ElectrolyzerEntity extends BlockEntity implements MenuProvider {

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;
    private final ItemStackHandler itemStackHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public ElectrolyzerEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegister.Electrolyzer.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ElectrolyzerEntity.this.progress;
                    case 1 -> ElectrolyzerEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> ElectrolyzerEntity.this.progress = value;
                    case 1 -> ElectrolyzerEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Electrolyzer");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new ElectrolyzerMenu(id, inventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap,side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemStackHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory",itemStackHandler.serializeNBT());
        nbt.putInt("electrolyzer.progress",this.progress);

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        itemStackHandler.deserializeNBT(nbt.getCompound("inventory"));
        super.load(nbt);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemStackHandler.getSlots());
        for (int i = 0; i < itemStackHandler.getSlots(); i++){
            inventory.setItem(i,itemStackHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, ElectrolyzerEntity entity) {
        if (level.isClientSide()){
            return;
        }

        if (hasRecipe(entity)) {
            entity.progress += 1;
            setChanged(level,pos,state);

            if (entity.progress >= entity.maxProgress){
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            setChanged(level,pos,state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(ElectrolyzerEntity entity) {
        Level level1 = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemStackHandler.getSlots());
        for (int i=0; i< entity.itemStackHandler.getSlots(); i++){
            inventory.setItem(i, entity.itemStackHandler.getStackInSlot(i));
        }
        Optional<ElectrolyzerRecipe> recipe =
                level1.getRecipeManager().getRecipeFor(ElectrolyzerRecipe.Type.INSTANCE, inventory, level1);

        if (hasRecipe(entity)) {
            entity.itemStackHandler.extractItem(1,1,false);
            entity.itemStackHandler.setStackInSlot(2,new ItemStack(recipe.get().getResultItem().getItem(),
                    entity.itemStackHandler.getStackInSlot(2).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(ElectrolyzerEntity entity) {
        Level level1 = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemStackHandler.getSlots());
        for (int i=0; i< entity.itemStackHandler.getSlots(); i++){
            inventory.setItem(i, entity.itemStackHandler.getStackInSlot(i));
        }
        Optional<ElectrolyzerRecipe> recipe =
                level1.getRecipeManager().getRecipeFor(ElectrolyzerRecipe.Type.INSTANCE, inventory, level1);

        return recipe.isPresent()
                && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, recipe.get().getResultItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack itemStack) {
        return inventory.getItem(2).getItem() == itemStack.getItem() || inventory.getItem(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }
}
