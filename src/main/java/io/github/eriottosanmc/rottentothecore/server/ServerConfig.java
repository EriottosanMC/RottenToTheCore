package io.github.eriottosanmc.rottentothecore.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

	public static final ForgeConfigSpec SPEC;

	public static ForgeConfigSpec.BooleanValue enableMonsterInTheDarkness;
	
	static {
		ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
		setupConfig(configBuilder);
		SPEC = configBuilder.build();
	}

	private static void setupConfig(ForgeConfigSpec.Builder builder) {
		builder.comment("Use these settings to turn mod sections on/off.");
		builder.push("Set to true to enable:");
		enableMonsterInTheDarkness = builder.define("Release the creature in the darkness", true);
   		builder.pop();

		builder.comment("Use these to set custom values.");
		builder.push("Set value of:");
		builder.pop();
	}
}