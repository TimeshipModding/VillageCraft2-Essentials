package com.timeshipmodding.villagecraft2essentials.content.villager.registries;

import com.google.common.collect.ImmutableSet;
import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, VillageCraft2Essentials.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, VillageCraft2Essentials.MODID);

    public static void init(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
    // Poi Types
    public static final RegistryObject<PoiType> CURRENCY_POI = POI_TYPES.register("currency_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.WHITE_ATM.get().getStateDefinition().getPossibleStates()), 1, 1));

    // Villager Professions
    public static final RegistryObject<VillagerProfession> GEM_BANKER =
            VILLAGER_PROFESSIONS.register("gem_banker", () -> new VillagerProfession("gem_banker",
                    holder -> holder.get() == CURRENCY_POI.get(), holder -> holder.get() == CURRENCY_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));
}
