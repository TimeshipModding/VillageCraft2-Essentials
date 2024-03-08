package com.timeshipmodding.villagecraft2essentials.content.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.*;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.ACPermits.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.GCPermits.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.permits.VCPermits.*;

public class EssentialsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "villagecraft2essentials");

    public static void init(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static final RegistryObject<CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("essentials_tab", () ->
            CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.villagecraft2essentials.essentialstab"))
            .icon(() -> new ItemStack(Blocks.BEACON))
            // Add items to tab
            .displayItems((pParametres, pOutput) -> {
                pOutput.accept(AMBER_BLOCK.get());
                pOutput.accept(RUBY_BLOCK.get());
                pOutput.accept(Blocks.DIAMOND_BLOCK);
                pOutput.accept(AMBER_ORE.get());
                pOutput.accept(DEEPSLATE_AMBER_ORE.get());
                pOutput.accept(RUBY_ORE.get());
                pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                pOutput.accept(Blocks.DIAMOND_ORE);
                pOutput.accept(Blocks.DEEPSLATE_DIAMOND_ORE);
                pOutput.accept(WHITE_ATM.get());
                pOutput.accept(AMBER_SHOVEL.get());
                pOutput.accept(AMBER_PICKAXE.get());
                pOutput.accept(AMBER_AXE.get());
                pOutput.accept(AMBER_HOE.get());
                pOutput.accept(AMBER_SWORD.get());
                pOutput.accept(RUBY_SHOVEL.get());
                pOutput.accept(RUBY_PICKAXE.get());
                pOutput.accept(RUBY_AXE.get());
                pOutput.accept(RUBY_HOE.get());
                pOutput.accept(RUBY_SWORD.get());
                pOutput.accept(DIAMOND_SHOVEL);
                pOutput.accept(DIAMOND_PICKAXE);
                pOutput.accept(DIAMOND_AXE);
                pOutput.accept(DIAMOND_HOE);
                pOutput.accept(DIAMOND_SWORD);
                pOutput.accept(AMBER_NETHERITE_SHOVEL.get());
                pOutput.accept(AMBER_NETHERITE_PICKAXE.get());
                pOutput.accept(AMBER_NETHERITE_AXE.get());
                pOutput.accept(AMBER_NETHERITE_HOE.get());
                pOutput.accept(AMBER_NETHERITE_SWORD.get());
                pOutput.accept(RUBY_NETHERITE_SHOVEL.get());
                pOutput.accept(RUBY_NETHERITE_PICKAXE.get());
                pOutput.accept(RUBY_NETHERITE_AXE.get());
                pOutput.accept(RUBY_NETHERITE_HOE.get());
                pOutput.accept(RUBY_NETHERITE_SWORD.get());
                pOutput.accept(NETHERITE_SHOVEL);
                pOutput.accept(NETHERITE_PICKAXE);
                pOutput.accept(NETHERITE_AXE);
                pOutput.accept(NETHERITE_HOE);
                pOutput.accept(NETHERITE_SWORD);
                pOutput.accept(AMBER_HELMET.get());
                pOutput.accept(AMBER_CHESTPLATE.get());
                pOutput.accept(AMBER_LEGGINGS.get());
                pOutput.accept(AMBER_BOOTS.get());
                pOutput.accept(RUBY_HELMET.get());
                pOutput.accept(RUBY_CHESTPLATE.get());
                pOutput.accept(RUBY_LEGGINGS.get());
                pOutput.accept(RUBY_BOOTS.get());
                pOutput.accept(DIAMOND_HELMET);
                pOutput.accept(DIAMOND_CHESTPLATE);
                pOutput.accept(DIAMOND_LEGGINGS);
                pOutput.accept(DIAMOND_BOOTS);
                pOutput.accept(NETHERITE_HELMET);
                pOutput.accept(NETHERITE_CHESTPLATE);
                pOutput.accept(NETHERITE_LEGGINGS);
                pOutput.accept(NETHERITE_BOOTS);
                pOutput.accept(AMBER.get());
                pOutput.accept(RUBY.get());
                pOutput.accept(DIAMOND);
                pOutput.accept(NETHERITE_INGOT);
                pOutput.accept(AC_PERMIT_1.get());
                pOutput.accept(GC_PERMIT_1.get());
                pOutput.accept(VC_PERMIT_1.get());
            })
            .build());
}