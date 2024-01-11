package com.timeshipmodding.villagecraft2essentials.content.worldgen.placements;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.worldgen.features.ModOreFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacements {
    public static final ResourceKey<PlacedFeature> ORE_RUBY = registerKey("ore_ruby");
    public static final ResourceKey<PlacedFeature> ORE_RUBY_LARGE = registerKey("ore_ruby_large");
    public static final ResourceKey<PlacedFeature> ORE_RUBY_BURIED = registerKey("ore_ruby_buried");
    public static final ResourceKey<PlacedFeature> ORE_DRAGON_SCALE = registerKey("ore_dragon_scale");
    public static final ResourceKey<PlacedFeature> ORE_DRAGON_SCALE_LARGE = registerKey("ore_dragon_scale_large");
    public static final ResourceKey<PlacedFeature> ORE_DRAGON_SCALE_BURIED = registerKey("ore_dragon_scale_buried");

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ORE_RUBY, configuredFeatures.getOrThrow(ModOreFeatures.ORE_RUBY_SMALL),
                ModOrePlacements.commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ORE_RUBY_LARGE, configuredFeatures.getOrThrow(ModOreFeatures.ORE_RUBY_LARGE),
                ModOrePlacements.rareOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ORE_RUBY_BURIED, configuredFeatures.getOrThrow(ModOreFeatures.ORE_RUBY_BURIED),
                ModOrePlacements.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ORE_DRAGON_SCALE, configuredFeatures.getOrThrow(ModOreFeatures.ORE_DRAGON_SCALE_SMALL),
                ModOrePlacements.commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ORE_DRAGON_SCALE_LARGE, configuredFeatures.getOrThrow(ModOreFeatures.ORE_DRAGON_SCALE_LARGE),
                ModOrePlacements.rareOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ORE_DRAGON_SCALE_BURIED, configuredFeatures.getOrThrow(ModOreFeatures.ORE_DRAGON_SCALE_BURIED),
                ModOrePlacements.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VillageCraft2Essentials.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
