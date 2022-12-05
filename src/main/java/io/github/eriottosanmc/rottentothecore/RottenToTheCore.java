package io.github.eriottosanmc.rottentothecore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.eriottosanmc.rottentothecore.client.ClientConfig;
import io.github.eriottosanmc.rottentothecore.common.CommonConfig;
import io.github.eriottosanmc.rottentothecore.common.block.BlockRegistry;
import io.github.eriottosanmc.rottentothecore.common.item.ItemRegistry;
import io.github.eriottosanmc.rottentothecore.common.message.MessageRegistry;
import io.github.eriottosanmc.rottentothecore.common.sound.SoundRegistry;
import io.github.eriottosanmc.rottentothecore.server.ServerConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RottenToTheCore.MODID)
public class RottenToTheCore {

    public static final String MODID = "rottentothecore";
    public static final String NAME = "Rotten To The Core";
    public static final String VERSION = "1.1";
    public static final Logger LOGGER = LogManager.getLogger();

    public RottenToTheCore() {

        // Register mod config
        // Server is synced to client - use this for most instances.
        // Client is used for display only values.
        // Common is not synced so try not to use. Exception: things that need the world to be loaded first! Commands and world gen.
        ModLoadingContext.get().registerConfig(Type.SERVER, ServerConfig.SPEC, MODID + "_server.toml");
        ModLoadingContext.get().registerConfig(Type.COMMON, CommonConfig.SPEC, MODID + "_common.toml");
        ModLoadingContext.get().registerConfig(Type.CLIENT, ClientConfig.SPEC, MODID + "_client.toml");

        // Get the Mod Event Bus
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::setupCommon);
        modBus.addListener(this::setupEvent);
        
        BlockRegistry.registerBlocks(modBus);
        ItemRegistry.registerItems(modBus);
        SoundRegistry.registerSounds(modBus);
    }
    
    // Common Setup Event.
    private void setupCommon(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MessageRegistry.register();
        });
    }
    
    public void setupEvent(final FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
        });
    }

    public static void logMessage(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = "";
        message = message + stackTraceElements[2].toString() + "; ";

        message = message + s;
        LOGGER.info(message);
    }
}
