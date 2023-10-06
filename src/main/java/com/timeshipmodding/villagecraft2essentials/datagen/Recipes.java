package com.timeshipmodding.villagecraft2essentials.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static com.timeshipmodding.villagecraft2essentials.util.registries.ModTags.*;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Shapeless Crafting for Items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY.get(), 9)
                .requires(RUBY_BLOCK.get())
                .group("villagecraft2essentials")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY_BLOCK.get()))
                .save(consumer);

        // Shaped Crafting for Items
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, RUBY_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, RUBY_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get()))
                .save(consumer);

        // Shaped Crafting for Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RUBY_BLOCK.get(), 9)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', RUBY.get())
                .group("villagecraft2essentials")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RUBY.get()))
                .save(consumer);


        // Cooking for Furnaces
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RUBY_ORE_ITEM), RecipeCategory.MISC, RUBY.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(RUBY_ORE_ITEM).build()))
                .save(consumer, "ruby1");
    }
}