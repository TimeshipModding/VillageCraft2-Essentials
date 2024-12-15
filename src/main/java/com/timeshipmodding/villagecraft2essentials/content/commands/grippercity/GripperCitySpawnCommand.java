package com.timeshipmodding.villagecraft2essentials.content.commands.grippercity;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.tags.CompoundTags;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class GripperCitySpawnCommand {
    public GripperCitySpawnCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("grippercity").then(Commands.literal("spawn").executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        boolean hasSpawnPos = CompoundTags.gripperCitySpawn.getIntArray("villagecraft2essentials.grippercityspawnpos").length != 0;

        if(hasSpawnPos) {
            int[] spawnPos = CompoundTags.gripperCitySpawn.getIntArray("villagecraft2essentials.grippercityspawnpos");
            player.teleportTo(spawnPos[0], spawnPos[1], spawnPos[2]);

            context.getSource().sendSuccess(() -> Component.literal("You have been teleported to Gripper City!"), false);
            return 1;
        } else {
            context.getSource().sendFailure(Component.literal("No Gripper City Spawn Position has been set."));
            return -1;
        }
    }
}
