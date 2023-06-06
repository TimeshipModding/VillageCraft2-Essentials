package com.timeshipmodding.villagecraft2essentials.registries;

import com.timeshipmodding.villagecraft2essentials.content.item.CurrencyArmorMaterials;
import com.timeshipmodding.villagecraft2essentials.content.item.CurrencyItemTiers;
import com.timeshipmodding.villagecraft2essentials.setup.ModCreativeModeTab;
import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    // Tool Items
    public static final RegistryObject<Item> RUBY_SWORD
            = ITEMS.register("ruby_sword", () -> new SwordItem(CurrencyItemTiers.RUBY, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_SHOVEL
            = ITEMS.register("ruby_shovel", () -> new ShovelItem(CurrencyItemTiers.RUBY, 1.5F, -3.0F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_PICKAXE
            = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(CurrencyItemTiers.RUBY, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_AXE
            = ITEMS.register("ruby_axe", () -> new AxeItem(CurrencyItemTiers.RUBY, 5.0F, -3.0F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_HOE
            = ITEMS.register("ruby_hoe", () -> new PickaxeItem(CurrencyItemTiers.RUBY, -3, 0.0F, ITEM_PROPERTIES));

    // Armor Item
    public static final RegistryObject<Item> RUBY_HELMET
            = ITEMS.register("ruby_helmet", () -> new ArmorItem(CurrencyArmorMaterials.RUBY, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_CHESTPLATE
            = ITEMS.register("ruby_chestplate", () -> new ArmorItem(CurrencyArmorMaterials.RUBY, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_LEGGINGS
            = ITEMS.register("ruby_leggings", () -> new ArmorItem(CurrencyArmorMaterials.RUBY, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_BOOTS
            = ITEMS.register("ruby_boots", () -> new ArmorItem(CurrencyArmorMaterials.RUBY, EquipmentSlot.FEET, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_NETHERITE_HELMET
            = ITEMS.register("ruby_netherite_helmet", () -> new ArmorItem(CurrencyArmorMaterials.RUBY_NETHERITE, EquipmentSlot.HEAD, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_NETHERITE_CHESTPLATE
            = ITEMS.register("ruby_netherite_chestplate", () -> new ArmorItem(CurrencyArmorMaterials.RUBY_NETHERITE, EquipmentSlot.CHEST, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_NETHERITE_LEGGINGS
            = ITEMS.register("ruby_netherite_leggings", () -> new ArmorItem(CurrencyArmorMaterials.RUBY_NETHERITE, EquipmentSlot.LEGS, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_NETHERITE_BOOTS
            = ITEMS.register("ruby_netherite_boots", () -> new ArmorItem(CurrencyArmorMaterials.RUBY_NETHERITE, EquipmentSlot.FEET, ITEM_PROPERTIES));
}

