package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModBlockItems.*;
import static com.timeshipmodding.villagecraft2essentials.util.registries.ModTags.*;
import static net.minecraft.tags.ItemTags.*;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTags.contentsGetter(), VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Minecraft Tags
        tag(TRIMMABLE_ARMOR).add(
                RUBY_HELMET.get(),
                RUBY_CHESTPLATE.get(),
                RUBY_LEGGINGS.get(),
                RUBY_BOOTS.get(),
                RUBY_NETHERITE_HELMET.get(),
                RUBY_NETHERITE_CHESTPLATE.get(),
                RUBY_NETHERITE_LEGGINGS.get(),
                RUBY_NETHERITE_BOOTS.get());

        // VillageCraft 2 Essentials Tags
        tag(RUBY_ORE_ITEM).add(
                RUBY_ORE_BLOCKITEM.get(),
                DEEPSLATE_RUBY_ORE_BLOCKITEM.get());
    }
}