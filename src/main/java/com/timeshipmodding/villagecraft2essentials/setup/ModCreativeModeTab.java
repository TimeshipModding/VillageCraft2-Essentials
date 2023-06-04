package com.timeshipmodding.villagecraft2essentials.setup;

import com.simibubi.create.AllBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ESSENTIALS_TAB_1 = new CreativeModeTab("essentialstab1") {
        @Override
        public ItemStack makeIcon() {
            // CreativeModeTab Icon
            return new ItemStack(AllBlocks.FLUID_VALVE.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            // CreativeModeTab Organization
            pItems.add(new ItemStack(ModItems.RUBY.get()));
            pItems.add(new ItemStack(ModItems.RUBY_SWORD.get()));
            pItems.add(new ItemStack(ModItems.RUBY_SHOVEL.get()));
            pItems.add(new ItemStack(ModItems.RUBY_PICKAXE.get()));
            pItems.add(new ItemStack(ModItems.RUBY_AXE.get()));
            pItems.add(new ItemStack(ModItems.RUBY_HOE.get()));
            pItems.add(new ItemStack(ModItems.RUBY_HELMET.get()));
            pItems.add(new ItemStack(ModItems.RUBY_CHESTPLATE.get()));
            pItems.add(new ItemStack(ModItems.RUBY_LEGGINGS.get()));
            pItems.add(new ItemStack(ModItems.RUBY_BOOTS.get()));
            pItems.add(new ItemStack(ModBlocks.RUBY_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.DEEPSLATE_RUBY_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.RUBY_BLOCK.get()));
        }
    };
}
