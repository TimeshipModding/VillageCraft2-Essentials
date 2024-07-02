package com.timeshipmodding.villagecraft2essentials.datagen.loot;

import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

public class DataBlockLootTables extends BlockLootSubProvider {
    public DataBlockLootTables(CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }



    @Override
    protected void generate() {

        // Ore LootTables
        add(RUBY_ORE.get(), (block -> createOreDrop(RUBY_ORE.get(), RUBY.get())));
        add(DEEPSLATE_RUBY_ORE.get(), (block -> createOreDrop(DEEPSLATE_RUBY_ORE.get(), RUBY.get())));
        add(AMBER_ORE.get(), (block -> createOreDrop(AMBER_ORE.get(), AMBER.get())));
        add(DEEPSLATE_AMBER_ORE.get(), (block -> createOreDrop(DEEPSLATE_AMBER_ORE.get(), AMBER.get())));

    }

    // Generate Methods
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BLOCKS.getEntries() // Get all registered entries
                .stream() // Stream the wrapped objects
                .map(Holder::value) // Get the object if available
                .toList(); // Create the iterable
    }
}
