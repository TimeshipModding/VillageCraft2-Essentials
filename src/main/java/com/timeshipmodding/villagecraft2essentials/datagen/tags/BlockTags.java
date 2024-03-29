package com.timeshipmodding.villagecraft2essentials.datagen.tags;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Minecraft Tags
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(
                RUBY_ORE.get(),
                DEEPSLATE_RUBY_ORE.get(),
                RUBY_BLOCK.get(),
                AMBER_ORE.get(),
                DEEPSLATE_AMBER_ORE.get(),
                AMBER_BLOCK.get(),
                WHITE_ATM.get()
        );

        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(
                RUBY_ORE.get(),
                DEEPSLATE_RUBY_ORE.get(),
                RUBY_BLOCK.get(),
                AMBER_ORE.get(),
                DEEPSLATE_AMBER_ORE.get(),
                AMBER_BLOCK.get()
        );

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(
                WHITE_ATM.get()
        );
    }
}
