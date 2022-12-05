package io.github.eriottosanmc.rottentothecore.common.event;

import java.util.Optional;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.CommonResourceLocations;
import io.github.eriottosanmc.rottentothecore.common.block.ColumnBehaviorHelper;
import io.github.eriottosanmc.rottentothecore.common.block.ColumnBlock;
import io.github.eriottosanmc.rottentothecore.common.capability.PlayerDarknessProvider;
import io.github.eriottosanmc.rottentothecore.common.item.ItemRegistry;
import io.github.eriottosanmc.rottentothecore.common.message.MessageRegistry;
import io.github.eriottosanmc.rottentothecore.common.message.ServerboundPacketSkyFlash;
import io.github.eriottosanmc.rottentothecore.common.util.DarknessHelper;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = RottenToTheCore.MODID, bus = Bus.FORGE)
public class CommonForgeEventsHandler {

	@SubscribeEvent
	public static void breakBlockEvent(BlockEvent.BreakEvent event) {
		Player player = event.getPlayer();
		if(player != null) {
			ItemStack held = player.getMainHandItem();
			if(held.getItem() == ItemRegistry.CHISEL.get()) {
				BlockState blockState = player.level.getBlockState(event.getPos());
				Optional<Block> optional = Optional.ofNullable(ColumnBehaviorHelper.NEXT_COLUMN_BY_BLOCK.get().get(blockState.getBlock()));
				if(optional.isPresent()) {
					boolean waterlogged = player.level.getFluidState(event.getPos()) == Fluids.WATER.getSource(false);
					player.level.setBlockAndUpdate(event.getPos(), optional.get().withPropertiesOf(blockState).setValue(ColumnBlock.WATERLOGGED, waterlogged));
					event.setCanceled(true);
					if(!player.isCreative() && !player.level.isClientSide) {
				      held.hurtAndBreak(1, player, (livingEntity) -> {
				          livingEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				       });
					}
				}
			}
		}
	}
	
	
	@SubscribeEvent
	public static void attachCapabilitiesEntity(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof Player player && !player.level.isClientSide) {
			if (!player.getCapability(PlayerDarknessProvider.playerDarknessCap).isPresent()) {
				event.addCapability(CommonResourceLocations.DARKNESS_CAPABILITY, new PlayerDarknessProvider());
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public static void playerUpdateEvent(PlayerTickEvent event) {
		Player player = event.player;
		if (!player.level.isClientSide) {
			if (DarknessHelper.isTrueDarkness(player.level, player.blockPosition())) {
				player.getCapability(PlayerDarknessProvider.playerDarknessCap).ifPresent(cap -> {
					cap.increaseDarkness(player);
				});
			} else {
				player.getCapability(PlayerDarknessProvider.playerDarknessCap).ifPresent(cap -> {
					cap.resetDarkness(player);
				});
			}
		} else {
			if (((ClientLevel) player.level).getSkyFlashTime() > 0) {
				MessageRegistry.sendToServer(new ServerboundPacketSkyFlash());
			}
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public static void onEvent(PlayerEvent.Clone event) {
		if (event.isWasDeath()) {
			event.getOriginal().reviveCaps();
			
			event.getOriginal().getCapability(PlayerDarknessProvider.playerDarknessCap).ifPresent(oldStore -> {
				event.getEntity().getCapability(PlayerDarknessProvider.playerDarknessCap).ifPresent(newStore -> {
					newStore.resetDarkness(event.getEntity());
				});
			});
			
			event.getOriginal().invalidateCaps();
		}
	}
}
