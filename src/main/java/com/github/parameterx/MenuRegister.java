package com.github.parameterx;

import com.github.parameterx.screens.ElectrolyzerMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuRegister {
    public static final DeferredRegister<MenuType<?>> MENU =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Utils.MODID);

    /**
     * Registers the menu quickly
     * @param factory
     * @param name
     * @return
     * @param <T>
     */
    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> reg(
            String name, IContainerFactory<T> factory) {
        return MENU.register(name, () -> IForgeMenuType.create(factory));
    }

    public static RegistryObject<MenuType<ElectrolyzerMenu>> ElectrolyzerMenu =
            reg("electrolyzer_menu",ElectrolyzerMenu::new);
}
