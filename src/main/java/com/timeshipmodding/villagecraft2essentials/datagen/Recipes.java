package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import static net.minecraft.world.item.Items.*;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

import java.util.List;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(RUBY_ORE.get(), DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> DRAGON_SCALE_SMELTABLES = List.of(DRAGON_SCALE_ORE.get(), DEEPSLATE_DRAGON_SCALE_ORE.get());

    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Shaped Crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', RUBY.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', RUBY.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', RUBY.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', RUBY.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', RUBY.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DRAGON_SCALE_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', DRAGON_SCALE.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, DRAGON_SCALE_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', DRAGON_SCALE.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, DRAGON_SCALE_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', DRAGON_SCALE.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, DRAGON_SCALE_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', DRAGON_SCALE.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, DRAGON_SCALE_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', DRAGON_SCALE.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DRAGON_SCALE_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', DRAGON_SCALE.get()).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DRAGON_SCALE_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', DRAGON_SCALE.get()).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DRAGON_SCALE_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', DRAGON_SCALE.get()).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DRAGON_SCALE_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', DRAGON_SCALE.get()).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).save(consumer);

        // Shapeless Crafting
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY.get(), 9).requires(RUBY_BLOCK.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY_BLOCK.get()), has(RUBY_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY_BLOCK.get()).requires(RUBY.get(), 9).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DRAGON_SCALE.get(), 9).requires(DRAGON_SCALE_BLOCK.get()).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE_BLOCK.get()), has(DRAGON_SCALE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DRAGON_SCALE_BLOCK.get()).requires(DRAGON_SCALE.get(), 9).group("villagecraft2essentials").unlockedBy(getHasName(DRAGON_SCALE.get()), has(DRAGON_SCALE.get())).save(consumer);

        // Ore Smelting
        oreSmelting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 200, "ruby");
        oreSmelting(consumer, DRAGON_SCALE_SMELTABLES, RecipeCategory.MISC, DRAGON_SCALE.get(), 1.0F, 200, "dragon_scale");

        // Ore Blasting
        oreBlasting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 100, "ruby");
        oreBlasting(consumer, DRAGON_SCALE_SMELTABLES, RecipeCategory.MISC, DRAGON_SCALE.get(), 1.0F, 100, "dragon_scale");
    }

    // Generate Methods
    protected static void oreSmelting(Consumer <FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory
            pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer <FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List <ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, VillageCraft2Essentials.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}