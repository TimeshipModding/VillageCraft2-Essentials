package com.timeshipmodding.villagecraft2essentials.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(ITEM_PROPERTIES));

    // Tool Items
    public static final RegistryObject<SwordItem> RUBY_SWORD
            = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTiers.RUBY, 3, -2.4F, ITEM_PROPERTIES));
    public static final RegistryObject<Item> RUBY_SHOVEL
            = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTiers.RUBY, 1.5F, -3.0F, ITEM_PROPERTIES));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE
            = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTiers.RUBY, 1, -2.8F, ITEM_PROPERTIES));
    public static final RegistryObject<AxeItem> RUBY_AXE
            = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTiers.RUBY, 5.0F, -3.0F, ITEM_PROPERTIES));
    public static final RegistryObject<HoeItem> RUBY_HOE
            = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTiers.RUBY, -3, 0.0F, ITEM_PROPERTIES));

    // Armor Item
    public static final RegistryObject<ArmorItem> RUBY_HELMET
            = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE
            = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS
            = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS
            = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_NETHERITE_HELMET
            = ITEMS.register("ruby_netherite_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY_NETHERITE, ArmorItem.Type.HELMET, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_NETHERITE_CHESTPLATE
            = ITEMS.register("ruby_netherite_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY_NETHERITE, ArmorItem.Type.CHESTPLATE, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_NETHERITE_LEGGINGS
            = ITEMS.register("ruby_netherite_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY_NETHERITE, ArmorItem.Type.LEGGINGS, ITEM_PROPERTIES));
    public static final RegistryObject<ArmorItem> RUBY_NETHERITE_BOOTS
            = ITEMS.register("ruby_netherite_boots", () -> new ArmorItem(ModArmorMaterials.RUBY_NETHERITE, ArmorItem.Type.BOOTS, ITEM_PROPERTIES));
}

