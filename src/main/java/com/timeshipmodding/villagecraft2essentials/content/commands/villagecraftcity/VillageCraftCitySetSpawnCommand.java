package com.timeshipmodding.villagecraft2essentials.content.commands.villagecraftcity;

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

public class VillageCraftCitySetSpawnCommand {
    public VillageCraftCitySetSpawnCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("villagecraftcity").then(Commands.literal("setspawn")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        ServerLevel serverLevel = context.getSource().getLevel();
        BlockPos playerPos = player.blockPosition();
        String positionString = playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ();
        CompoundTags.villagecraftCitySpawn.putIntArray("villagecraft2essentials.villagecraftcityspawnpos",
                new int[] { playerPos.getX(), playerPos.getY(), playerPos.getZ() });

        if (serverLevel.dimension() != Level.OVERWORLD) {
            context.getSource().sendFailure(Component.literal("Can only set Villagecraft City's spawn in the overworld."));
            return 0;
        } else {
            context.getSource().sendSuccess(() -> Component.literal("Set VillageCraft City's Spawn to " + positionString), true);
            return 1;
        }
    }
}
