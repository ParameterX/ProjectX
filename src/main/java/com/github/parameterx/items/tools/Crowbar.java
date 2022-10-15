package com.github.parameterx.items.tools;

import com.github.parameterx.itemTier.PXItemTier;
import com.github.parameterx.tabs.PXTabs;
import net.minecraft.world.item.PickaxeItem;

public class Crowbar extends PickaxeItem {
    public Crowbar() {
        super(PXItemTier.STEEL,1,0F,new Properties().tab(PXTabs.TOOLS));
    }
}
