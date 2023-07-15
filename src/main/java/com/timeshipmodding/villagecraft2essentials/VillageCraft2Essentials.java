package com.timeshipmodding.villagecraft2essentials;

import com.timeshipmodding.villagecraft2essentials.registries.*;
import com.timeshipmodding.villagecraft2essentials.registries.ModDataGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VillageCraft2Essentials.MODID)
public class VillageCraft2Essentials {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "villagecraft2essentials";


    public VillageCraft2Essentials() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Setup DataGeneration
        modEventBus.addListener(ModDataGeneration::generate);

        MinecraftForge.EVENT_BUS.register(this);

        // Register the registry classes
        ModItems.init(modEventBus);
        ModBlocks.init(modEventBus);
        ModBlockItems.init(modEventBus);
        ModCreativeModeTabs.init(modEventBus);
    }
}