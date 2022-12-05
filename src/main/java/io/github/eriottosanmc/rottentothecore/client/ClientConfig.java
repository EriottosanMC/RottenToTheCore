package io.github.eriottosanmc.rottentothecore.client;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
	public static final ForgeConfigSpec SPEC;

	//Thoughts
    public static ForgeConfigSpec.BooleanValue enableThoughts;
	
    //Lighting
	public static ForgeConfigSpec.BooleanValue enableLighting;
	public static ForgeConfigSpec.IntValue noonR;
	public static ForgeConfigSpec.IntValue noonG;
	public static ForgeConfigSpec.IntValue noonB;
	public static ForgeConfigSpec.IntValue startSunsetR;
	public static ForgeConfigSpec.IntValue startSunsetG;
	public static ForgeConfigSpec.IntValue startSunsetB;
	public static ForgeConfigSpec.IntValue endSunsetR;
	public static ForgeConfigSpec.IntValue endSunsetG;
	public static ForgeConfigSpec.IntValue endSunsetB;
	public static ForgeConfigSpec.IntValue fullMoonR;
	public static ForgeConfigSpec.IntValue fullMoonG;
	public static ForgeConfigSpec.IntValue fullMoonB;
	public static ForgeConfigSpec.IntValue lightningR;
	public static ForgeConfigSpec.IntValue lightningG;
	public static ForgeConfigSpec.IntValue lightningB;
	public static ForgeConfigSpec.IntValue torchLightR;
	public static ForgeConfigSpec.IntValue torchLightG;
	public static ForgeConfigSpec.IntValue torchLightB;

	static {
		ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
		setupConfig(configBuilder);
		SPEC = configBuilder.build();
	}

	private static void setupConfig(ForgeConfigSpec.Builder builder) {
		builder.comment("Use these settings to turn mod sections on/off.");
		builder.push("Set to true to enable:");
		enableLighting = builder.define("Lighting changes", true);
		builder.pop();
		builder.push("Set to true to enable:");
		enableThoughts = builder.define("Display player thoughts", true);
		builder.pop();
		

		builder.comment("Colour settings for custom lighting");

		builder.push("Noon light colour:");
		noonR = builder.defineInRange("R", 237, 0, 256);
		noonG = builder.defineInRange("G", 215, 0, 256);
		noonB = builder.defineInRange("B", 218, 0, 256);
		builder.pop();

		builder.push("Sunset start light colour:");
		startSunsetR = builder.defineInRange("R", 219, 0, 256);
		startSunsetG = builder.defineInRange("G", 189, 0, 256);
		startSunsetB = builder.defineInRange("B", 134, 0, 256);
		builder.pop();

		builder.push("Sunset end light colour:");
		endSunsetR = builder.defineInRange("R", 147, 0, 256);
		endSunsetG = builder.defineInRange("G", 49, 0, 256);
		endSunsetB = builder.defineInRange("B", 160, 0, 256);
		builder.pop();

		builder.push("Full moon light colour:");
		fullMoonR = builder.defineInRange("R", 0, 0, 256);
		fullMoonG = builder.defineInRange("G", 60, 0, 256);
		fullMoonB = builder.defineInRange("B", 160, 0, 256);
		builder.pop();

		builder.push("Lightning light colour:");
		lightningR = builder.defineInRange("R", 186, 0, 256);
		lightningG = builder.defineInRange("G", 253, 0, 256);
		lightningB = builder.defineInRange("B", 253, 0, 256);
		builder.pop();

		builder.push("Torch light colour:");
		torchLightR = builder.defineInRange("R", 226, 0, 256);
		torchLightG = builder.defineInRange("G", 205, 0, 256);
		torchLightB = builder.defineInRange("B", 154, 0, 256);
		builder.pop();
	}
}
