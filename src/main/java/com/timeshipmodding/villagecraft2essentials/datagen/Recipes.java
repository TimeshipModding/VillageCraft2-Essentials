package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.RUBY_NETHERITE_HOE;
import static net.minecraft.world.item.Items.*;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.GCPermits.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.ACPermits.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.VCPermits.*;

import static com.timeshipmodding.villagecraft2essentials.util.ModTags.*;

import java.util.List;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(RUBY_ORE.get(), DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> AMBER_SMELTABLES = List.of(AMBER_ORE.get(), DEEPSLATE_AMBER_ORE.get());

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
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AMBER_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("!")
                .define('#', AMBER.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AMBER_SHOVEL.get())
                .pattern("#")
                .pattern("!")
                .pattern("!")
                .define('#', AMBER.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AMBER_PICKAXE.get())
                .pattern("###")
                .pattern(" ! ")
                .pattern(" ! ")
                .define('#', AMBER.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AMBER_AXE.get())
                .pattern("##")
                .pattern("#!")
                .pattern(" !")
                .define('#', AMBER.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AMBER_HOE.get())
                .pattern("##")
                .pattern(" !")
                .pattern(" !")
                .define('#', AMBER.get()).define('!', STICK).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).unlockedBy(getHasName(STICK), has(STICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AMBER_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', AMBER.get()).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AMBER_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', AMBER.get()).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AMBER_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', AMBER.get()).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AMBER_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', AMBER.get()).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, WHITE_ATM.get())
                .pattern("#!#")
                .pattern("#y#")
                .pattern("#x#")
                .define('#', Blocks.WHITE_CONCRETE).define('!', Blocks.REDSTONE_TORCH).define('y', Blocks.HOPPER).define('x', IRON_INGOT).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);

        // Shapeless Crafting
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY.get(), 9).requires(RUBY_BLOCK.get()).group("villagecraft2essentials").unlockedBy(getHasName(RUBY_BLOCK.get()), has(RUBY_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RUBY_BLOCK.get()).requires(RUBY.get(), 9).group("villagecraft2essentials").unlockedBy(getHasName(RUBY.get()), has(RUBY_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AMBER.get(), 9).requires(AMBER_BLOCK.get()).group("villagecraft2essentials").unlockedBy(getHasName(AMBER_BLOCK.get()), has(AMBER_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AMBER_BLOCK.get()).requires(AMBER.get(), 9).group("villagecraft2essentials").unlockedBy(getHasName(AMBER.get()), has(AMBER.get())).save(consumer);

        // Shapeless Crafting for Permits
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_2.get()).requires(GC_PERMIT_1.get(), 2).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_3.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_2.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_4.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_3.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_5.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_4.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_6.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_5.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_7.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_6.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_8.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_7.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_9.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_8.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_10.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_9.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_11.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_10.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_12.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_11.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_13.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_12.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_14.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_13.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_15.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_14.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_16.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_15.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_17.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_16.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_18.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_17.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_19.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_18.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_20.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_19.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_21.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_20.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_22.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_21.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_23.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_22.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_24.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_23.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_25.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_24.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_26.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_25.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_27.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_26.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_28.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_27.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_29.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_28.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_30.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_29.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_31.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_30.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GC_PERMIT_32.get()).requires(GC_PERMIT_1.get()).requires(GC_PERMIT_31.get()).group("villagecraft2essentials").unlockedBy(getHasName(GC_PERMIT_1.get()), has(GC_PERMIT_1.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_2.get()).requires(AC_PERMIT_1.get(), 2).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_3.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_2.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_4.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_3.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_5.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_4.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_6.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_5.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_7.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_6.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_8.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_7.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_9.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_8.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_10.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_9.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_11.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_10.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_12.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_11.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_13.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_12.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_14.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_13.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_15.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_14.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_16.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_15.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_17.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_16.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_18.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_17.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_19.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_18.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_20.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_19.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_21.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_20.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_22.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_21.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_23.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_22.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_24.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_23.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_25.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_24.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_26.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_25.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_27.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_26.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_28.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_27.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_29.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_28.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_30.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_29.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_31.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_30.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AC_PERMIT_32.get()).requires(AC_PERMIT_1.get()).requires(AC_PERMIT_31.get()).group("villagecraft2essentials").unlockedBy(getHasName(AC_PERMIT_1.get()), has(AC_PERMIT_1.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_2.get()).requires(VC_PERMIT_1.get(), 2).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_3.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_2.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_4.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_3.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_5.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_4.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_6.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_5.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_7.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_6.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_8.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_7.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_9.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_8.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_10.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_9.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_11.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_10.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_12.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_11.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_13.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_12.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_14.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_13.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_15.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_14.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_16.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_15.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_17.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_16.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_18.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_17.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_19.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_18.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_20.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_19.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_21.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_20.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_22.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_21.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_23.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_22.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_24.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_23.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_25.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_24.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_26.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_25.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_27.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_26.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_28.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_27.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_29.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_28.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_30.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_29.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_31.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_30.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VC_PERMIT_32.get()).requires(VC_PERMIT_1.get()).requires(VC_PERMIT_31.get()).group("villagecraft2essentials").unlockedBy(getHasName(VC_PERMIT_1.get()), has(VC_PERMIT_1.get())).save(consumer);

        // Ore Smelting
        oreSmelting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 200, "ruby");
        oreSmelting(consumer, AMBER_SMELTABLES, RecipeCategory.MISC, AMBER.get(), 1.0F, 200, "amber");

        // Ore Blasting
        oreBlasting(consumer, RUBY_SMELTABLES, RecipeCategory.MISC, RUBY.get(), 1.0F, 100, "ruby");
        oreBlasting(consumer, AMBER_SMELTABLES, RecipeCategory.MISC, AMBER.get(), 1.0F, 100, "amber");

        // Netherite Smithing
        netheriteSmithing(consumer, AMBER_AXE.get(), RecipeCategory.TOOLS, AMBER_NETHERITE_AXE.get());
        netheriteSmithing(consumer, AMBER_HOE.get(), RecipeCategory.TOOLS, AMBER_NETHERITE_HOE.get());
        netheriteSmithing(consumer, AMBER_PICKAXE.get(), RecipeCategory.TOOLS, AMBER_NETHERITE_PICKAXE.get());
        netheriteSmithing(consumer, AMBER_SHOVEL.get(), RecipeCategory.TOOLS, AMBER_NETHERITE_SHOVEL.get());
        netheriteSmithing(consumer, AMBER_SWORD.get(), RecipeCategory.TOOLS, AMBER_NETHERITE_SWORD.get());
        netheriteSmithing(consumer, RUBY_AXE.get(), RecipeCategory.TOOLS, RUBY_NETHERITE_AXE.get());
        netheriteSmithing(consumer, RUBY_HOE.get(), RecipeCategory.TOOLS, RUBY_NETHERITE_HOE.get());
        netheriteSmithing(consumer, RUBY_PICKAXE.get(), RecipeCategory.TOOLS, RUBY_NETHERITE_PICKAXE.get());
        netheriteSmithing(consumer, RUBY_SHOVEL.get(), RecipeCategory.TOOLS, RUBY_NETHERITE_SHOVEL.get());
        netheriteSmithing(consumer, RUBY_SWORD.get(), RecipeCategory.TOOLS, RUBY_NETHERITE_SWORD.get());

        // Ruby and Amber Netherite Armor Smithing
        amberNetheriteArmorSmithing(consumer, RUBY_HELMET.get(), RecipeCategory.TOOLS, NETHERITE_HELMET);
        amberNetheriteArmorSmithing(consumer, RUBY_CHESTPLATE.get(), RecipeCategory.TOOLS, NETHERITE_CHESTPLATE);
        amberNetheriteArmorSmithing(consumer, RUBY_LEGGINGS.get(), RecipeCategory.TOOLS, NETHERITE_LEGGINGS);
        amberNetheriteArmorSmithing(consumer, RUBY_BOOTS.get(), RecipeCategory.TOOLS, NETHERITE_BOOTS);
        rubyNetheriteArmorSmithing(consumer, AMBER_HELMET.get(), RecipeCategory.TOOLS, NETHERITE_HELMET);
        rubyNetheriteArmorSmithing(consumer, AMBER_CHESTPLATE.get(), RecipeCategory.TOOLS, NETHERITE_CHESTPLATE);
        rubyNetheriteArmorSmithing(consumer, AMBER_LEGGINGS.get(), RecipeCategory.TOOLS, NETHERITE_LEGGINGS);
        rubyNetheriteArmorSmithing(consumer, AMBER_BOOTS.get(), RecipeCategory.TOOLS, NETHERITE_BOOTS);

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

    protected static void amberNetheriteArmorSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(pIngredientItem), Ingredient.of(Items.NETHERITE_INGOT), pCategory, pResultItem).unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "amber_smithing");
    }

    protected static void rubyNetheriteArmorSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(pIngredientItem), Ingredient.of(Items.NETHERITE_INGOT), pCategory, pResultItem).unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "ruby_smithing");
    }
}