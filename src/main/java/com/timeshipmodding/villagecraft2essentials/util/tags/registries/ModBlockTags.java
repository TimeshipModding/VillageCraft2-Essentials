package com.timeshipmodding.villagecraft2essentials.util.tags.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    public static final TagKey<Block> ATMS = createTag("atms");
    public static final TagKey<Block> MOLES_SPAWNABLE_ON = createTag("moles_spawnable_on");

    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(VillageCraft2Essentials.MODID, name));
    }
}
