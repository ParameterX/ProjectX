package com.github.parameterx.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class AluminumBlock extends Block {
    public AluminumBlock() {
        super(Properties.of(Material.METAL)
                .strength(3)
                .explosionResistance(5)
                .requiresCorrectToolForDrops()
        );
    }
}
