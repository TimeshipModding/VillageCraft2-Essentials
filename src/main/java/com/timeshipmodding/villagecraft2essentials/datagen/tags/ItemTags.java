package com.timeshipmodding.villagecraft2essentials.datagen.tags;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static net.minecraft.world.item.Items.*;

import static net.minecraft.tags.ItemTags.*;
import static com.timeshipmodding.villagecraft2essentials.util.ModTags.*;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                    CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Minecraft Tags
        tag(TRIMMABLE_ARMOR).add(
                RUBY_HELMET.get(),
                RUBY_CHESTPLATE.get(),
                RUBY_LEGGINGS.get(),
                RUBY_BOOTS.get(),
                AMBER_HELMET.get(),
                AMBER_CHESTPLATE.get(),
                AMBER_LEGGINGS.get(),
                AMBER_BOOTS.get()
        );

        // VillageCraft 2 Essentials Tags
        tag(NETHERITE_UPGRADE_SMITHING_TEMPLATE_GEMS).add(
                DIAMOND,
                RUBY.get(),
                AMBER.get()
        );
    }
}
