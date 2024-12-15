package com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.tags.CompoundTags;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class AmberCavesSpawnCommand {
    public AmberCavesSpawnCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ambercaves").then(Commands.literal("spawn").executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        boolean hasSpawnPos = CompoundTags.amberCavesSpawn.getIntArray("villagecraft2essentials.ambercavesspawnpos").length != 0;

        if(hasSpawnPos) {
            int[] spawnPos = CompoundTags.amberCavesSpawn.getIntArray("villagecraft2essentials.ambercavesspawnpos");
            player.teleportTo(spawnPos[0], spawnPos[1], spawnPos[2]);

            context.getSource().sendSuccess(() -> Component.literal("You have been teleported to The Amber Caves!"), false);
            return 1;
        } else {
            context.getSource().sendFailure(Component.literal("No Amber Caves Spawn Position has been set."));
            return -1;
        }
    }
}
