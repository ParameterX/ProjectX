package com.github.parameterx;

import com.github.parameterx.recipes.ElectrolyzerRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeRegister {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Utils.MODID);

    public static final RegistryObject<RecipeSerializer<ElectrolyzerRecipe>> electrolyzerSerializer =
            SERIALIZER.register("electrolyzer", () -> ElectrolyzerRecipe.Serializer.INSTANCE);
}
