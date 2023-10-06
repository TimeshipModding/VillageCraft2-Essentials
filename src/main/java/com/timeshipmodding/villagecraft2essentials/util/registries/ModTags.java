package com.timeshipmodding.villagecraft2essentials.util.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ModTags {
    // Block Tags
    public static final TagKey<Block> RUBY_ORE_BLOCK = TagKey.create(Registries.BLOCK, new ResourceLocation(VillageCraft2Essentials.MODID, "ruby_ore_block"));

    // Item Tags
    public static final TagKey<Item> RUBY_ORE_ITEM = TagKey.create(Registries.ITEM, new ResourceLocation(VillageCraft2Essentials.MODID, "ruby_ore_item"));
}
