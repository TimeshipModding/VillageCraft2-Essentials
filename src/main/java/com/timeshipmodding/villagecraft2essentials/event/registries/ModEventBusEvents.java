package com.timeshipmodding.villagecraft2essentials.event.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.entity.MoleEntity;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.models.MoleModel;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.registries.ModEntities;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.registries.ModModelLayers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = VillageCraft2Essentials.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MOLE, MoleModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MOLE.get(), MoleEntity.createAttributes().build());
    }
}
