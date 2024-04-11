package com.timeshipmodding.villagecraft2essentials.event;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.datagen.*;
import com.timeshipmodding.villagecraft2essentials.datagen.DataRecipes;
import com.timeshipmodding.villagecraft2essentials.datagen.tags.DataBlockTags;
import com.timeshipmodding.villagecraft2essentials.datagen.tags.DataItemTags;
import com.timeshipmodding.villagecraft2essentials.util.BlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = VillageCraft2Essentials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherdata(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new DataRecipes(packOutput));
        generator.addProvider(event.includeServer(), new DataWorldGen(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new DataPoiTypeTags(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(), BlockLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new DataBlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new DataItemModels(packOutput, existingFileHelper));


        DataBlockTags blockTagGenerator = generator.addProvider(event.includeServer(), new DataBlockTags(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new DataItemTags(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
