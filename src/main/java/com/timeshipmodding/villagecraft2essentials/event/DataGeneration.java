package com.timeshipmodding.villagecraft2essentials.event;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.datagen.DataBlockStates;
import com.timeshipmodding.villagecraft2essentials.datagen.DataItemModels;
import com.timeshipmodding.villagecraft2essentials.datagen.loot.DataBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DataGeneration {
    @SubscribeEvent
    public static void gatherdata(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LootTableProvider(List.of(DataBlockLootTables), lookupProvider));

        generator.addProvider(event.includeClient(), new DataBlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new DataItemModels(packOutput, existingFileHelper));
    }
}
