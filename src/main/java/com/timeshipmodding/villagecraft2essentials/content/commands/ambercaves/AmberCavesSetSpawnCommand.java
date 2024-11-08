package com.timeshipmodding.villagecraft2essentials.content.commands.ambercaves;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.timeshipmodding.villagecraft2essentials.util.tags.CompoundTags;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;

public class AmberCavesSetSpawnCommand {
    public AmberCavesSetSpawnCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ambercaves").then(Commands.literal("setspawn")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        ServerLevel serverLevel = context.getSource().getLevel();
        BlockPos playerPos = player.blockPosition();
        String positionString = playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ();
        CompoundTags.villagecraftcity.putIntArray("villagecraft2essentials.ambercavesspawnpos",
                new int[] { playerPos.getX(), playerPos.getY(), playerPos.getZ() });

        if (serverLevel.dimension() != Level.OVERWORLD) {
            context.getSource().sendFailure(Component.literal("Can only set Amber Caves' spawn in the overworld."));
            return 0;
        } else {
            context.getSource().sendSuccess(() -> Component.literal("Set Amber Caves' Spawn to " + positionString), true);
            return 1;
        }
    }
}
