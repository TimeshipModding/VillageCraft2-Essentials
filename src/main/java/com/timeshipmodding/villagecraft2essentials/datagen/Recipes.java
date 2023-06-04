package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.registries.ModTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipe;

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

        // Shaped Crafting for Items
        ShapedRecipeBuilder.shaped(ModItems.RUBY_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', ModItems.RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', ModItems.RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', ModItems.RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', ModItems.RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', ModItems.RUBY.get()).define('!', Items.STICK)
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', ModItems.RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.RUBY.get())
                .group("createlectrfied")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RUBY.get()))
                .save(consumer);


        // Cooking for Furnaces
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.RUBY_ORE_ITEM), ModItems.RUBY.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.RUBY_ORE_ITEM).build()))
                .save(consumer, "ruby1");
    }
}