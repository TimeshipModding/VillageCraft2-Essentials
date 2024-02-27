package com.timeshipmodding.villagecraft2essentials;

import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.content.creativetab.EssentialsTab;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.GCPermits;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.PVPermits;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.VCPermits;
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

        // Register Forge Event Bus
        MinecraftForge.EVENT_BUS.register(this);

        // Register Creative Mode Tabs
        EssentialsTab.init(modEventBus);

        // Register the registry classes
        ModBlocks.init(modEventBus);
        ModItems.init(modEventBus);

        GCPermits.init(modEventBus);
        PVPermits.init(modEventBus);
        VCPermits.init(modEventBus);
    }
}