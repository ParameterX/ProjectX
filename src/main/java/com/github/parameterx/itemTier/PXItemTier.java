package com.github.parameterx.itemTier;

import com.github.parameterx.ItemRegister;
import com.github.parameterx.PXTags;
import com.github.parameterx.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class PXItemTier {
    public static Tier STEEL;

    static {
        STEEL = TierSortingRegistry.registerTier(
                new ForgeTier(2, 350, 7.0F, 2.0F, 14,
                        PXTags.Blocks.NEED_STEEL_TOOL,
                        () -> Ingredient.of(ItemRegister.steelIngot.get())),
                new ResourceLocation(Utils.MODID,"steel"),
                List.of(Tiers.STONE),
                List.of(Tiers.DIAMOND)
        );
    }
}
