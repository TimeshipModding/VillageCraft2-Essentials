package com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.saveddata.JailSavedData;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.Entity;

import java.util.Collection;

public class AmberCavesJailCommand {
    public AmberCavesJailCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ambercaves").then(Commands.literal("jail")
                .executes(p_137817_ -> execute(p_137817_, ImmutableList.of(p_137817_.getSource().getEntityOrException())))
                        .then(
                                Commands.argument("targets", EntityArgument.entities())
                                        .executes(p_137810_ -> execute(p_137810_, EntityArgument.getEntities(p_137810_, "targets")))
                        )));
    }

    private int execute(CommandContext<CommandSourceStack> context, Collection<? extends Entity> targets) {
        MinecraftServer server = context.getSource().getServer();
        JailSavedData savedData = JailSavedData.getData(server);
        int[] jailPos = savedData.getAmberCavesJailPos();

        if(jailPos[0] != 0 && jailPos[1] != 0 && jailPos[2] != 0) {
            for (Entity entity : targets) {
                entity.teleportTo(jailPos[0], jailPos[1], jailPos[2]);
            }

            context.getSource().sendSuccess(() -> Component.literal("You have been teleported to The Amber Caves Jail!"), false);
            return 1;
        } else {
            context.getSource().sendFailure(Component.literal("No Amber Caves Jail Position has been set."));
            return -1;
        }
    }
}