package com.github.parameterx;

import com.github.parameterx.blocks.entities.ElectrolyzerEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegister {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,Utils.MODID);

    public static final RegistryObject<BlockEntityType<ElectrolyzerEntity>> Electrolyzer =
            BLOCK_ENTITY.register("electrolyzer",
                    () -> BlockEntityType.Builder.of(ElectrolyzerEntity::new,
                            BlockRegister.electrolyzerBlock.get()).build(null));
}
