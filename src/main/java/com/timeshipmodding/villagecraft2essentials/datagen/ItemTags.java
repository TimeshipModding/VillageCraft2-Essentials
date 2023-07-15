package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlockItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTags.contentsGetter(), VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // VillageCraft2 Essentials Tags
        tag(ModTags.RUBY_ORE_ITEM)
                .add(ModBlockItems.RUBY_ORE_BLOCKITEM.get())
                .add(ModBlockItems.DEEPSLATE_RUBY_ORE_BLOCKITEM.get());
    }
}