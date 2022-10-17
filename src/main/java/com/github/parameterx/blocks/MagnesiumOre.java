package com.github.parameterx.blocks;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;

public class MagnesiumOre extends DropExperienceBlock {
    public MagnesiumOre() {
        super(Properties.of(Material.METAL)
                .strength(3)
                .requiresCorrectToolForDrops(),
                UniformInt.of(5,10)
        );
    }
}
