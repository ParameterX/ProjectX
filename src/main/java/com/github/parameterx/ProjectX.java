package com.github.parameterx;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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
    }
}
