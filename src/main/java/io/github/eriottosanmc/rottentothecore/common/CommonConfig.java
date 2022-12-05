package io.github.eriottosanmc.rottentothecore.common;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {

    public static final ForgeConfigSpec SPEC;
    
    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        SPEC = configBuilder.build();
    }

    private static void setupConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Use these settings to turn mod sections on/off.");
        builder.push("Set to true to enable:");
        builder.pop();
    }
}