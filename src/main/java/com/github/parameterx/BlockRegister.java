package com.github.parameterx;

import com.github.parameterx.Utils;
import com.github.parameterx.blocks.SteelBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MODID);

    public static final RegistryObject<Block> steelBlock = BLOCK.register("steel_block", SteelBlock::new);
}
