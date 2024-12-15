package com.timeshipmodding.villagecraft2essentials.content.commands.grippercity;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.tags.CompoundTags;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;

import java.util.Collection;

public class GripperCityJailCommand {
    public GripperCityJailCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("grippercity").then(Commands.literal("jail")
                .executes(p_137817_ -> execute(p_137817_, ImmutableList.of(p_137817_.getSource().getEntityOrException())))
                        .then(
                                Commands.argument("targets", EntityArgument.entities())
                                        .executes(p_137810_ -> execute(p_137810_, EntityArgument.getEntities(p_137810_, "targets")))
                        )));
    }

    private int execute(CommandContext<CommandSourceStack> context, Collection<? extends Entity> targets) {
        boolean hasJailPos = CompoundTags.gripperCityJail.getIntArray("villagecraft2essentials.grippercityjailpos").length != 0;

        if(hasJailPos) {
            int[] jailPos = CompoundTags.gripperCityJail.getIntArray("villagecraft2essentials.grippercityjailpos");

            for (Entity entity : targets) {
                entity.teleportTo(jailPos[0], jailPos[1], jailPos[2]);
            }

            context.getSource().sendSuccess(() -> Component.literal("You have been teleported to The Gripper City Jail!"), false);
            return 1;
        } else {
            context.getSource().sendFailure(Component.literal("No Gripper City Jail Position has been set."));
            return -1;
        }
    }
}