package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlockItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, VillageCraft2Essentials.MODID, helper);
    }

    @Override
    protected void addTags() {
        // VillageCraft2 Essentials Tags
        tag(ModTags.RUBY_ORE_ITEM)
                .add(ModBlockItems.RUBY_ORE_BLOCKITEM.get())
                .add(ModBlockItems.DEEPSLATE_RUBY_ORE_BLOCKITEM.get());
    }

    @Override
    public String getName() {
        return "VillageCraft2 Essentials Tags";
    }
}