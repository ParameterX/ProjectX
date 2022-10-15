package com.github.parameterx.tabs;

import com.github.parameterx.BlockRegister;
import com.github.parameterx.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXBlocks extends CreativeModeTab {
    public PXBlocks() {
        super("projectx_blocks");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.steelBlock.get());
    }
}
