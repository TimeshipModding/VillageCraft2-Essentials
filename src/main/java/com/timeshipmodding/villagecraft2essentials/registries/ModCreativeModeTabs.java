package com.timeshipmodding.villagecraft2essentials.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.registries.ModItems.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "villagecraft2essentials");

    public static void init(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static final RegistryObject<CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("essentials_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group.villagecraft2essentials.essentials_tab"))
            .icon(() -> new ItemStack(Blocks.BEACON))
            // Add items to tab
            .displayItems((pParametres, pOutput) -> {
                pOutput.accept(RUBY_BLOCK.get());
                pOutput.accept(RUBY_ORE.get());
                pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                pOutput.accept(RUBY_ATM.get());
                pOutput.accept(RUBY_SHOVEL.get());
                pOutput.accept(RUBY_PICKAXE.get());
                pOutput.accept(RUBY_AXE.get());
                pOutput.accept(RUBY_HOE.get());
                pOutput.accept(RUBY_SWORD.get());
                pOutput.accept(RUBY_HELMET.get());
                pOutput.accept(RUBY_CHESTPLATE.get());
                pOutput.accept(RUBY_LEGGINGS.get());
                pOutput.accept(RUBY_BOOTS.get());
                pOutput.accept(RUBY.get());
            })
            .build()
    );
}
