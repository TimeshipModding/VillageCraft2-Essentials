package com.timeshipmodding.villagecraft2essentials.content.block.registries;


import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(VillageCraft2Essentials.MODID);

    // Blocks
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<DropExperienceBlock> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final DeferredBlock<Block> AMBER_BLOCK = registerBlock("amber_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final DeferredBlock<DropExperienceBlock> AMBER_ORE = registerBlock("amber_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    /*public static final RegistryObject<AtmBlock> BLACK_ATM = registerBlock("black_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> BLUE_ATM = registerBlock("blue_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> BROWN_ATM = registerBlock("brown_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> CYAN_ATM = registerBlock("cyan_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> GRAY_ATM = registerBlock("gray_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> GREEN_ATM = registerBlock("green_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> LIGHT_BLUE_ATM = registerBlock("light_blue_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> LIME_ATM = registerBlock("lime_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> LIGHT_GRAY_ATM = registerBlock("light_gray_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> MAGENTA_ATM = registerBlock("magenta_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> ORANGE_ATM = registerBlock("orange_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> PINK_ATM = registerBlock("pink_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> PURPLE_ATM = registerBlock("purple_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> RED_ATM = registerBlock("red_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> WHITE_ATM = registerBlock("white_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).noOcclusion()));
    public static final RegistryObject<AtmBlock> YELLOW_ATM = registerBlock("yellow_atm", () -> new AtmBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).noOcclusion()));*/

    // Register Methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
