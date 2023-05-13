package com.tardisengineer.villagecraft2essentials.datagen;

import com.tardisengineer.villagecraft2essentials.VillageCraft2Essentials;
import com.tardisengineer.villagecraft2essentials.registries.ModItems;
import com.tardisengineer.villagecraft2essentials.registries.ModTags;
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
                .add(ModItems.RUBY_ORE_BLOCKITEM.get())
                .add(ModItems.DEEPSLATE_RUBY_ORE_BLOCKITEM.get());
    }

    @Override
    public String getName() {
        return "VillageCraft2 Essentials Tags";
    }
}