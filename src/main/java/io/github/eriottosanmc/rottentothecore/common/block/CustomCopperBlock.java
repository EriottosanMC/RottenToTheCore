package io.github.eriottosanmc.rottentothecore.common.block;

import java.util.Optional;

import net.minecraft.world.level.block.Block;

public interface CustomCopperBlock {

	static Optional<Block> getWaxed(Block pBlock) {
		return Optional.ofNullable(ColumnBehaviorHelper.WAXING_BLOCK.get().get(pBlock));
	}
	
	static Optional<Block> getUnWaxed(Block pBlock) {
		return Optional.ofNullable(ColumnBehaviorHelper.UNWAXING_BLOCK.get().get(pBlock));
	}
}
