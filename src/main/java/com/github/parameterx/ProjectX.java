package com.github.parameterx;

import com.github.parameterx.screens.ElectrolyzerScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Utils.MODID)
public class ProjectX {

    public ProjectX() {
        // The Event Bus
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registers
        ItemRegister.ITEM.register(eventBus);
        BlockRegister.BLOCK.register(eventBus);
        BlockRegister.BLOCKITEM.register(eventBus);
        BlockEntityRegister.BLOCK_ENTITY.register(eventBus);
        MenuRegister.MENU.register(eventBus);

    }

    @Mod.EventBusSubscriber(modid = Utils.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // register the MenuScreen
            MenuScreens.register(MenuRegister.ElectrolyzerMenu.get(), ElectrolyzerScreen::new);
        }
    }
}
