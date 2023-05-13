package com.timeshipmodding.villagecraft2essentials.registries;

import com.timeshipmodding.villagecraft2essentials.setup.ModCreativeModeTab;
import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.villagecraft2essentials.registries.ModBlocks.*;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.ESSENTIALS_TAB_1);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(ITEM_PROPERTIES));

    //BlockItems
    public static final RegistryObject<Item> RUBY_BLOCK_BLOCKITEM = fromBlock(RUBY_BLOCK);

    public static final RegistryObject<Item> RUBY_ORE_BLOCKITEM = fromBlock(RUBY_ORE);
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE_BLOCKITEM = fromBlock(DEEPSLATE_RUBY_ORE);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}

