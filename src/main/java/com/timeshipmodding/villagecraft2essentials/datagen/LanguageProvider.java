package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.registries.ModItems.*;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(PackOutput output, String locale) {
        super(output, VillageCraft2Essentials.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // CreativeModeTab Translations
        add("item_group.villagecraft2essentials.essentials_tab", "VillageCraft 2 Essentials");

        // Item Translations
        add(RUBY.get(), "Ruby");

        // Tool Item Translations
        add(RUBY_SWORD.get(), "Ruby Sword");
        add(RUBY_SHOVEL.get(), "Ruby Shovel");
        add(RUBY_PICKAXE.get(), "Ruby Pickaxe");
        add(RUBY_AXE.get(), "Ruby Axe");
        add(RUBY_HOE.get(), "Ruby Hoe");

        // Armor Item Translations
        add(RUBY_HELMET.get(), "Ruby Helmet");
        add(RUBY_CHESTPLATE.get(), "Ruby Chestplate");
        add(RUBY_LEGGINGS.get(), "Ruby Leggings");
        add(RUBY_BOOTS.get(), "Ruby Boots");
        add(RUBY_NETHERITE_HELMET.get(), "Ruby Netherite Helmet");
        add(RUBY_NETHERITE_CHESTPLATE.get(), "Ruby Netherite Chestplate");
        add(RUBY_NETHERITE_LEGGINGS.get(), "Ruby Netherite Leggings");
        add(RUBY_NETHERITE_BOOTS.get(), "Ruby Netherite Boots");

        // Block Translations
        add(RUBY_ORE.get(), "Ruby Ore");
        add(DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
        add(RUBY_BLOCK.get(), "Block of Ruby");
        add(RUBY_ATM.get(), "Gripper City ATM");
    }
}
