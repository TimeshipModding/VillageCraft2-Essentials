package com.timeshipmodding.villagecraft2essentials.datagen.tags;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.util.registries.tags.ModBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class DataBlockTags extends BlockTagsProvider {
    public DataBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // VillageCraft 2 Essentials Tags
        this.tag(ModBlockTags.MOLES_SPAWNABLE_ON)
                .add(Blocks.DIRT)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.GRASS_BLOCK)
                .add(Blocks.GRAVEL);

        // Minecraft Tags
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RUBY_ORE.get())
                .add(DEEPSLATE_RUBY_ORE.get())
                .add(RUBY_BLOCK.get())
                .add(AMBER_ORE.get())
                .add(DEEPSLATE_AMBER_ORE.get())
                .add(AMBER_BLOCK.get())
                .add(BLACK_ATM.get())
                .add(BLUE_ATM.get())
                .add(BROWN_ATM.get())
                .add(CYAN_ATM.get())
                .add(GRAY_ATM.get())
                .add(GREEN_ATM.get())
                .add(LIGHT_BLUE_ATM.get())
                .add(LIGHT_GRAY_ATM.get())
                .add(LIME_ATM.get())
                .add(MAGENTA_ATM.get())
                .add(ORANGE_ATM.get())
                .add(PINK_ATM.get())
                .add(PURPLE_ATM.get())
                .add(RED_ATM.get())
                .add(WHITE_ATM.get())
                .add(YELLOW_ATM.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(RUBY_ORE.get())
                .add(DEEPSLATE_RUBY_ORE.get())
                .add(RUBY_BLOCK.get())
                .add(AMBER_ORE.get())
                .add(DEEPSLATE_AMBER_ORE.get())
                .add(AMBER_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BLACK_ATM.get())
                .add(BLUE_ATM.get())
                .add(BROWN_ATM.get())
                .add(CYAN_ATM.get())
                .add(GRAY_ATM.get())
                .add(GREEN_ATM.get())
                .add(LIGHT_BLUE_ATM.get())
                .add(LIGHT_GRAY_ATM.get())
                .add(LIME_ATM.get())
                .add(MAGENTA_ATM.get())
                .add(ORANGE_ATM.get())
                .add(PINK_ATM.get())
                .add(PURPLE_ATM.get())
                .add(RED_ATM.get())
                .add(WHITE_ATM.get())
                .add(YELLOW_ATM.get());
    }
}
