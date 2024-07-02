package com.timeshipmodding.villagecraft2essentials.content.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.*;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

import static com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials.MODID;


public class EssentialsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("essentials_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.villagecraft2essentials.essentialstab"))
            .icon(() -> new ItemStack(Blocks.BEACON))
            .displayItems((parameters, pOutput) -> {
                pOutput.accept(AMBER_BLOCK.get());
                pOutput.accept(RUBY_BLOCK.get());
                pOutput.accept(Blocks.DIAMOND_BLOCK);
                pOutput.accept(AMBER_ORE.get());
                pOutput.accept(DEEPSLATE_AMBER_ORE.get());
                pOutput.accept(RUBY_ORE.get());
                pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                pOutput.accept(Blocks.DIAMOND_ORE);
                pOutput.accept(Blocks.DEEPSLATE_DIAMOND_ORE);
                pOutput.accept(DIAMOND_SHOVEL);
                pOutput.accept(DIAMOND_PICKAXE);
                pOutput.accept(DIAMOND_AXE);
                pOutput.accept(DIAMOND_HOE);
                pOutput.accept(DIAMOND_SWORD);
                pOutput.accept(NETHERITE_SHOVEL);
                pOutput.accept(NETHERITE_PICKAXE);
                pOutput.accept(NETHERITE_AXE);
                pOutput.accept(NETHERITE_HOE);
                pOutput.accept(NETHERITE_SWORD);
                pOutput.accept(DIAMOND_HELMET);
                pOutput.accept(DIAMOND_CHESTPLATE);
                pOutput.accept(DIAMOND_LEGGINGS);
                pOutput.accept(DIAMOND_BOOTS);
                pOutput.accept(DIAMOND_HORSE_ARMOR);
                pOutput.accept(NETHERITE_HELMET);
                pOutput.accept(NETHERITE_CHESTPLATE);
                pOutput.accept(NETHERITE_LEGGINGS);
                pOutput.accept(NETHERITE_BOOTS);
                pOutput.accept(AMBER.get());
                pOutput.accept(RUBY.get());
                pOutput.accept(DIAMOND);
                pOutput.accept(NETHERITE_INGOT);
            }).build());
}
