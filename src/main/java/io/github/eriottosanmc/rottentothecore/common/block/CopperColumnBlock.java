package io.github.eriottosanmc.rottentothecore.common.block;

import java.util.Optional;

import org.jetbrains.annotations.Nullable;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class CopperColumnBlock extends ColumnBlock implements CustomCopperBlock {

	public CopperColumnBlock(Properties prop, int levels) {
		super(prop, levels);
	}

	public BlockState waxBlock(Level pLevel, BlockState blockState) {
		Optional<Block> waxedBlock = CustomCopperBlock.getWaxed(blockState.getBlock());
		if(waxedBlock.isPresent()) {
			blockState = waxedBlock.get().withPropertiesOf(blockState);
		}
		return blockState;
	}
	
	public BlockState unWaxBlock(Level pLevel, BlockState blockState) {
		Optional<Block> unWaxedBlock = CustomCopperBlock.getUnWaxed(blockState.getBlock());
		if(unWaxedBlock.isPresent()) {
			blockState = unWaxedBlock.get().withPropertiesOf(blockState);
		}
		return blockState;
	}
	
	public boolean canBeWaxed(Block block) {
		return CustomCopperBlock.getWaxed(block).isPresent();
	}
	
	public boolean canBeUnWaxed(Block block) {
		return CustomCopperBlock.getUnWaxed(block).isPresent();
	}
	
	@Override
	public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
			BlockHitResult pHit) {
		ItemStack held = pPlayer.getItemInHand(pHand);
		if(held.getItem() == Items.HONEYCOMB && this.canBeWaxed(pState.getBlock())) {
			if (pPlayer instanceof ServerPlayer) {
	            CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)pPlayer, pPos, held);
	         }

			held.shrink(1);
	        BlockState newBlockState = this.waxBlock(pLevel, pState);
	        pLevel.setBlockAndUpdate(pPos, newBlockState);
	        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(pPlayer, newBlockState));
	        pLevel.levelEvent(pPlayer, 3003, pPos, 0);
	         return InteractionResult.sidedSuccess(pLevel.isClientSide);
		} else {
			return InteractionResult.PASS;
		}
	}
	
	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction,
			boolean simulate) {
		if(toolAction == ToolActions.AXE_WAX_OFF && this.canBeUnWaxed(state.getBlock())) {
			return this.unWaxBlock(context.getLevel(), state);
		} else {
			return super.getToolModifiedState(state, context, toolAction, simulate);
		}
	}
	

}
