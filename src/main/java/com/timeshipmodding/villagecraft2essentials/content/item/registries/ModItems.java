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
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_SWORD = ITEMS.register("dragon_scale_sword", () -> new SwordItem(ModToolTiers.DRAGON_SCALE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_SHOVEL = ITEMS.register("dragon_scale_shovel", () -> new ShovelItem(ModToolTiers.DRAGON_SCALE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_PICKAXE = ITEMS.register("dragon_scale_pickaxe", () -> new PickaxeItem(ModToolTiers.DRAGON_SCALE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_AXE = ITEMS.register("dragon_scale_axe", () -> new AxeItem(ModToolTiers.DRAGON_SCALE, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_HOE = ITEMS.register("dragon_scale_hoe", () -> new HoeItem(ModToolTiers.DRAGON_SCALE, -3, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_HELMET = ITEMS.register("dragon_scale_helmet", () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_CHESTPLATE = ITEMS.register("dragon_scale_chestplate", () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_LEGGINGS = ITEMS.register("dragon_scale_leggings", () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE_BOOTS = ITEMS.register("dragon_scale_boots", () -> new ArmorItem(ModArmorMaterials.DRAGON_SCALE, ArmorItem.Type.BOOTS, new Item.Properties()));
}

