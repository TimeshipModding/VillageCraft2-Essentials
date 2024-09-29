package com.timeshipmodding.villagecraft2essentials.util.registries.tags;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static TagKey<Item> NETHERITE_UPGRADE_SMITHING_TEMPLATE_GEMS = createTag("netherite_upgrade_smithing_template_gems");

    private static TagKey<Item> createTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(VillageCraft2Essentials.MODID, name));
    }
}
