package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.registries.ModItems.*;

public class ItemModels extends ItemModelProvider {

    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        singleTexture(RUBY.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby"));

        // Tool Items
        singleTexture(RUBY_SWORD.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/ruby_sword"));
        singleTexture(RUBY_SHOVEL.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/ruby_shovel"));
        singleTexture(RUBY_PICKAXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/ruby_pickaxe"));
        singleTexture(RUBY_AXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/ruby_axe"));
        singleTexture(RUBY_HOE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/ruby_hoe"));

        // Armor Items
        singleTexture(RUBY_HELMET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_helmet"));
        singleTexture(RUBY_CHESTPLATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_chestplate"));
        singleTexture(RUBY_LEGGINGS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_leggings"));
        singleTexture(RUBY_BOOTS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_boots"));
        singleTexture(RUBY_NETHERITE_HELMET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_netherite_helmet"));
        singleTexture(RUBY_NETHERITE_CHESTPLATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_netherite_chestplate"));
        singleTexture(RUBY_NETHERITE_LEGGINGS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_netherite_leggings"));
        singleTexture(RUBY_NETHERITE_BOOTS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_netherite_boots"));

        // Blocks
        withExistingParent(RUBY_ORE.getId().getPath(), modLoc("block/ruby_ore"));
        withExistingParent(DEEPSLATE_RUBY_ORE.getId().getPath(), modLoc("block/deepslate_ruby_ore"));
        withExistingParent(RUBY_BLOCK.getId().getPath(), modLoc("block/ruby_block"));

        // Model Blocks
        withExistingParent(RUBY_ATM.getId().getPath(), modLoc("block/ruby_atm"));
    }
}