package io.github.eriottosanmc.rottentothecore.common.capability;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.CommonResourceLocations;
import io.github.eriottosanmc.rottentothecore.common.message.ClientboundPacketThoughts;
import io.github.eriottosanmc.rottentothecore.common.message.MessageRegistry;
import io.github.eriottosanmc.rottentothecore.server.ServerConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.ForgeRegistries;

public class PlayerDarkness {
    private boolean alreadyDark = false;
    private int darknessTicks = 0;
    private DamageSource CHARLIE = new DamageSource(RottenToTheCore.MODID + ".charlie");

    public void increaseDarkness(Player player) {
    	if(ServerConfig.enableMonsterInTheDarkness.get()) {
	        if (!alreadyDark) {
	            alreadyDark = true;
	            MessageRegistry.sendToPlayer(new ClientboundPacketThoughts(Component
	                    .translatable(RottenToTheCore.MODID + ".darkness.enter.message" + (1 + player.level.random.nextInt(12)))
	                    .withStyle(ChatFormatting.YELLOW)), (ServerPlayer) player);
	        }
	        if (this.darknessTicks % 80 == 0) {
	            SoundEvent s = ForgeRegistries.SOUND_EVENTS.getValue(CommonResourceLocations.CHARLIE_MOOD);
	            if(s != null) player.playNotifySound(s, SoundSource.HOSTILE, 1.0F, player.getRandom().nextFloat() * 0.5F + 0.5F);
	        }
	        if (this.darknessTicks == 300 || this.darknessTicks == 600) {
	            MessageRegistry.sendToPlayer(new ClientboundPacketThoughts(Component
	                    .translatable(RottenToTheCore.MODID + ".charlie.scare.message" + (1 + player.level.random.nextInt(15)))
	                    .withStyle(ChatFormatting.RED)), (ServerPlayer) player);
	        }
	        if (this.darknessTicks > 400 && this.darknessTicks % 33 == 0) {
	            SoundEvent s = ForgeRegistries.SOUND_EVENTS.getValue(CommonResourceLocations.CHARLIE_SCARE);
	            if(s != null) player.playNotifySound(s, SoundSource.HOSTILE, 0.6F, player.getRandom().nextFloat() * 0.7F + 0.3F);
	        }
	        if (this.darknessTicks >= 800 && this.darknessTicks % 200 == 0) {
	            SoundEvent s = ForgeRegistries.SOUND_EVENTS.getValue(CommonResourceLocations.CHARLIE_ATTACK);
	            if(s != null) player.playNotifySound(s, SoundSource.HOSTILE, 2F, player.getRandom().nextFloat() * 0.3F + 0.7F);
	            player.hurt(this.CHARLIE, 8.0F);
	            MessageRegistry.sendToPlayer(new ClientboundPacketThoughts(Component
	                    .translatable(RottenToTheCore.MODID + ".charlie.attack.message" + (1 + player.level.random.nextInt(6)))
	                    .withStyle(ChatFormatting.DARK_RED)), (ServerPlayer) player);
	        }
	        this.darknessTicks++;
    	}
    }

    public void resetDarkness(Player player) {
        if (this.darknessTicks != 0) {
            this.darknessTicks = 0;
            MessageRegistry.sendToPlayer(new ClientboundPacketThoughts(Component
                    .translatable(RottenToTheCore.MODID + ".darkness.gone.message" + (1 + player.level.random.nextInt(10)))
                    .withStyle(ChatFormatting.GOLD)), (ServerPlayer) player);
            alreadyDark = false;
        }
    }

    public int getDarkness() {
        return this.darknessTicks;
    }

    public void saveNBTData(CompoundTag compound) {
        compound.putInt("darkness", darknessTicks);
    }

    public void loadNBTData(CompoundTag compound) {
        darknessTicks = compound.getInt("darkness");
    }
}
