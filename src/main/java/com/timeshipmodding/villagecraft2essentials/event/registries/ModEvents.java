package com.timeshipmodding.villagecraft2essentials.event.registries;

import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves.AmberCavesJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves.AmberCavesSetJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves.AmberCavesSetSpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves.AmberCavesSpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.grippercity.GripperCityJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.grippercity.GripperCitySetJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.grippercity.GripperCitySetSpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.grippercity.GripperCitySpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.villagecraftcity.VillageCraftCityJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.villagecraftcity.VillageCraftCitySetJailCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.villagecraftcity.VillageCraftCitySpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.commands.villagecraftcity.VillageCraftCitySetSpawnCommand;
import com.timeshipmodding.villagecraft2essentials.content.item.registries.ModItems;
import com.timeshipmodding.villagecraft2essentials.content.villager.registries.ModVillagers;
import com.timeshipmodding.villagecraft2essentials.util.saveddata.JailSavedData;
import com.timeshipmodding.villagecraft2essentials.util.saveddata.SpawnSavedData;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;

import java.util.List;

@EventBusSubscriber(modid = VillageCraft2Essentials.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.BANKER.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.DIAMOND, 1),
                    new ItemStack(ModItems.RUBY.get(), 5), 128, 64, 0.0f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.RUBY.get(), 5),
                    new ItemStack(Items.DIAMOND, 1), 128, 64, 0.0f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.DIAMOND, 2),
                    new ItemStack(ModItems.AMBER.get(), 1), 128, 64, 0.0f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.AMBER.get(), 1),
                    new ItemStack(Items.DIAMOND, 2), 128, 64, 0.0f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.AMBER.get(), 1),
                    new ItemStack(ModItems.RUBY.get(), 10), 128, 64, 0.0f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(ModItems.RUBY.get(), 10),
                    new ItemStack(ModItems.AMBER.get(), 1), 128, 64, 0.0f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Blocks.EMERALD_BLOCK, 8),
                    new ItemStack(Items.DIAMOND, 1), 128, 64, 0.0f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Blocks.EMERALD_BLOCK, 8),
                    new ItemStack(ModItems.RUBY.get(), 5), 128, 64, 0.0f
            ));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Blocks.EMERALD_BLOCK, 16),
                    new ItemStack(ModItems.AMBER.get(), 1), 128, 64, 0.0f
            ));
        }
    }

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new AmberCavesSetJailCommand(event.getDispatcher());
        new AmberCavesJailCommand(event.getDispatcher());
        new AmberCavesSetSpawnCommand(event.getDispatcher());
        new AmberCavesSpawnCommand(event.getDispatcher());
        new GripperCitySetJailCommand(event.getDispatcher());
        new GripperCityJailCommand(event.getDispatcher());
        new GripperCitySetSpawnCommand(event.getDispatcher());
        new GripperCitySpawnCommand(event.getDispatcher());
        new VillageCraftCitySetJailCommand(event.getDispatcher());
        new VillageCraftCityJailCommand(event.getDispatcher());
        new VillageCraftCitySetSpawnCommand(event.getDispatcher());
        new VillageCraftCitySpawnCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        VillageCraft2Essentials.spawnSavedData = SpawnSavedData.getData(event.getServer());
        VillageCraft2Essentials.jailSavedData = JailSavedData.getData(event.getServer());
    }

    @SubscribeEvent
    public void onServerStopping(ServerStoppingEvent event) {
        VillageCraft2Essentials.spawnSavedData.setDirty(true);
        VillageCraft2Essentials.jailSavedData.setDirty(true);
    }
}
