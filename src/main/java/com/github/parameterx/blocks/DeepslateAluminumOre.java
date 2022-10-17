package com.github.parameterx.blocks;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;

public class DeepslateAluminumOre extends DropExperienceBlock {
    public DeepslateAluminumOre() {
        super(Properties.of(Material.STONE)
                .strength(5f)
                .requiresCorrectToolForDrops(),
                UniformInt.of(7,12)
        );
    }
}
