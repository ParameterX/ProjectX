package com.github.parameterx;

import com.github.parameterx.Utils;
import com.github.parameterx.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MODID);
    public static final DeferredRegister<Item> BLOCKITEM = DeferredRegister.create(ForgeRegistries.ITEMS,Utils.MODID);

    /**
     * Auto register the block and create the blockItem and put it to the PXTabs.BLOCK tab.
     * @param name
     * @param block
     * @return
     * @param <T>
     */
    private static <T extends Block> RegistryObject<T> reg (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCK.register(name,block);
        BLOCKITEM.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(PXTabs.BLOCKS)));
        return toReturn;
    }

    // Use the traditional way to register steel because it is used as icon.
    public static final RegistryObject<Block> steelBlock = BLOCK.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Item> steelBlockItem = BLOCKITEM.register("steel_block",
            () -> new BlockItem(steelBlock.get(), new Item.Properties().tab(PXTabs.BLOCKS)));


    // Blocks
    public static final RegistryObject<Block> aluminumBlock = reg("aluminum_block", AluminumBlock::new);
    public static final RegistryObject<Block> magnesiumBlock = reg("magnesium_block", MagnesiumBlock::new);

    // Ores
    public static final RegistryObject<Block> aluminumOre = reg("aluminum_ore", AluminumOre::new);
    public static final RegistryObject<Block> deepslateAluminumOre = reg("deepslate_aluminum_ore", DeepslateAluminumOre::new);
    public static final RegistryObject<Block> magnesiumOre = reg("magnesium_ore", MagnesiumOre::new);
    public static final RegistryObject<Block> deepslateMagnesiumOre = reg("deepslate_magnesium_ore", MagnesiumOre::new);

}
