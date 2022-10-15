package com.github.parameterx.items.foods;

import com.github.parameterx.PXTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ButterscotchCinnamonPie extends Item {
    private static final FoodProperties foodProperty = (new FoodProperties.Builder())
            .nutrition(6)
            .build();
    public ButterscotchCinnamonPie() {
        super(new Properties().food(foodProperty).tab(PXTabs.FOODS));
    }
}
