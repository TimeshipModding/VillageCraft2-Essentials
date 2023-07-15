package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Simple Blocks
        simpleBlock(RUBY_ORE.get());
        simpleBlock(DEEPSLATE_RUBY_ORE.get());
        simpleBlock(RUBY_BLOCK.get());
    }
}
