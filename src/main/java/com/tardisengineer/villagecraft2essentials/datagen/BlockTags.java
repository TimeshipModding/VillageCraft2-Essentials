package com.tardisengineer.villagecraft2essentials.datagen;

import com.tardisengineer.villagecraft2essentials.VillageCraft2Essentials;
import com.tardisengineer.villagecraft2essentials.registries.ModBlocks;
import com.tardisengineer.villagecraft2essentials.registries.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, VillageCraft2Essentials.MODID, helper);
    }

    @Override
    protected void addTags() {
        // Minecraft Tags
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get());


        // VillageCraft2 Essnetials Tags
        tag(ModTags.RUBY_ORE_BLOCK)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());

    }
    @Override
    public String getName() {
        return "VillageCraft2 Essentials Tags";
    }
}
