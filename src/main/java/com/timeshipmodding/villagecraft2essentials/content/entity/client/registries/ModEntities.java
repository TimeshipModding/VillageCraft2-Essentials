package com.timeshipmodding.villagecraft2essentials.content.entity.client.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.entity.MoleEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, VillageCraft2Essentials.MODID);

    public static final Supplier<EntityType<MoleEntity>> MOLE = ENTITY_TYPES.register("mole", () -> EntityType.Builder.of(MoleEntity::new, MobCategory.CREATURE).sized(0.75f, 0.95f).build("mole"));
}
