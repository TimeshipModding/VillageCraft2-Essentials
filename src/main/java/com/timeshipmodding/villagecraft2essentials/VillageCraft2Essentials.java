package com.timeshipmodding.villagecraft2essentials;

import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import com.timeshipmodding.villagecraft2essentials.content.creativetab.EssentialsTab;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.event.DataGeneration;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(VillageCraft2Essentials.MODID)
public class VillageCraft2Essentials
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "villagecraft2essentials";

    public VillageCraft2Essentials(@NotNull IEventBus modEventBus)
    {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        EssentialsTab.CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(DataGeneration::gatherdata);
    }
}
