package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(VillageCraft2Essentials.MODID, "ruby"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
