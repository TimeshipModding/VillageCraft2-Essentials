package com.timeshipmodding.villagecraft2essentials.content.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PermitItem extends Item {
    public int pTooltip;

    public PermitItem(int pTooltip, Properties pProperties) {
        super(pProperties);
        this.pTooltip = pTooltip;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(pTooltip == 1) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_1"));
        } else if (pTooltip == 2) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_2"));
        } else if (pTooltip == 3) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_3"));
        } else if (pTooltip == 4) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_4"));
        } else if (pTooltip == 5) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_5"));
        } else if (pTooltip == 6) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_6"));
        } else if (pTooltip == 7) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_7"));
        } else if (pTooltip == 8) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_8"));
        } else if (pTooltip == 9) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_9"));
        } else if (pTooltip == 10) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_10"));
        } else if (pTooltip == 11) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_11"));
        } else if (pTooltip == 12) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_12"));
        } else if (pTooltip == 13) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_13"));
        } else if (pTooltip == 14) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_14"));
        } else if (pTooltip == 15) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_15"));
        } else if (pTooltip == 16) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_16"));
        } else if (pTooltip == 17) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_17"));
        } else if (pTooltip == 18) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_18"));
        } else if (pTooltip == 19) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_19"));
        } else if (pTooltip == 20) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_20"));
        } else if (pTooltip == 21) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_21"));
        } else if (pTooltip == 22) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_22"));
        } else if (pTooltip == 23) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_23"));
        } else if (pTooltip == 24) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_24"));
        } else if (pTooltip == 25) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_25"));
        } else if (pTooltip == 26) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_26"));
        } else if (pTooltip == 27) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_27"));
        } else if (pTooltip == 28) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_28"));
        } else if (pTooltip == 29) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_29"));
        } else if (pTooltip == 30) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_30"));
        } else if (pTooltip == 31) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_31"));
        } else if (pTooltip == 32) {pTooltipComponents.add(Component.translatable("tooltip.villagecraft2essentials.permit_tooltip_32"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
