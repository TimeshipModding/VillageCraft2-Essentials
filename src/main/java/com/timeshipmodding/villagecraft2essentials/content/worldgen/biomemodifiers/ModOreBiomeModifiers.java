package com.timeshipmodding.villagecraft2essentials.content.worldgen.biomemodifiers;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.worldgen.placements.ModOrePlacements;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ORE_RUBY = registerKey("add_ore_ruby");
    public static final ResourceKey<BiomeModifier> ADD_ORE_RUBY_LARGE = registerKey("add_ore_ruby_large");
    public static final ResourceKey<BiomeModifier> ADD_ORE_RUBY_BURIED = registerKey("add_ore_ruby_buried");
    public static final ResourceKey<BiomeModifier> ADD_ORE_DRAGON_SCALE = registerKey("add_ore_dragon_scale");
    public static final ResourceKey<BiomeModifier> ADD_ORE_DRAGON_SCALE_LARGE = registerKey("add_ore_dragon_scale_large");
    public static final ResourceKey<BiomeModifier> ADD_ORE_DRAGON_SCALE_BURIED = registerKey("add_ore_dragon_scale_buried");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ORE_RUBY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_RUBY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ORE_RUBY_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_RUBY_LARGE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ORE_RUBY_BURIED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_RUBY_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ORE_DRAGON_SCALE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_DRAGON_SCALE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ORE_DRAGON_SCALE_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_DRAGON_SCALE_LARGE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ORE_DRAGON_SCALE_BURIED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModOrePlacements.ORE_DRAGON_SCALE_BURIED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(VillageCraft2Essentials.MODID, name));
    }
}
