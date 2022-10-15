package com.github.parameterx.tabs;

import com.github.parameterx.items.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXFoods extends CreativeModeTab {
    public PXFoods() {
        super("ProjectX Foods");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.butterscotchCinnamonPie.get());
    }
}
