package com.github.parameterx.tabs;

import com.github.parameterx.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXFoods extends CreativeModeTab {
    public PXFoods() {
        super("projectx_foods");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.butterscotchCinnamonPie.get());
    }
}
