package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.common.Mod;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, VillageCraft2Essentials.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // CreativeModeTab Translations
        add("itemGroup.essentialstab1", "VillageCraft 2 Essentials");

        // Item Translations
        add(ModItems.RUBY.get(), "Ruby");

        // Tool Item Translations
        add(ModItems.RUBY_SWORD.get(), "Ruby Sword");
        add(ModItems.RUBY_SHOVEL.get(), "Ruby Shovel");
        add(ModItems.RUBY_PICKAXE.get(), "Ruby Pickaxe");
        add(ModItems.RUBY_AXE.get(), "Ruby Axe");
        add(ModItems.RUBY_HOE.get(), "Ruby Hoe");

        // Armor Item Translations
        add(ModItems.RUBY_HELMET.get(), "Ruby Helmet");
        add(ModItems.RUBY_CHESTPLATE.get(), "Ruby Chestplate");
        add(ModItems.RUBY_LEGGINGS.get(), "Ruby Leggings");
        add(ModItems.RUBY_BOOTS.get(), "Ruby Boots");
        add(ModItems.RUBY_NETHERITE_HELMET.get(), "Ruby Netherite Helmet");
        add(ModItems.RUBY_NETHERITE_CHESTPLATE.get(), "Ruby Netherite Chestplate");
        add(ModItems.RUBY_NETHERITE_LEGGINGS.get(), "Ruby Netherite Leggings");
        add(ModItems.RUBY_NETHERITE_BOOTS.get(), "Ruby Netherite Boots");

        // Block Translations
        add(ModBlocks.RUBY_ORE.get(), "Ruby Ore");
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
        add(ModBlocks.RUBY_BLOCK.get(), "Block of Ruby");
        add(ModBlocks.RUBY_ATM.get(), "Gripper City ATM");
    }
}
