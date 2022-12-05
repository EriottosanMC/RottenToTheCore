package io.github.eriottosanmc.rottentothecore.common.block;

import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ColumnBehaviorHelper {
	public static final Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				
				.put(BlockRegistry.COPPER_BLOCK_COLUMN0.get(), BlockRegistry.EXPOSED_COPPER_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN0.get(), BlockRegistry.WEATHERED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN0.get(), BlockRegistry.OXIDIZED_COPPER_COLUMN0.get())
				.put(BlockRegistry.COPPER_BLOCK_COLUMN1.get(), BlockRegistry.EXPOSED_COPPER_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN1.get(), BlockRegistry.WEATHERED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN1.get(), BlockRegistry.OXIDIZED_COPPER_COLUMN1.get())
				.put(BlockRegistry.COPPER_BLOCK_COLUMN2.get(), BlockRegistry.EXPOSED_COPPER_COLUMN2.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN2.get(), BlockRegistry.WEATHERED_COPPER_COLUMN2.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN2.get(), BlockRegistry.OXIDIZED_COPPER_COLUMN2.get())
				
				.put(BlockRegistry.CUT_COPPER_COLUMN0.get(), BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get(), BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.CUT_COPPER_COLUMN1.get(), BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get(), BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.CUT_COPPER_COLUMN2.get(), BlockRegistry.EXPOSED_CUT_COPPER_COLUMN2.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN2.get(), BlockRegistry.WEATHERED_CUT_COPPER_COLUMN2.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN2.get(), BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN2.get())

				.build();
	});
	
	public static final Supplier<BiMap<Block, Block>> WAXING_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				
				.put(BlockRegistry.COPPER_BLOCK_COLUMN0.get(), BlockRegistry.WAXED_COPPER_BLOCK_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN0.get())
				.put(BlockRegistry.OXIDIZED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN0.get())

				.put(BlockRegistry.COPPER_BLOCK_COLUMN1.get(), BlockRegistry.WAXED_COPPER_BLOCK_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN1.get())
				.put(BlockRegistry.OXIDIZED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN1.get())

				.put(BlockRegistry.COPPER_BLOCK_COLUMN2.get(), BlockRegistry.WAXED_COPPER_BLOCK_COLUMN2.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN2.get(), BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN2.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN2.get(), BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN2.get())
				.put(BlockRegistry.OXIDIZED_COPPER_COLUMN2.get(), BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN2.get())

				.put(BlockRegistry.CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN0.get())

				.put(BlockRegistry.CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN1.get())

				.put(BlockRegistry.CUT_COPPER_COLUMN2.get(), BlockRegistry.WAXED_CUT_COPPER_COLUMN2.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN2.get(), BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN2.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN2.get(), BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN2.get())
				.put(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN2.get(), BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN2.get())
				
				.build();
	});
	
	public static final Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
		return NEXT_BY_BLOCK.get().inverse();
	});

	public static final Supplier<BiMap<Block, Block>> UNWAXING_BLOCK = Suppliers.memoize(() -> {
		return WAXING_BLOCK.get().inverse();
	});
	
	public static final Supplier<BiMap<Block, Block>> NEXT_COLUMN_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				
				.put(Blocks.STONE, BlockRegistry.STONE_COLUMN0.get())
				.put(BlockRegistry.STONE_COLUMN0.get(), BlockRegistry.STONE_COLUMN1.get())
				.put(BlockRegistry.STONE_COLUMN1.get(), BlockRegistry.STONE_COLUMN2.get())

				.put(Blocks.SMOOTH_STONE, BlockRegistry.SMOOTH_STONE_COLUMN0.get())
				.put(BlockRegistry.SMOOTH_STONE_COLUMN0.get(), BlockRegistry.SMOOTH_STONE_COLUMN1.get())
				.put(BlockRegistry.SMOOTH_STONE_COLUMN1.get(), BlockRegistry.SMOOTH_STONE_COLUMN2.get())

				.put(Blocks.GRANITE, BlockRegistry.GRANITE_COLUMN0.get())
				.put(BlockRegistry.GRANITE_COLUMN0.get(), BlockRegistry.GRANITE_COLUMN1.get())
				.put(BlockRegistry.GRANITE_COLUMN1.get(), BlockRegistry.GRANITE_COLUMN2.get())

				.put(Blocks.POLISHED_GRANITE, BlockRegistry.POLISHED_GRANITE_COLUMN0.get())
				.put(BlockRegistry.POLISHED_GRANITE_COLUMN0.get(), BlockRegistry.POLISHED_GRANITE_COLUMN1.get())
				.put(BlockRegistry.POLISHED_GRANITE_COLUMN1.get(), BlockRegistry.POLISHED_GRANITE_COLUMN2.get())

				.put(Blocks.DIORITE, BlockRegistry.DIORITE_COLUMN0.get())
				.put(BlockRegistry.DIORITE_COLUMN0.get(), BlockRegistry.DIORITE_COLUMN1.get())
				.put(BlockRegistry.DIORITE_COLUMN1.get(), BlockRegistry.DIORITE_COLUMN2.get())

				.put(Blocks.POLISHED_DIORITE, BlockRegistry.POLISHED_DIORITE_COLUMN0.get())
				.put(BlockRegistry.POLISHED_DIORITE_COLUMN0.get(), BlockRegistry.POLISHED_DIORITE_COLUMN1.get())
				.put(BlockRegistry.POLISHED_DIORITE_COLUMN1.get(), BlockRegistry.POLISHED_DIORITE_COLUMN2.get())

				.put(Blocks.ANDESITE, BlockRegistry.ANDESITE_COLUMN0.get())
				.put(BlockRegistry.ANDESITE_COLUMN0.get(), BlockRegistry.ANDESITE_COLUMN1.get())
				.put(BlockRegistry.ANDESITE_COLUMN1.get(), BlockRegistry.ANDESITE_COLUMN2.get())

				.put(Blocks.POLISHED_ANDESITE, BlockRegistry.POLISHED_ANDESITE_COLUMN0.get())
				.put(BlockRegistry.POLISHED_ANDESITE_COLUMN0.get(), BlockRegistry.POLISHED_ANDESITE_COLUMN1.get())
				.put(BlockRegistry.POLISHED_ANDESITE_COLUMN1.get(), BlockRegistry.POLISHED_ANDESITE_COLUMN2.get())

				.put(Blocks.COBBLESTONE, BlockRegistry.COBBLESTONE_COLUMN0.get())
				.put(BlockRegistry.COBBLESTONE_COLUMN0.get(), BlockRegistry.COBBLESTONE_COLUMN1.get())
				.put(BlockRegistry.COBBLESTONE_COLUMN1.get(), BlockRegistry.COBBLESTONE_COLUMN2.get())

				.put(Blocks.STRIPPED_SPRUCE_LOG, BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN2.get())

				.put(Blocks.STRIPPED_BIRCH_LOG, BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN2.get())

				.put(Blocks.STRIPPED_JUNGLE_LOG, BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN2.get())

				.put(Blocks.STRIPPED_ACACIA_LOG, BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN2.get())

				.put(Blocks.STRIPPED_DARK_OAK_LOG, BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN2.get())

				.put(Blocks.STRIPPED_OAK_LOG, BlockRegistry.STRIPPED_OAK_LOG_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_OAK_LOG_COLUMN0.get(), BlockRegistry.STRIPPED_OAK_LOG_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_OAK_LOG_COLUMN1.get(), BlockRegistry.STRIPPED_OAK_LOG_COLUMN2.get())

				.put(Blocks.LAPIS_BLOCK, BlockRegistry.LAPIS_BLOCK_COLUMN0.get())
				.put(BlockRegistry.LAPIS_BLOCK_COLUMN0.get(), BlockRegistry.LAPIS_BLOCK_COLUMN1.get())
				.put(BlockRegistry.LAPIS_BLOCK_COLUMN1.get(), BlockRegistry.LAPIS_BLOCK_COLUMN2.get())

				.put(Blocks.GOLD_BLOCK, BlockRegistry.GOLD_BLOCK_COLUMN0.get())
				.put(BlockRegistry.GOLD_BLOCK_COLUMN0.get(), BlockRegistry.GOLD_BLOCK_COLUMN1.get())
				.put(BlockRegistry.GOLD_BLOCK_COLUMN1.get(), BlockRegistry.GOLD_BLOCK_COLUMN2.get())

				.put(Blocks.IRON_BLOCK, BlockRegistry.IRON_BLOCK_COLUMN0.get())
				.put(BlockRegistry.IRON_BLOCK_COLUMN0.get(), BlockRegistry.IRON_BLOCK_COLUMN1.get())
				.put(BlockRegistry.IRON_BLOCK_COLUMN1.get(), BlockRegistry.IRON_BLOCK_COLUMN2.get())

				.put(Blocks.DIAMOND_BLOCK, BlockRegistry.DIAMOND_BLOCK_COLUMN0.get())
				.put(BlockRegistry.DIAMOND_BLOCK_COLUMN0.get(), BlockRegistry.DIAMOND_BLOCK_COLUMN1.get())
				.put(BlockRegistry.DIAMOND_BLOCK_COLUMN1.get(), BlockRegistry.DIAMOND_BLOCK_COLUMN2.get())

				.put(Blocks.NETHERITE_BLOCK, BlockRegistry.NETHERITE_BLOCK_COLUMN0.get())
				.put(BlockRegistry.NETHERITE_BLOCK_COLUMN0.get(), BlockRegistry.NETHERITE_BLOCK_COLUMN1.get())
				.put(BlockRegistry.NETHERITE_BLOCK_COLUMN1.get(), BlockRegistry.NETHERITE_BLOCK_COLUMN2.get())

				.put(Blocks.SANDSTONE, BlockRegistry.SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.SANDSTONE_COLUMN0.get(), BlockRegistry.SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.SANDSTONE_COLUMN1.get(), BlockRegistry.SANDSTONE_COLUMN2.get())

				.put(Blocks.CHISELED_SANDSTONE, BlockRegistry.CHISELED_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.CHISELED_SANDSTONE_COLUMN0.get(), BlockRegistry.CHISELED_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.CHISELED_SANDSTONE_COLUMN1.get(), BlockRegistry.CHISELED_SANDSTONE_COLUMN2.get())

				.put(Blocks.CUT_SANDSTONE, BlockRegistry.CUT_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.CUT_SANDSTONE_COLUMN0.get(), BlockRegistry.CUT_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.CUT_SANDSTONE_COLUMN1.get(), BlockRegistry.CUT_SANDSTONE_COLUMN2.get())

				.put(Blocks.SMOOTH_SANDSTONE, BlockRegistry.SMOOTH_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.SMOOTH_SANDSTONE_COLUMN0.get(), BlockRegistry.SMOOTH_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.SMOOTH_SANDSTONE_COLUMN1.get(), BlockRegistry.SMOOTH_SANDSTONE_COLUMN2.get())

				.put(Blocks.BRICKS, BlockRegistry.BRICKS_COLUMN0.get())
				.put(BlockRegistry.BRICKS_COLUMN0.get(), BlockRegistry.BRICKS_COLUMN1.get())
				.put(BlockRegistry.BRICKS_COLUMN1.get(), BlockRegistry.BRICKS_COLUMN2.get())

				.put(Blocks.MOSSY_COBBLESTONE, BlockRegistry.MOSSY_COBBLESTONE_COLUMN0.get())
				.put(BlockRegistry.MOSSY_COBBLESTONE_COLUMN0.get(), BlockRegistry.MOSSY_COBBLESTONE_COLUMN1.get())
				.put(BlockRegistry.MOSSY_COBBLESTONE_COLUMN1.get(), BlockRegistry.MOSSY_COBBLESTONE_COLUMN2.get())

				.put(Blocks.OBSIDIAN, BlockRegistry.OBSIDIAN_COLUMN0.get())
				.put(BlockRegistry.OBSIDIAN_COLUMN0.get(), BlockRegistry.OBSIDIAN_COLUMN1.get())
				.put(BlockRegistry.OBSIDIAN_COLUMN1.get(), BlockRegistry.OBSIDIAN_COLUMN2.get())

				.put(Blocks.BASALT, BlockRegistry.BASALT_COLUMN0.get())
				.put(BlockRegistry.BASALT_COLUMN0.get(), BlockRegistry.BASALT_COLUMN1.get())
				.put(BlockRegistry.BASALT_COLUMN1.get(), BlockRegistry.BASALT_COLUMN2.get())

				.put(Blocks.POLISHED_BASALT, BlockRegistry.POLISHED_BASALT_COLUMN0.get())
				.put(BlockRegistry.POLISHED_BASALT_COLUMN0.get(), BlockRegistry.POLISHED_BASALT_COLUMN1.get())
				.put(BlockRegistry.POLISHED_BASALT_COLUMN1.get(), BlockRegistry.POLISHED_BASALT_COLUMN2.get())

				.put(Blocks.STONE_BRICKS, BlockRegistry.STONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.STONE_BRICKS_COLUMN0.get(), BlockRegistry.STONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.STONE_BRICKS_COLUMN1.get(), BlockRegistry.STONE_BRICKS_COLUMN2.get())

				.put(Blocks.MOSSY_STONE_BRICKS, BlockRegistry.MOSSY_STONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.MOSSY_STONE_BRICKS_COLUMN0.get(), BlockRegistry.MOSSY_STONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.MOSSY_STONE_BRICKS_COLUMN1.get(), BlockRegistry.MOSSY_STONE_BRICKS_COLUMN2.get())

				.put(Blocks.CRACKED_STONE_BRICKS, BlockRegistry.CRACKED_STONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.CRACKED_STONE_BRICKS_COLUMN0.get(), BlockRegistry.CRACKED_STONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.CRACKED_STONE_BRICKS_COLUMN1.get(), BlockRegistry.CRACKED_STONE_BRICKS_COLUMN2.get())

				.put(Blocks.CHISELED_STONE_BRICKS, BlockRegistry.CHISELED_STONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.CHISELED_STONE_BRICKS_COLUMN0.get(), BlockRegistry.CHISELED_STONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.CHISELED_STONE_BRICKS_COLUMN1.get(), BlockRegistry.CHISELED_STONE_BRICKS_COLUMN2.get())

				.put(Blocks.NETHER_BRICKS, BlockRegistry.NETHER_BRICKS_COLUMN0.get())
				.put(BlockRegistry.NETHER_BRICKS_COLUMN0.get(), BlockRegistry.NETHER_BRICKS_COLUMN1.get())
				.put(BlockRegistry.NETHER_BRICKS_COLUMN1.get(), BlockRegistry.NETHER_BRICKS_COLUMN2.get())

				.put(Blocks.EMERALD_BLOCK, BlockRegistry.EMERALD_BLOCK_COLUMN0.get())
				.put(BlockRegistry.EMERALD_BLOCK_COLUMN0.get(), BlockRegistry.EMERALD_BLOCK_COLUMN1.get())
				.put(BlockRegistry.EMERALD_BLOCK_COLUMN1.get(), BlockRegistry.EMERALD_BLOCK_COLUMN2.get())

				.put(Blocks.QUARTZ_BLOCK, BlockRegistry.QUARTZ_BLOCK_COLUMN0.get())
				.put(BlockRegistry.QUARTZ_BLOCK_COLUMN0.get(), BlockRegistry.QUARTZ_BLOCK_COLUMN1.get())
				.put(BlockRegistry.QUARTZ_BLOCK_COLUMN1.get(), BlockRegistry.QUARTZ_BLOCK_COLUMN2.get())

				.put(Blocks.CHISELED_QUARTZ_BLOCK, BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN0.get())
				.put(BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN0.get(), BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN1.get())
				.put(BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN1.get(), BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN2.get())

				.put(Blocks.SMOOTH_QUARTZ, BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN0.get())
				.put(BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN0.get(), BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN1.get())
				.put(BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN1.get(), BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN2.get())

				.put(Blocks.QUARTZ_PILLAR, BlockRegistry.QUARTZ_PILLAR_COLUMN0.get())
				.put(BlockRegistry.QUARTZ_PILLAR_COLUMN0.get(), BlockRegistry.QUARTZ_PILLAR_COLUMN1.get())
				.put(BlockRegistry.QUARTZ_PILLAR_COLUMN1.get(), BlockRegistry.QUARTZ_PILLAR_COLUMN2.get())

				.put(Blocks.PRISMARINE, BlockRegistry.PRISMARINE_COLUMN0.get())
				.put(BlockRegistry.PRISMARINE_COLUMN0.get(), BlockRegistry.PRISMARINE_COLUMN1.get())
				.put(BlockRegistry.PRISMARINE_COLUMN1.get(), BlockRegistry.PRISMARINE_COLUMN2.get())

				.put(Blocks.PRISMARINE_BRICKS, BlockRegistry.PRISMARINE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.PRISMARINE_BRICKS_COLUMN0.get(), BlockRegistry.PRISMARINE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.PRISMARINE_BRICKS_COLUMN1.get(), BlockRegistry.PRISMARINE_BRICKS_COLUMN2.get())

				.put(Blocks.DARK_PRISMARINE, BlockRegistry.DARK_PRISMARINE_COLUMN0.get())
				.put(BlockRegistry.DARK_PRISMARINE_COLUMN0.get(), BlockRegistry.DARK_PRISMARINE_COLUMN1.get())
				.put(BlockRegistry.DARK_PRISMARINE_COLUMN1.get(), BlockRegistry.DARK_PRISMARINE_COLUMN2.get())

				.put(Blocks.COAL_BLOCK, BlockRegistry.COAL_BLOCK_COLUMN0.get())
				.put(BlockRegistry.COAL_BLOCK_COLUMN0.get(), BlockRegistry.COAL_BLOCK_COLUMN1.get())
				.put(BlockRegistry.COAL_BLOCK_COLUMN1.get(), BlockRegistry.COAL_BLOCK_COLUMN2.get())

				.put(Blocks.CHISELED_RED_SANDSTONE, BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN0.get(), BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN1.get(), BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN2.get())

				.put(Blocks.RED_SANDSTONE, BlockRegistry.RED_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.RED_SANDSTONE_COLUMN0.get(), BlockRegistry.RED_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.RED_SANDSTONE_COLUMN1.get(), BlockRegistry.RED_SANDSTONE_COLUMN2.get())

				.put(Blocks.CUT_RED_SANDSTONE, BlockRegistry.CUT_RED_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.CUT_RED_SANDSTONE_COLUMN0.get(), BlockRegistry.CUT_RED_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.CUT_RED_SANDSTONE_COLUMN1.get(), BlockRegistry.CUT_RED_SANDSTONE_COLUMN2.get())

				.put(Blocks.SMOOTH_RED_SANDSTONE, BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN0.get())
				.put(BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN0.get(), BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN1.get())
				.put(BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN1.get(), BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN2.get())

				.put(Blocks.END_STONE_BRICKS, BlockRegistry.END_STONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.END_STONE_BRICKS_COLUMN0.get(), BlockRegistry.END_STONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.END_STONE_BRICKS_COLUMN1.get(), BlockRegistry.END_STONE_BRICKS_COLUMN2.get())

				.put(Blocks.RED_NETHER_BRICKS, BlockRegistry.RED_NETHER_BRICKS_COLUMN0.get())
				.put(BlockRegistry.RED_NETHER_BRICKS_COLUMN0.get(), BlockRegistry.RED_NETHER_BRICKS_COLUMN1.get())
				.put(BlockRegistry.RED_NETHER_BRICKS_COLUMN1.get(), BlockRegistry.RED_NETHER_BRICKS_COLUMN2.get())

				.put(Blocks.STRIPPED_CRIMSON_STEM, BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN0.get(), BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN1.get(), BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN2.get())

				.put(Blocks.STRIPPED_WARPED_STEM, BlockRegistry.STRIPPED_WARPED_STEM_COLUMN0.get())
				.put(BlockRegistry.STRIPPED_WARPED_STEM_COLUMN0.get(), BlockRegistry.STRIPPED_WARPED_STEM_COLUMN1.get())
				.put(BlockRegistry.STRIPPED_WARPED_STEM_COLUMN1.get(), BlockRegistry.STRIPPED_WARPED_STEM_COLUMN2.get())

				.put(Blocks.ANCIENT_DEBRIS, BlockRegistry.ANCIENT_DEBRIS_COLUMN0.get())
				.put(BlockRegistry.ANCIENT_DEBRIS_COLUMN0.get(), BlockRegistry.ANCIENT_DEBRIS_COLUMN1.get())
				.put(BlockRegistry.ANCIENT_DEBRIS_COLUMN1.get(), BlockRegistry.ANCIENT_DEBRIS_COLUMN2.get())

				.put(Blocks.CRYING_OBSIDIAN, BlockRegistry.CRYING_OBSIDIAN_COLUMN0.get())
				.put(BlockRegistry.CRYING_OBSIDIAN_COLUMN0.get(), BlockRegistry.CRYING_OBSIDIAN_COLUMN1.get())
				.put(BlockRegistry.CRYING_OBSIDIAN_COLUMN1.get(), BlockRegistry.CRYING_OBSIDIAN_COLUMN2.get())

				.put(Blocks.CHISELED_POLISHED_BLACKSTONE, BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN0.get())
				.put(BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN0.get(), BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN1.get())
				.put(BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN1.get(), BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN2.get())

				.put(Blocks.POLISHED_BLACKSTONE, BlockRegistry.POLISHED_BLACKSTONE_COLUMN0.get())
				.put(BlockRegistry.POLISHED_BLACKSTONE_COLUMN0.get(), BlockRegistry.POLISHED_BLACKSTONE_COLUMN1.get())
				.put(BlockRegistry.POLISHED_BLACKSTONE_COLUMN1.get(), BlockRegistry.POLISHED_BLACKSTONE_COLUMN2.get())

				.put(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN0.get(), BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN1.get(), BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN2.get())

				.put(Blocks.POLISHED_BLACKSTONE_BRICKS, BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN0.get())
				.put(BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN0.get(), BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN1.get())
				.put(BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN1.get(), BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN2.get())

				.put(Blocks.QUARTZ_BRICKS, BlockRegistry.QUARTZ_BRICKS_COLUMN0.get())
				.put(BlockRegistry.QUARTZ_BRICKS_COLUMN0.get(), BlockRegistry.QUARTZ_BRICKS_COLUMN1.get())
				.put(BlockRegistry.QUARTZ_BRICKS_COLUMN1.get(), BlockRegistry.QUARTZ_BRICKS_COLUMN2.get())

				.put(Blocks.CHISELED_NETHER_BRICKS, BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN0.get())
				.put(BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN0.get(), BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN1.get())
				.put(BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN1.get(), BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN2.get())

				.put(Blocks.CRACKED_NETHER_BRICKS, BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN0.get())
				.put(BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN0.get(), BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN1.get())
				.put(BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN1.get(), BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN2.get())

				.put(Blocks.OXIDIZED_COPPER, BlockRegistry.OXIDIZED_COPPER_COLUMN0.get())
				.put(BlockRegistry.OXIDIZED_COPPER_COLUMN0.get(), BlockRegistry.OXIDIZED_COPPER_COLUMN1.get())
				.put(BlockRegistry.OXIDIZED_COPPER_COLUMN1.get(), BlockRegistry.OXIDIZED_COPPER_COLUMN2.get())

				.put(Blocks.WEATHERED_COPPER, BlockRegistry.WEATHERED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN0.get(), BlockRegistry.WEATHERED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_COPPER_COLUMN1.get(), BlockRegistry.WEATHERED_COPPER_COLUMN2.get())

				.put(Blocks.EXPOSED_COPPER, BlockRegistry.EXPOSED_COPPER_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN0.get(), BlockRegistry.EXPOSED_COPPER_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_COPPER_COLUMN1.get(), BlockRegistry.EXPOSED_COPPER_COLUMN2.get())

				.put(Blocks.COPPER_BLOCK, BlockRegistry.COPPER_BLOCK_COLUMN0.get())
				.put(BlockRegistry.COPPER_BLOCK_COLUMN0.get(), BlockRegistry.COPPER_BLOCK_COLUMN1.get())
				.put(BlockRegistry.COPPER_BLOCK_COLUMN1.get(), BlockRegistry.COPPER_BLOCK_COLUMN2.get())

				.put(Blocks.OXIDIZED_CUT_COPPER, BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN0.get(), BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN1.get(), BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.WEATHERED_CUT_COPPER, BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WEATHERED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.EXPOSED_CUT_COPPER, BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get(), BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get(), BlockRegistry.EXPOSED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.CUT_COPPER, BlockRegistry.CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.CUT_COPPER_COLUMN0.get(), BlockRegistry.CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.CUT_COPPER_COLUMN1.get(), BlockRegistry.CUT_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_COPPER_BLOCK, BlockRegistry.WAXED_COPPER_BLOCK_COLUMN0.get())
				.put(BlockRegistry.WAXED_COPPER_BLOCK_COLUMN0.get(), BlockRegistry.WAXED_COPPER_BLOCK_COLUMN1.get())
				.put(BlockRegistry.WAXED_COPPER_BLOCK_COLUMN1.get(), BlockRegistry.WAXED_COPPER_BLOCK_COLUMN2.get())

				.put(Blocks.WAXED_WEATHERED_COPPER, BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_EXPOSED_COPPER, BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_OXIDIZED_COPPER, BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN0.get(), BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN1.get(), BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_OXIDIZED_CUT_COPPER, BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_WEATHERED_CUT_COPPER, BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_EXPOSED_CUT_COPPER, BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.WAXED_CUT_COPPER, BlockRegistry.WAXED_CUT_COPPER_COLUMN0.get())
				.put(BlockRegistry.WAXED_CUT_COPPER_COLUMN0.get(), BlockRegistry.WAXED_CUT_COPPER_COLUMN1.get())
				.put(BlockRegistry.WAXED_CUT_COPPER_COLUMN1.get(), BlockRegistry.WAXED_CUT_COPPER_COLUMN2.get())

				.put(Blocks.SMOOTH_BASALT, BlockRegistry.SMOOTH_BASALT_COLUMN0.get())
				.put(BlockRegistry.SMOOTH_BASALT_COLUMN0.get(), BlockRegistry.SMOOTH_BASALT_COLUMN1.get())
				.put(BlockRegistry.SMOOTH_BASALT_COLUMN1.get(), BlockRegistry.SMOOTH_BASALT_COLUMN2.get())

				.put(Blocks.PURPUR_BLOCK, BlockRegistry.PURPUR_BLOCK_COLUMN0.get())
				.put(BlockRegistry.PURPUR_BLOCK_COLUMN0.get(), BlockRegistry.PURPUR_BLOCK_COLUMN1.get())
				.put(BlockRegistry.PURPUR_BLOCK_COLUMN1.get(), BlockRegistry.PURPUR_BLOCK_COLUMN2.get())

				.put(Blocks.PURPUR_PILLAR, BlockRegistry.PURPUR_PILLAR_COLUMN0.get())
				.put(BlockRegistry.PURPUR_PILLAR_COLUMN0.get(), BlockRegistry.PURPUR_PILLAR_COLUMN1.get())
				.put(BlockRegistry.PURPUR_PILLAR_COLUMN1.get(), BlockRegistry.PURPUR_PILLAR_COLUMN2.get())
				
				.build();
	});
	
}
