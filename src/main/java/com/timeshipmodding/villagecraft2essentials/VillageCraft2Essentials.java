package com.timeshipmodding.villagecraft2essentials;

import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.content.creativetab.EssentialsTab;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.registries.ModEntities;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModArmorMaterials;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModPermitItems;
import com.timeshipmodding.villagecraft2essentials.content.sound.registries.ModSounds;
import com.timeshipmodding.villagecraft2essentials.content.villager.registries.ModVillagers;
import net.neoforged.fml.ModContainer;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(VillageCraft2Essentials.MODID)
public class VillageCraft2Essentials
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "villagecraft2essentials";

    public VillageCraft2Essentials(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register registry classes
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModPermitItems.ITEMS.register(modEventBus);
        ModArmorMaterials.ARMOR_MATERIALS.register(modEventBus);
        ModVillagers.POI_TYPES.register(modEventBus);
        ModVillagers.VILLAGER_PROFESSIONS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);

        // Register creative mode tab
        EssentialsTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
