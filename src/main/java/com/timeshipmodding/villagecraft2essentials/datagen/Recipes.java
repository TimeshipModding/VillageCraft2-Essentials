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
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(
            RUBY_ORE.get(),
            DEEPSLATE_RUBY_ORE.get());

    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Shaped Crafting for Items
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', RUBY.get()).define('!', STICK)
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .unlockedBy(getHasName(STICK), has(STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', RUBY.get()).define('!', STICK)
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .unlockedBy(getHasName(STICK), has(STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', RUBY.get()).define('!', STICK)
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .unlockedBy(getHasName(STICK), has(STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', STICK)
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .unlockedBy(getHasName(STICK), has(STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', STICK)
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .unlockedBy(getHasName(STICK), has(STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .save(consumer);

        // Shaped Crafting for Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RUBY_BLOCK.get(), 9)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY.get()), has(RUBY.get()))
                .save(consumer);

        // Shapeless Crafting for Items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY.get(), 9)
                .requires(RUBY_BLOCK.get())
                .group("villagecraft2essentials")
                .unlockedBy(getHasName(RUBY_BLOCK.get()), has(RUBY_BLOCK.get()))
                .save(consumer);

        // Ore Smelting
        oreSmelting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 200, "ruby");

        // Ore Blasting
        oreBlasting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 100, "ruby");
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