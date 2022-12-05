package io.github.eriottosanmc.rottentothecore.common.sound;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.CommonResourceLocations;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RottenToTheCore.MODID);

    public static final RegistryObject<SoundEvent> CHARLIE_MOOD = SOUNDS.register("charlie_mood", () -> new SoundEvent(CommonResourceLocations.CHARLIE_MOOD));
    public static final RegistryObject<SoundEvent> CHARLIE_SCARE = SOUNDS.register("charlie_scare", () -> new SoundEvent(CommonResourceLocations.CHARLIE_SCARE));
    public static final RegistryObject<SoundEvent> CHARLIE_ATTACK = SOUNDS.register("charlie_attack", () -> new SoundEvent(CommonResourceLocations.CHARLIE_ATTACK));
    
    public static void registerSounds(IEventBus bus) 
    {
        SOUNDS.register(bus);
    }
}
