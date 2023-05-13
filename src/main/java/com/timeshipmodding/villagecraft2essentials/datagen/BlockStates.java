package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, VillageCraft2Essentials.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Simple Blocks
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
    }
}
