package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;

import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;

public class DataItemModels extends ItemModelProvider {
    public DataItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        basicItem(RUBY.get());
        basicItem(AMBER.get());

        // Tool Items
        handheldItem(RUBY_SWORD.get());
        handheldItem(RUBY_SHOVEL.get());
        handheldItem(RUBY_PICKAXE.get());
        handheldItem(RUBY_AXE.get());
        handheldItem(RUBY_HOE.get());
        handheldItem(AMBER_SWORD.get());
        handheldItem(AMBER_SHOVEL.get());
        handheldItem(AMBER_PICKAXE.get());
        handheldItem(AMBER_AXE.get());
        handheldItem(AMBER_HOE.get());
        handheldItem(RUBY_NETHERITE_SWORD.get());
        handheldItem(RUBY_NETHERITE_SHOVEL.get());
        handheldItem(RUBY_NETHERITE_PICKAXE.get());
        handheldItem(RUBY_NETHERITE_AXE.get());
        handheldItem(RUBY_NETHERITE_HOE.get());
        handheldItem(AMBER_NETHERITE_SWORD.get());
        handheldItem(AMBER_NETHERITE_SHOVEL.get());
        handheldItem(AMBER_NETHERITE_PICKAXE.get());
        handheldItem(AMBER_NETHERITE_AXE.get());
        handheldItem(AMBER_NETHERITE_HOE.get());

        // Armor Items
        basicItem(RUBY_HELMET.get());
        basicItem(RUBY_CHESTPLATE.get());
        basicItem(RUBY_LEGGINGS.get());
        basicItem(RUBY_BOOTS.get());
        basicItem(RUBY_HORSE_ARMOR.get());
        basicItem(AMBER_HELMET.get());
        basicItem(AMBER_CHESTPLATE.get());
        basicItem(AMBER_LEGGINGS.get());
        basicItem(AMBER_BOOTS.get());
        basicItem(AMBER_HORSE_ARMOR.get());

        // withExistingParent
        withExistingParent(MOLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    // Generate Methods
    public ItemModelBuilder handheldItem(Item item) {
        return handheldItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)));
    }

    public ItemModelBuilder handheldItem(ResourceLocation item) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath()));
    }
}
