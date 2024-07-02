package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class DataBlockStates extends BlockStateProvider {
    public DataBlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Block with Item
        blockWithItem(RUBY_BLOCK);
        blockWithItem(AMBER_BLOCK);

        // Drop Experience Block With Item
        dropExperienceBlockWithItem(RUBY_ORE);
        dropExperienceBlockWithItem(DEEPSLATE_RUBY_ORE);
        dropExperienceBlockWithItem(AMBER_ORE);
        dropExperienceBlockWithItem(DEEPSLATE_AMBER_ORE);
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void dropExperienceBlockWithItem(DeferredBlock<DropExperienceBlock> dropExperienceBlockRegistryObject) {
        simpleBlockWithItem(dropExperienceBlockRegistryObject.get(), cubeAll(dropExperienceBlockRegistryObject.get()));
    }
}
