package io.github.eriottosanmc.rottentothecore.client.render;

import java.util.List;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import io.github.eriottosanmc.rottentothecore.client.ClientConfig;
import io.github.eriottosanmc.rottentothecore.client.data.ClientThoughtsData;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.MutableComponent;

public class ThoughtsRenderer {
    public static void render(Window window, PoseStack stack) {
        if (ClientThoughtsData.displayTime > 0 && ClientConfig.enableThoughts.get()) {
            Minecraft mc = Minecraft.getInstance();
            List<MutableComponent> messages = ClientThoughtsData.getMessageSplit();
            float f = ClientThoughtsData.displayTime > 10 ? 1.0F : ClientThoughtsData.displayTime / 10F;

            for (int i = 0; i < messages.size(); i++) {
                MutableComponent message = messages.get(i);
                float width = mc.font.width(message.getVisualOrderText()) / 2;
                int mid = window.getGuiScaledWidth() / 2;
                int alpha = Math.round(f * 255);

                stack.pushPose();
                stack.translate(0.0D, 0.0D, 50.0D);
                RenderSystem.enableBlend();
                mc.font.drawShadow(stack, message, mid - width, 40 + 10 * i, 16777215 + (alpha << 24));
                RenderSystem.disableBlend();
                stack.popPose();
            }
            ClientThoughtsData.displayTime--;
        }
    }
}
