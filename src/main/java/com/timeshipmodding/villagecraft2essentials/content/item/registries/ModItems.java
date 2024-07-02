package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VillageCraft2Essentials.MODID);

    // Items
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    /*public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerSimpleItem("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerSimpleItem("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerSimpleItem("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerSimpleItem("ruby_axe", () -> new AxeItem(ModToolTiers.RUBY, 5.0F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerSimpleItem("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, -3, 0.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerSimpleItem("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerSimpleItem("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerSimpleItem("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerSimpleItem("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NETHERITE_SWORD = ITEMS.registerSimpleItem("ruby_netherite_sword", () -> new SwordItem(ModToolTiers.RUBY_NETHERITE, 3, -2.4F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NETHERITE_SHOVEL = ITEMS.registerSimpleItem("ruby_netherite_shovel", () -> new ShovelItem(ModToolTiers.RUBY_NETHERITE, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NETHERITE_PICKAXE = ITEMS.registerSimpleItem("ruby_netherite_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY_NETHERITE, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NETHERITE_AXE = ITEMS.registerSimpleItem("ruby_netherite_axe", () -> new AxeItem(ModToolTiers.RUBY_NETHERITE, 5.0F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NETHERITE_HOE = ITEMS.registerSimpleItem("ruby_netherite_hoe", () -> new HoeItem(ModToolTiers.RUBY_NETHERITE, -4, 0.0F, new Item.Properties()));
    public static final DeferredItem<Item> RUBY_HORSE_ARMOR = ITEMS.registerSimpleItem("ruby_horse_armor",() -> new HorseArmorItem(11, "ruby", new Item.Properties().stacksTo(1)));*/
    public static final DeferredItem<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties()));
    /*public static final DeferredItem<Item> AMBER_SWORD = ITEMS.registerSimpleItem("amber_sword", () -> new SwordItem(ModToolTiers.AMBER, 3, -2.4F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_SHOVEL = ITEMS.registerSimpleItem("amber_shovel", () -> new ShovelItem(ModToolTiers.AMBER, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_PICKAXE = ITEMS.registerSimpleItem("amber_pickaxe", () -> new PickaxeItem(ModToolTiers.AMBER, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_AXE = ITEMS.registerSimpleItem("amber_axe", () -> new AxeItem(ModToolTiers.AMBER, 5.0F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_HOE = ITEMS.registerSimpleItem("amber_hoe", () -> new HoeItem(ModToolTiers.AMBER, -3, 0.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_HELMET = ITEMS.registerSimpleItem("amber_helmet", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_CHESTPLATE = ITEMS.registerSimpleItem("amber_chestplate", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_LEGGINGS = ITEMS.registerSimpleItem("amber_leggings", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_BOOTS = ITEMS.registerSimpleItem("amber_boots", () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_NETHERITE_SWORD = ITEMS.registerSimpleItem("amber_netherite_sword", () -> new SwordItem(ModToolTiers.AMBER_NETHERITE, 3, -2.4F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_NETHERITE_SHOVEL = ITEMS.registerSimpleItem("amber_netherite_shovel", () -> new ShovelItem(ModToolTiers.AMBER_NETHERITE, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_NETHERITE_PICKAXE = ITEMS.registerSimpleItem("amber_netherite_pickaxe", () -> new PickaxeItem(ModToolTiers.AMBER_NETHERITE, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_NETHERITE_AXE = ITEMS.registerSimpleItem("amber_netherite_axe", () -> new AxeItem(ModToolTiers.AMBER_NETHERITE, 5.0F, -3.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_NETHERITE_HOE = ITEMS.registerSimpleItem("amber_netherite_hoe", () -> new HoeItem(ModToolTiers.AMBER_NETHERITE, -4, 0.0F, new Item.Properties()));
    public static final DeferredItem<Item> AMBER_HORSE_ARMOR = ITEMS.registerSimpleItem("amber_horse_armor",() -> new HorseArmorItem(11, "amber", new Item.Properties().stacksTo(1))); */
}
