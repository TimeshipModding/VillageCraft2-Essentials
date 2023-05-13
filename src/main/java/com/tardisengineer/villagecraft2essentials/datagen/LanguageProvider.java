package com.tardisengineer.villagecraft2essentials.datagen;

import com.tardisengineer.villagecraft2essentials.VillageCraft2Essentials;
import com.tardisengineer.villagecraft2essentials.registries.ModBlocks;
import com.tardisengineer.villagecraft2essentials.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.common.Mod;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, VillageCraft2Essentials.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // Item Translations
        add(ModItems.RUBY.get(), "Ruby");

        // Block Translations
        add(ModBlocks.RUBY_ORE.get(), "Ruby Ore");
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
        add(ModBlocks.RUBY_BLOCK.get(), "Block of Ruby");
    }
}
