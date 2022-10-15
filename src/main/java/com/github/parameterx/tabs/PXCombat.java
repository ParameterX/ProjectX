package com.github.parameterx.tabs;

import com.github.parameterx.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PXCombat extends CreativeModeTab {
    public PXCombat() {
        super("projectx_combat");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegister.watermelonKnife.get());
    }
}
