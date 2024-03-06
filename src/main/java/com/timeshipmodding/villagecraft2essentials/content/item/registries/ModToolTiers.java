package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(VillageCraft2Essentials.MODID, "ruby"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final Tier RUBY_NETHERITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),
            new ResourceLocation(VillageCraft2Essentials.MODID, "ruby_netherite"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    public static final Tier AMBER = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AMBER.get())),
            new ResourceLocation(VillageCraft2Essentials.MODID, "amber"), List.of(Tiers.IRON), List.of(ModToolTiers.RUBY));
    public static final Tier AMBER_NETHERITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),
            new ResourceLocation(VillageCraft2Essentials.MODID, "amber_netherite"), List.of(Tiers.DIAMOND), List.of(ModToolTiers.RUBY_NETHERITE));
}
