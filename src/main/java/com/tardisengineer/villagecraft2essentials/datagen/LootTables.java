package com.tardisengineer.villagecraft2essentials.datagen;

import com.tardisengineer.villagecraft2essentials.providers.BaseLootTableProvider;
import com.tardisengineer.villagecraft2essentials.registries.ModBlocks;
import com.tardisengineer.villagecraft2essentials.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    protected void addTables() {
        // Simple LootTables
        lootTables.put(ModBlocks.RUBY_BLOCK.get(), createSimpleTable("ruby_block", ModBlocks.RUBY_BLOCK.get()));

        // Ore LootTables
        lootTables.put(ModBlocks.RUBY_ORE.get(), createSilkTouchTable("electrum_ore", ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get(), 1, 2));
        lootTables.put(ModBlocks.DEEPSLATE_RUBY_ORE.get(), createSilkTouchTable("electrum_ore", ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get(), 1, 2));
    }
}
