package com.github.parameterx.tabs;

import com.github.parameterx.items.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXItems extends CreativeModeTab {
    public PXItems() {
        super("projectx_items");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.steelIngot.get());
    }
}
