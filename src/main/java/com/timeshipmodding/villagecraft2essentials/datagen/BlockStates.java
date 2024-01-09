package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Block with Item
        blockWithItem(RUBY_BLOCK);
        blockWithItem(DRAGON_SCALE_BLOCK);

        // Drop Experince Block With Item
        dropExperienceBlockWithItem(RUBY_ORE);
        dropExperienceBlockWithItem(DEEPSLATE_RUBY_ORE);
        dropExperienceBlockWithItem(DRAGON_SCALE_ORE);
        dropExperienceBlockWithItem(DEEPSLATE_DRAGON_SCALE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void dropExperienceBlockWithItem(RegistryObject<DropExperienceBlock> dropExperienceBlockRegistryObject) {
        simpleBlockWithItem(dropExperienceBlockRegistryObject.get(), cubeAll(dropExperienceBlockRegistryObject.get()));
    }
}
