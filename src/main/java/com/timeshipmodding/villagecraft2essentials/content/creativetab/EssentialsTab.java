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

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.DRAGON_SCALE_BOOTS;

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
                pOutput.accept(DRAGON_SCALE_BLOCK.get());
                pOutput.accept(RUBY_BLOCK.get());
                pOutput.accept(Blocks.DIAMOND_BLOCK);
                pOutput.accept(DRAGON_SCALE_ORE.get());
                pOutput.accept(DEEPSLATE_DRAGON_SCALE_ORE.get());
                pOutput.accept(RUBY_ORE.get());
                pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                pOutput.accept(Blocks.DIAMOND_ORE);
                pOutput.accept(Blocks.DEEPSLATE_DIAMOND_ORE);
                pOutput.accept(WHITE_ATM.get());
                pOutput.accept(DRAGON_SCALE_SHOVEL.get());
                pOutput.accept(DRAGON_SCALE_PICKAXE.get());
                pOutput.accept(DRAGON_SCALE_AXE.get());
                pOutput.accept(DRAGON_SCALE_HOE.get());
                pOutput.accept(DRAGON_SCALE_SWORD.get());
                pOutput.accept(RUBY_SHOVEL.get());
                pOutput.accept(RUBY_PICKAXE.get());
                pOutput.accept(RUBY_AXE.get());
                pOutput.accept(RUBY_HOE.get());
                pOutput.accept(RUBY_SWORD.get());
                pOutput.accept(Items.DIAMOND_SHOVEL);
                pOutput.accept(Items.DIAMOND_PICKAXE);
                pOutput.accept(Items.DIAMOND_AXE);
                pOutput.accept(Items.DIAMOND_HOE);
                pOutput.accept(Items.DIAMOND_SWORD);
                pOutput.accept(DRAGON_SCALE_HELMET.get());
                pOutput.accept(DRAGON_SCALE_CHESTPLATE.get());
                pOutput.accept(DRAGON_SCALE_LEGGINGS.get());
                pOutput.accept(DRAGON_SCALE_BOOTS.get());
                pOutput.accept(RUBY_HELMET.get());
                pOutput.accept(RUBY_CHESTPLATE.get());
                pOutput.accept(RUBY_LEGGINGS.get());
                pOutput.accept(RUBY_BOOTS.get());
                pOutput.accept(Items.DIAMOND_HELMET);
                pOutput.accept(Items.DIAMOND_CHESTPLATE);
                pOutput.accept(Items.DIAMOND_LEGGINGS);
                pOutput.accept(Items.DIAMOND_BOOTS);
                pOutput.accept(DRAGON_SCALE.get());
                pOutput.accept(RUBY.get());
                pOutput.accept(Items.DIAMOND);
            })
            .build());
}