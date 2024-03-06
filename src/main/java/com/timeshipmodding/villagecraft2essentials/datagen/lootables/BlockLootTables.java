package com.timeshipmodding.villagecraft2essentials.datagen.lootables;

import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.providers.BlockLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Block LootTables
        dropSelf(RUBY_BLOCK.get());
        dropSelf(AMBER_BLOCK.get());
        dropSelf(WHITE_ATM.get());

        // Ore LootTables
        add(RUBY_ORE.get(), (block -> createOreDrop(RUBY_ORE.get(), RUBY.get())));
        add(DEEPSLATE_RUBY_ORE.get(), (block -> createOreDrop(DEEPSLATE_RUBY_ORE.get(), RUBY.get())));
        add(AMBER_ORE.get(), (block -> createOreDrop(AMBER_ORE.get(), AMBER.get())));
        add(DEEPSLATE_AMBER_ORE.get(), (block -> createOreDrop(DEEPSLATE_AMBER_ORE.get(), AMBER.get())));

    }

    // Generate Methods
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

