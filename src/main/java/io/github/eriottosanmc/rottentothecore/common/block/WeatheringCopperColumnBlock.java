package io.github.eriottosanmc.rottentothecore.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringCopperColumnBlock extends CopperColumnBlock implements CustomWeatheringCopper {

	private WeatherState age;

	public WeatheringCopperColumnBlock(WeatherState age, Properties prop, int levels) {
		super(prop, levels);
		this.age = age;
	}

	@Override
	public WeatherState getAge() {
		return this.age;
	}

	/**
	 * Performs a random tick on a block.
	 */
	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		this.onRandomTick(pState, pLevel, pPos, pRandom);
	}

	/**
	 * @return whether this block needs random ticking.
	 */
	@Override
	public boolean isRandomlyTicking(BlockState pState) {
		return CustomWeatheringCopper.getNext(pState.getBlock()).isPresent();
	}

}
