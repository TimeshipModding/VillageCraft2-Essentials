package com.timeshipmodding.villagecraft2essentials.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "villagecraft2essentials");

    public static void init(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static final RegistryObject<CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("essentials_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group.villagecraft2essentials.essentials_tab"))
            .icon(() -> new ItemStack(Blocks.BEACON))
            // Add default items to tab
            .displayItems((pParametres, pOutput) -> {
                pOutput.accept(ModBlocks.RUBY_ATM.get());
                pOutput.accept(ModItems.RUBY.get());
                pOutput.accept(ModItems.RUBY_SWORD.get());
                pOutput.accept(ModItems.RUBY_SHOVEL.get());
                pOutput.accept(ModItems.RUBY_PICKAXE.get());
                pOutput.accept(ModItems.RUBY_AXE.get());
                pOutput.accept(ModItems.RUBY_AXE.get());
                pOutput.accept(ModItems.RUBY_HOE.get());
                pOutput.accept(ModItems.RUBY_HELMET.get());
                pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                pOutput.accept(ModItems.RUBY_BOOTS.get());
                pOutput.accept(ModBlocks.RUBY_ORE.get());
                pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                pOutput.accept(ModBlocks.RUBY_BLOCK.get());
            })
            .build()
    );
}
