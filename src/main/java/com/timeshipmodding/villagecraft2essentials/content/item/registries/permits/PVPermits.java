package com.timeshipmodding.villagecraft2essentials.content.item.registries.permits;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.item.PermitItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PVPermits {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VillageCraft2Essentials.MODID);

    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    // Poopville Permits
    public static final RegistryObject<Item> PV_PERMIT_1 = ITEMS.register("pv_permit_1", () -> new PermitItem(1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_2 = ITEMS.register("pv_permit_2", () -> new PermitItem(2, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_3 = ITEMS.register("pv_permit_3", () -> new PermitItem(3, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_4 = ITEMS.register("pv_permit_4", () -> new PermitItem(4, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_5 = ITEMS.register("pv_permit_5", () -> new PermitItem(5, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_6 = ITEMS.register("pv_permit_6", () -> new PermitItem(6, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_7 = ITEMS.register("pv_permit_7", () -> new PermitItem(7, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_8 = ITEMS.register("pv_permit_8", () -> new PermitItem(8, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_9 = ITEMS.register("pv_permit_9", () -> new PermitItem(9, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_10 = ITEMS.register("pv_permit_10", () -> new PermitItem(10, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_11 = ITEMS.register("pv_permit_11", () -> new PermitItem(11, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_12 = ITEMS.register("pv_permit_12", () -> new PermitItem(12, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_13 = ITEMS.register("pv_permit_13", () -> new PermitItem(13, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_14 = ITEMS.register("pv_permit_14", () -> new PermitItem(14, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_15 = ITEMS.register("pv_permit_15", () -> new PermitItem(15, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_16 = ITEMS.register("pv_permit_16", () -> new PermitItem(16, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_17 = ITEMS.register("pv_permit_17", () -> new PermitItem(17, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_18 = ITEMS.register("pv_permit_18", () -> new PermitItem(18, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_19 = ITEMS.register("pv_permit_19", () -> new PermitItem(19, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_20 = ITEMS.register("pv_permit_20", () -> new PermitItem(20, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_21 = ITEMS.register("pv_permit_21", () -> new PermitItem(21, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_22 = ITEMS.register("pv_permit_22", () -> new PermitItem(22, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_23 = ITEMS.register("pv_permit_23", () -> new PermitItem(23, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_24 = ITEMS.register("pv_permit_24", () -> new PermitItem(24, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_25 = ITEMS.register("pv_permit_25", () -> new PermitItem(25, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_26 = ITEMS.register("pv_permit_26", () -> new PermitItem(26, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_27 = ITEMS.register("pv_permit_27", () -> new PermitItem(27, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_28 = ITEMS.register("pv_permit_28", () -> new PermitItem(28, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_29 = ITEMS.register("pv_permit_29", () -> new PermitItem(29, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_30 = ITEMS.register("pv_permit_30", () -> new PermitItem(30, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_31 = ITEMS.register("pv_permit_31", () -> new PermitItem(31, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PV_PERMIT_32 = ITEMS.register("pv_permit_32", () -> new PermitItem(32, new Item.Properties().stacksTo(1)));
}
