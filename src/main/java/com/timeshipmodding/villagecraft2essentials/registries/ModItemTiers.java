package com.timeshipmodding.villagecraft2essentials.registries;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModItemTiers {
    public static final ForgeTier RUBY = new ForgeTier(3, 1561, 8.0F,
            3.0F, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));

}
