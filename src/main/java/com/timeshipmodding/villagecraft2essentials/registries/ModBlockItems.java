package com.timeshipmodding.villagecraft2essentials.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.setup.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;

public class ModBlockItems {
    private static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKITEMS.register(bus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.ESSENTIALS_TAB_1);


    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_BLOCKITEM = fromBlock(RUBY_BLOCK);
    public static final RegistryObject<Item> RUBY_ORE_BLOCKITEM = fromBlock(RUBY_ORE);
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE_BLOCKITEM = fromBlock(DEEPSLATE_RUBY_ORE);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return BLOCKITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
