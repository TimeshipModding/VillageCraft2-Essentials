package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;

public class ModBlockItems {
    private static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init(IEventBus modEventBus) {
        BLOCKITEMS.register(modEventBus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();


    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_BLOCKITEM = fromBlock(RUBY_BLOCK);
    public static final RegistryObject<Item> RUBY_ORE_BLOCKITEM = fromBlock(RUBY_ORE);
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE_BLOCKITEM = fromBlock(DEEPSLATE_RUBY_ORE);

    // Model BlockItems
    public static final RegistryObject<Item> RUBY_ATM_BLOCKITEM = fromBlock(RUBY_ATM);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return BLOCKITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}