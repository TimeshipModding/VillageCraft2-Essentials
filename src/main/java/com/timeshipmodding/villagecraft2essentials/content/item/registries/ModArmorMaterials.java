package com.timeshipmodding.villagecraft2essentials.content.item.registries;

import com.timeshipmodding.villagecraft2essentials.content.item.CurrencyArmorMaterial;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials {
    public static final CurrencyArmorMaterial RUBY = new CurrencyArmorMaterial(
            new int[] { 363, 528, 495, 429 },
            new int[] { 3, 8, 6, 3 },
            10,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.of(ModItems.RUBY.get()),
            "ruby",
            2.0f,
            0.0f
    );
    public static final CurrencyArmorMaterial RUBY_NETHERITE = new CurrencyArmorMaterial(
            new int[] { 407, 592, 555, 481 },
            new int[] { 3, 8, 6, 3 },
            15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            "ruby_netherite",
            3.0f,
            0.1f
    );
}
