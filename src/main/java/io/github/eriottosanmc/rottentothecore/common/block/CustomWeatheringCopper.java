package io.github.eriottosanmc.rottentothecore.common.block;

import java.util.Optional;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public interface CustomWeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {

	static Optional<Block> getPrevious(Block pBlock) {
		return Optional.ofNullable(ColumnBehaviorHelper.PREVIOUS_BY_BLOCK.get().get(pBlock));
	}

	static Block getFirst(Block pBlock) {
		Block block = pBlock;

		for (Block block1 = ColumnBehaviorHelper.PREVIOUS_BY_BLOCK.get().get(pBlock); block1 != null; block1 = ColumnBehaviorHelper.PREVIOUS_BY_BLOCK.get()
				.get(block1)) {
			block = block1;
		}

		return block;
	}

	static Optional<BlockState> getPrevious(BlockState pState) {
		return getPrevious(pState.getBlock()).map((p_154903_) -> {
			return p_154903_.withPropertiesOf(pState);
		});
	}

	static Optional<Block> getNext(Block pBlock) {
		return Optional.ofNullable(ColumnBehaviorHelper.NEXT_BY_BLOCK.get().get(pBlock));
	}

	static BlockState getFirst(BlockState pState) {
		return getFirst(pState.getBlock()).withPropertiesOf(pState);
	}

	default Optional<BlockState> getNext(BlockState pState) {
		return getNext(pState.getBlock()).map((p_154896_) -> {
			return p_154896_.withPropertiesOf(pState);
		});
	}

	default float getChanceModifier() {
		return this.getAge() == WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
	}

}