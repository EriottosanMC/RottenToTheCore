package io.github.eriottosanmc.rottentothecore.common.block;

import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShapeHelper {
	public static VoxelShape join(VoxelShape original, VoxelShape addition, boolean add) {
		if (add) {
			return Shapes.or(original, addition);
		} else {
			return original;
		}
	}
}
