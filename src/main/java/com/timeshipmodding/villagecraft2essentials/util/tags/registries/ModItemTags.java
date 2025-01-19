package com.timeshipmodding.villagecraft2essentials.util.tags.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static TagKey<Item> MOLE_FOOD = createTag("mole_food");

    private static TagKey<Item> createTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(VillageCraft2Essentials.MODID, name));
    }
}
