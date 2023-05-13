package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Shapeless Crafting for Items
        ShapelessRecipeBuilder.shapeless(ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .group("villagecraft2essentials")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.RUBY_BLOCK.get()))
                .save(consumer);

        // Shapeless Crafting for Blocks
        ShapelessRecipeBuilder.shapeless(ModBlocks.RUBY_BLOCK.get(), 9)
                .requires(ModItems.RUBY.get(), 9)
                .group("villagecraft2essentials")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get()))
                .save(consumer);

        // Cooking for Furnaces
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.RUBY_ORE_ITEM), ModItems.RUBY.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.RUBY_ORE_ITEM).build()))
                .save(consumer, "ruby1");
    }
}