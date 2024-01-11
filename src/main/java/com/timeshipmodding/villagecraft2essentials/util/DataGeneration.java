package com.timeshipmodding.villagecraft2essentials.util;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.datagen.*;
import com.timeshipmodding.villagecraft2essentials.datagen.Recipes;
import com.timeshipmodding.villagecraft2essentials.datagen.tags.BlockTags;
import com.timeshipmodding.villagecraft2essentials.datagen.tags.ItemTags;
import com.timeshipmodding.villagecraft2essentials.providers.BlockLootTableProvider;
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

        generator.addProvider(event.includeServer(), new Recipes(packOutput));

        generator.addProvider(event.includeServer(), new WorldGen(packOutput, lookupProvider));

        generator.addProvider(event.includeServer(), BlockLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new BlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModels(packOutput, existingFileHelper));

        BlockTags blockTagGenerator = generator.addProvider(event.includeServer(),
                new BlockTags(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ItemTags(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
