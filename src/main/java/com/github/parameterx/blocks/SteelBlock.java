package com.github.parameterx.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class SteelBlock extends Block {
    public SteelBlock() {
        super(Properties.of(Material.METAL)
                .strength(3f)
                .explosionResistance(7f)
                .requiresCorrectToolForDrops()
        );
    }
}
