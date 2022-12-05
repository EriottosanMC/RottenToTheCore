package io.github.eriottosanmc.rottentothecore.client.event;

import com.mojang.math.Vector3f;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.client.ClientConfig;
import io.github.eriottosanmc.rottentothecore.client.render.LightRenderer;
import io.github.eriottosanmc.rottentothecore.client.render.ThoughtsRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = RottenToTheCore.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeEventsHandler {

    // Render thoughts over other elements
    @SubscribeEvent
    public static void postOverlayRender(RenderGuiOverlayEvent.Post event) {
        if (event.getOverlay() == VanillaGuiOverlay.PLAYER_HEALTH.type()) {
            ThoughtsRenderer.render(event.getWindow(), event.getPoseStack());
        }
    }   
    
    // Gets the DynamicTexture used for render and updates the lightmap for the
    // Overworld
    @SubscribeEvent
    public static void onRenderView(ViewportEvent event) {
        Minecraft mc = Minecraft.getInstance();
        Level level = mc.level;
        if (level != null) {
            GameRenderer renderer = event.getRenderer();
            if (ClientConfig.enableLighting.get()) {
                LightTexture lt = renderer.lightTexture();
                DynamicTexture dt = lt.lightTexture;
                LightRenderer.update(lt, mc, dt);
            } else {
                LocalPlayer player = mc.player;
                if (level != null && !(player == null || level.dimension() != Level.OVERWORLD
                        || player.hasEffect(MobEffects.NIGHT_VISION)
                        || (player.hasEffect(MobEffects.CONDUIT_POWER) && player.getWaterVision() > 0))) {
                    mc.options.gamma().set(0.0);
                }
            }
        }
    }

    // Turns the sky to black on dark nights
    @SubscribeEvent
    public static void onRenderFogColours(ViewportEvent.ComputeFogColor event) {
        Minecraft mc = Minecraft.getInstance();
        Level level = mc.level;

        float time = (float) (level.getSunAngle(1.0F) > Math.PI ? 2 * Math.PI - level.getSunAngle(1.0F)
                : level.getSunAngle(1.0F));
        if (level.dimension() == Level.OVERWORLD && time > Math.PI / 2 && ClientConfig.enableLighting.get()) {
            Vector3f skyColour = new Vector3f(event.getRed(), event.getGreen(), event.getBlue());
            Vector3f darkColour = skyColour.copy();
            darkColour.mul(level.getMoonBrightness());
            float f = (float) (time >= 5 * Math.PI / 8 ? 1.0F : 4 * (2 * time - Math.PI) / Math.PI);
            skyColour.lerp(darkColour, f);
            event.setRed(skyColour.x());
            event.setGreen(skyColour.y());
            event.setBlue(skyColour.z());
        }
    }
}
