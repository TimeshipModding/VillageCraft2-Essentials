package com.timeshipmodding.villagecraft2essentials;

import com.timeshipmodding.villagecraft2essentials.registries.*;
import com.timeshipmodding.villagecraft2essentials.setup.ClientSetup;
import com.timeshipmodding.villagecraft2essentials.setup.ModSetup;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VillageCraft2Essentials.MODID)
public class VillageCraft2Essentials {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "villagecraft2essentials";


    public VillageCraft2Essentials() {

        // Register the registry classes

        ModItems.init();
        ModBlocks.init();
        ModTags.init();
        ModConfiguredFeatures.init();
        ModPlacedFeatures.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        // Register ModSetup and ClientSetup
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
        // Register World Gen classes


    }
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}