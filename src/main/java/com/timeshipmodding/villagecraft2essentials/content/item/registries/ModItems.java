package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModToolTiers.RUBY, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, -3, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NETHERITE_SWORD = ITEMS.register("ruby_netherite_sword", () -> new SwordItem(ModToolTiers.RUBY_NETHERITE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NETHERITE_SHOVEL = ITEMS.register("ruby_netherite_shovel", () -> new ShovelItem(ModToolTiers.RUBY_NETHERITE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NETHERITE_PICKAXE = ITEMS.register("ruby_netherite_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY_NETHERITE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NETHERITE_AXE = ITEMS.register("ruby_netherite_axe", () -> new AxeItem(ModToolTiers.RUBY_NETHERITE, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NETHERITE_HOE = ITEMS.register("ruby_netherite_hoe", () -> new HoeItem(ModToolTiers.RUBY_NETHERITE, -4, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword", () -> new SwordItem(ModToolTiers.AMBER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel", () -> new ShovelItem(ModToolTiers.AMBER, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe", () -> new PickaxeItem(ModToolTiers.AMBER, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe", () -> new AxeItem(ModToolTiers.AMBER, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe", () -> new HoeItem(ModToolTiers.AMBER, -3, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_NETHERITE_SWORD = ITEMS.register("amber_netherite_sword", () -> new SwordItem(ModToolTiers.AMBER_NETHERITE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_NETHERITE_SHOVEL = ITEMS.register("amber_netherite_shovel", () -> new ShovelItem(ModToolTiers.AMBER_NETHERITE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_NETHERITE_PICKAXE = ITEMS.register("amber_netherite_pickaxe", () -> new PickaxeItem(ModToolTiers.AMBER_NETHERITE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_NETHERITE_AXE = ITEMS.register("amber_netherite_axe", () -> new AxeItem(ModToolTiers.AMBER_NETHERITE, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> AMBER_NETHERITE_HOE = ITEMS.register("amber_netherite_hoe", () -> new HoeItem(ModToolTiers.AMBER_NETHERITE, -4, 0.0F, new Item.Properties()));
}

