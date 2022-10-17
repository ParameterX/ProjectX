package com.github.parameterx.blocks;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;

public class DeepslateMagnesiumOre extends DropExperienceBlock {
    public DeepslateMagnesiumOre() {
        super(Properties.of(Material.METAL)
                        .strength(4f)
                        .requiresCorrectToolForDrops(),
                UniformInt.of(7,12)
        );
    }
}
