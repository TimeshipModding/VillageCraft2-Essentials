package com.timeshipmodding.villagecraft2essentials.datagen.tags;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class DataBlockTags extends BlockTagsProvider {

    public DataBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
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
                BLACK_ATM.get(),
                BLUE_ATM.get(),
                BROWN_ATM.get(),
                CYAN_ATM.get(),
                GRAY_ATM.get(),
                GREEN_ATM.get(),
                LIGHT_BLUE_ATM.get(),
                LIGHT_GRAY_ATM.get(),
                LIME_ATM.get(),
                MAGENTA_ATM.get(),
                ORANGE_ATM.get(),
                PINK_ATM.get(),
                PURPLE_ATM.get(),
                RED_ATM.get(),
                WHITE_ATM.get(),
                YELLOW_ATM.get()
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
                BLACK_ATM.get(),
                BLUE_ATM.get(),
                BROWN_ATM.get(),
                CYAN_ATM.get(),
                GRAY_ATM.get(),
                GREEN_ATM.get(),
                LIGHT_BLUE_ATM.get(),
                LIGHT_GRAY_ATM.get(),
                LIME_ATM.get(),
                MAGENTA_ATM.get(),
                ORANGE_ATM.get(),
                PINK_ATM.get(),
                PURPLE_ATM.get(),
                RED_ATM.get(),
                WHITE_ATM.get(),
                YELLOW_ATM.get()
        );
    }
}
