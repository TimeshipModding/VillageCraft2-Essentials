package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Item Textures
        singleTexture(ModItems.RUBY.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby"));

        // Tool Item Textures
        singleTexture(ModItems.RUBY_SWORD.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_sword"));
        singleTexture(ModItems.RUBY_SHOVEL.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_shovel"));
        singleTexture(ModItems.RUBY_PICKAXE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_pickaxe"));
        singleTexture(ModItems.RUBY_AXE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_axe"));
        singleTexture(ModItems.RUBY_HOE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_hoe"));

        // Armor Item Textures
        singleTexture(ModItems.RUBY_HELMET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_helmet"));
        singleTexture(ModItems.RUBY_CHESTPLATE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_chestplate"));
        singleTexture(ModItems.RUBY_LEGGINGS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_leggings"));
        singleTexture(ModItems.RUBY_BOOTS.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby_boots"));

        // Block Textures
        withExistingParent(ModBlocks.RUBY_ORE.getId().getPath(), modLoc("block/ruby_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_RUBY_ORE.getId().getPath(), modLoc("block/deepslate_ruby_ore"));
        withExistingParent(ModBlocks.RUBY_BLOCK.getId().getPath(), modLoc("block/ruby_block"));
    }
}