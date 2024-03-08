package com.timeshipmodding.villagecraft2essentials.util;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static TagKey<Item> NETHERITE_UPGRADE_SMITHING_TEMPLATE_GEMS = tag("netherite_upgrade_smithing_template_gems");

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(new ResourceLocation(VillageCraft2Essentials.MODID, name));
    }
}
