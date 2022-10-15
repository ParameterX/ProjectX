package com.github.parameterx.items.tools;

import com.github.parameterx.itemTier.PXItemTier;
import com.github.parameterx.tabs.PXTabs;
import net.minecraft.world.item.SwordItem;

public class WatermelonKnife extends SwordItem {
    public WatermelonKnife() {
        super(PXItemTier.STEEL,3,-3F,new Properties().tab(PXTabs.COMBAT));
    }
}
