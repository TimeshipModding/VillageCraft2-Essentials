package com.timeshipmodding.villagecraft2essentials.content.entity.client.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.timeshipmodding.villagecraft2essentials.VillageCraft2Essentials;
import com.timeshipmodding.villagecraft2essentials.content.entity.MoleEntity;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.models.MoleModel;
import com.timeshipmodding.villagecraft2essentials.content.entity.client.registries.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MoleRenderer extends MobRenderer<MoleEntity, MoleModel> {
    public MoleRenderer(EntityRendererProvider.Context context) {
        super(context, new MoleModel(context.bakeLayer(ModModelLayers.MOLE)), 0.75f);
    }

    @Override
    public ResourceLocation getTextureLocation(MoleEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(VillageCraft2Essentials.MODID, "textures/entity/mole/mole.png");
    }

    @Override
    public void render(MoleEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
