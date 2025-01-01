package com.timeshipmodding.villagecraft2essentials.util.saveddata;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

public class JailSavedData extends SavedData { ;
    private int[] villagecraftCityJailPos = {0, 0, 0};
    private int[] gripperCityJailPos = {0, 0, 0};
    private int[] amberCavesJailPos = {0, 0, 0};

    public int[] getVillagecraftCityJailPos() {
        return this.villagecraftCityJailPos;
    }
    
    public int[] getGripperCityJailPos() {
        return this.gripperCityJailPos;
    }
    
    public int[] getAmberCavesJailPos() {
        return this.amberCavesJailPos;
    }

    public void setVillagecraftCityJailPos(int[] jailPos) {
        this.villagecraftCityJailPos = jailPos;
        this.setDirty();
    }

    public void setGripperCityJailPos(int[] jailPos) {
        this.gripperCityJailPos = jailPos;
        this.setDirty();
    }

    public void setAmberCavesJailPos(int[] jailPos) {
        this.amberCavesJailPos = jailPos;
        this.setDirty();
    }

    // Create new instance of saved data
    public static JailSavedData create() {
        return new JailSavedData();
    }

    // Load existing instance of saved data
    public static JailSavedData load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        JailSavedData data = create();
        data.villagecraftCityJailPos = tag.getIntArray("villagecraftCityJailPos");
        data.gripperCityJailPos = tag.getIntArray("gripperCityJailPos");
        data.amberCavesJailPos = tag.getIntArray("amberCavesJailPos");
        return data;
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider registries) {
        tag.putIntArray("villagecraftCityJailPos", villagecraftCityJailPos);
        tag.putIntArray("gripperCityJailPos", gripperCityJailPos);
        tag.putIntArray("amberCavesJailPos", amberCavesJailPos);
        return tag;
    }

    public static JailSavedData getData(MinecraftServer server) {
        return server.overworld().getDataStorage().computeIfAbsent(new Factory<>(JailSavedData::create, JailSavedData::load), "villagecraft2essentials_jail_positions");
    }
}