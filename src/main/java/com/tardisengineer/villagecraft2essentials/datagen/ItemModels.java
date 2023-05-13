package com.tardisengineer.villagecraft2essentials.datagen;

import com.tardisengineer.villagecraft2essentials.VillageCraft2Essentials;
import com.tardisengineer.villagecraft2essentials.registries.ModBlocks;
import com.tardisengineer.villagecraft2essentials.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Item Textures
        singleTexture(ModItems.RUBY.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ruby"));

        // Block Textures
        withExistingParent(ModBlocks.RUBY_ORE.getId().getPath(), modLoc("item/ruby_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_RUBY_ORE.getId().getPath(), modLoc("block/deepslate_ruby_ore"));
        withExistingParent(ModBlocks.RUBY_BLOCK.getId().getPath(), modLoc("block/ruby_block"));
    }
}