package io.github.eriottosanmc.rottentothecore.common.event;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.capability.PlayerDarkness;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = RottenToTheCore.MODID, bus = Bus.MOD)
public class CommonModEventsHandler {

	@SubscribeEvent
	public static void registerCaps(RegisterCapabilitiesEvent event) {
		event.register(PlayerDarkness.class);
	}
}