package com.timeshipmodding.villagecraft2essentials.content.worldgen.features;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModOreFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RUBY_SMALL = registerKey("ore_ruby_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RUBY_LARGE = registerKey("ore_ruby_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RUBY_BURIED = registerKey("ore_ruby_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DRAGON_SCALE_SMALL = registerKey("ore_dragon_scale_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DRAGON_SCALE_LARGE = registerKey("ore_dragon_scale_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DRAGON_SCALE_BURIED = registerKey("ore_dragon_scale_buried");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> rubyOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> dragonScaleOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.DRAGON_SCALE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_DRAGON_SCALE_ORE.get().defaultBlockState()));

        register(context, ORE_RUBY_SMALL, Feature.ORE, new OreConfiguration(rubyOres, 4, 0.5F));
        register(context, ORE_RUBY_LARGE, Feature.ORE, new OreConfiguration(rubyOres, 12, 0.7F));
        register(context, ORE_RUBY_BURIED, Feature.ORE, new OreConfiguration(rubyOres, 8, 1.0F));
        register(context, ORE_DRAGON_SCALE_SMALL, Feature.ORE, new OreConfiguration(dragonScaleOres, 4, 0.5F));
        register(context, ORE_DRAGON_SCALE_LARGE, Feature.ORE, new OreConfiguration(dragonScaleOres, 12, 0.7F));
        register(context, ORE_DRAGON_SCALE_BURIED, Feature.ORE, new OreConfiguration(dragonScaleOres, 8, 1.0F));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(VillageCraft2Essentials.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

