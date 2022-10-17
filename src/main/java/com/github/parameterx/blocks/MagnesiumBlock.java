package com.github.parameterx.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class MagnesiumBlock extends Block {
    public MagnesiumBlock() {
        super(Properties.of(Material.METAL)
                .strength(2.5f)
                .explosionResistance(2f)
                .requiresCorrectToolForDrops()
        );
    }
}
