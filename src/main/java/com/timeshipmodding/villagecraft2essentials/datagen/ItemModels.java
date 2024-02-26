package com.timeshipmodding.villagecraft2essentials.datagen;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

import static com.timeshipmodding.villagecraft2essentials.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.*;
import static com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems.DRAGON_SCALE_NETHERITE_SWORD;

public class ItemModels extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VillageCraft2Essentials.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        simpleItem(RUBY);
        simpleItem(DRAGON_SCALE);

        // Handheld Items
        handheldItem(RUBY_SWORD);
        handheldItem(RUBY_SHOVEL);
        handheldItem(RUBY_PICKAXE);
        handheldItem(RUBY_AXE);
        handheldItem(RUBY_HOE);
        handheldItem(DRAGON_SCALE_SWORD);
        handheldItem(DRAGON_SCALE_SHOVEL);
        handheldItem(DRAGON_SCALE_PICKAXE);
        handheldItem(DRAGON_SCALE_AXE);
        handheldItem(DRAGON_SCALE_HOE);
        handheldItem(DRAGON_SCALE_NETHERITE_SWORD);
        handheldItem(DRAGON_SCALE_NETHERITE_SHOVEL);
        handheldItem(DRAGON_SCALE_NETHERITE_PICKAXE);
        handheldItem(DRAGON_SCALE_NETHERITE_AXE);
        handheldItem(DRAGON_SCALE_NETHERITE_HOE);

        // Armor Items
        trimmedArmorItem(RUBY_HELMET);
        trimmedArmorItem(RUBY_CHESTPLATE);
        trimmedArmorItem(RUBY_LEGGINGS);
        trimmedArmorItem(RUBY_BOOTS);
        trimmedArmorItem(DRAGON_SCALE_HELMET);
        trimmedArmorItem(DRAGON_SCALE_CHESTPLATE);
        trimmedArmorItem(DRAGON_SCALE_LEGGINGS);
        trimmedArmorItem(DRAGON_SCALE_BOOTS);
        trimmedArmorItem(DRAGON_SCALE_NETHERITE_HELMET);
        trimmedArmorItem(DRAGON_SCALE_NETHERITE_CHESTPLATE);
        trimmedArmorItem(DRAGON_SCALE_NETHERITE_LEGGINGS);
        trimmedArmorItem(DRAGON_SCALE_NETHERITE_BOOTS);
    }

    private ItemModelBuilder modelBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(VillageCraft2Essentials.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VillageCraft2Essentials.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(VillageCraft2Essentials.MODID, "item/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MODID = VillageCraft2Essentials.MODID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MODID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath);
                ResourceLocation trimNameResLoc = new ResourceLocation(MODID, currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MODID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }



}