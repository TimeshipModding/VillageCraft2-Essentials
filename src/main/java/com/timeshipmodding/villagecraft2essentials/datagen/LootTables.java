package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.providers.BaseLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;

import java.util.Set;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

public class LootTables extends BaseLootTableProvider {

    @Override
    protected void generate() {
        // Block LootTables
        dropSelf(RUBY_BLOCK.get());
        dropSelf(RUBY_ATM.get());

        // Ore LootTables
        add(RUBY_ORE.get(), (block -> createOreDrop(RUBY_ORE.get(), RUBY.get())));
        add(DEEPSLATE_RUBY_ORE.get(), (block -> createOreDrop(DEEPSLATE_RUBY_ORE.get(), RUBY.get())));

    }
}
