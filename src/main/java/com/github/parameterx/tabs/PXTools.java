package com.github.parameterx.tabs;

import com.github.parameterx.items.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXTools extends CreativeModeTab {
    public PXTools() {
        super("projectx_tools");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.crowbar.get());
    }
}
