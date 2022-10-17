package com.github.parameterx.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;

public class AluminumOre extends DropExperienceBlock {
    public AluminumOre() {
        super(Properties.of(Material.STONE)
                .strength(4f)
                .requiresCorrectToolForDrops(),
                UniformInt.of(5,10)
        );
    }
}
