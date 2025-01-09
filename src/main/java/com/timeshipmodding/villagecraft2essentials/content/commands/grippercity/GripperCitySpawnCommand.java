package com.timeshipmodding.villagecraft2essentials.content.commands.grippercity;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.saveddata.SpawnSavedData;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;

public class GripperCitySpawnCommand {
    public GripperCitySpawnCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("grippercity").then(Commands.literal("spawn").executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        MinecraftServer server = context.getSource().getServer();
        ServerLevel serverLevel = context.getSource().getLevel();
        SpawnSavedData savedData = SpawnSavedData.getData(server);
        int[] spawnPos = savedData.getGripperCitySpawnPos();

        if(serverLevel.dimension() == ServerLevel.OVERWORLD) {
            if(spawnPos[0] != 0 && spawnPos[1] != 0 && spawnPos[2] != 0) {
                player.teleportTo(spawnPos[0], spawnPos[1], spawnPos[2]);

                context.getSource().sendSuccess(() -> Component.literal("You have been teleported to Gripper City!"), false);
                return 1;
            } else {
                context.getSource().sendFailure(Component.literal("No Gripper City Spawn Position has been set."));
                return -1;
            }
        }
        context.getSource().sendFailure(Component.literal("Can only teleport to Gripper City's Spawn while in the overworld."));
        return -1;
    }
}
