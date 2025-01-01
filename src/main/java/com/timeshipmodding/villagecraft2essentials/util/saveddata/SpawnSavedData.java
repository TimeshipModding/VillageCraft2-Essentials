package com.timeshipmodding.villagecraft2essentials.util.saveddata;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

public class SpawnSavedData extends SavedData { ;
    private int[] villagecraftCitySpawnPos = {0, 0, 0};
    private int[] gripperCitySpawnPos = {0, 0, 0};
    private int[] amberCavesSpawnPos = {0, 0, 0};

    public int[] getVillagecraftCitySpawnPos() {
        return this.villagecraftCitySpawnPos;
    }

    public int[] getGripperCitySpawnPos() {
        return this.gripperCitySpawnPos;
    }

    public int[] getAmberCavesSpawnPos() {
        return this.amberCavesSpawnPos;
    }

    public void setVillagecraftCitySpawnPos(int[] spawnPos) {
        this.villagecraftCitySpawnPos = spawnPos;
        this.setDirty();
    }

    public void setGripperCitySpawnPos(int[] spawnPos) {
        this.gripperCitySpawnPos = spawnPos;
        this.setDirty();
    }

    public void setAmberCavesSpawnPos(int[] spawnPos) {
        this.amberCavesSpawnPos = spawnPos;
        this.setDirty();
    }

    // Create new instance of saved data
    public static SpawnSavedData create() {
        return new SpawnSavedData();
    }

    // Load existing instance of saved data
    public static SpawnSavedData load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        SpawnSavedData data = create();
        data.villagecraftCitySpawnPos = tag.getIntArray("villagecraftCitySpawnPos");
        data.gripperCitySpawnPos = tag.getIntArray("gripperCitySpawnPos");
        data.amberCavesSpawnPos = tag.getIntArray("amberCavesSpawnPos");
        return data;
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider registries) {
        tag.putIntArray("villagecraftCitySpawnPos", villagecraftCitySpawnPos);
        tag.putIntArray("gripperCitySpawnPos", gripperCitySpawnPos);
        tag.putIntArray("amberCavesSpawnPos", amberCavesSpawnPos);
        return tag;
    }

    public static SpawnSavedData getData(MinecraftServer server) {
        return server.overworld().getDataStorage().computeIfAbsent(new Factory<>(SpawnSavedData::create, SpawnSavedData::load), "villagecraft2essentials_spawn_positions");
    }
}