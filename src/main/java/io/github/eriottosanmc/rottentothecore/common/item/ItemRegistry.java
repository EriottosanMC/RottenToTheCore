package io.github.eriottosanmc.rottentothecore.common.item;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.block.BlockRegistry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RottenToTheCore.MODID);

	public static final CreativeModeTab COLUMN_GROUP = new CreativeModeTab(RottenToTheCore.MODID+".column"){@Override public ItemStack makeIcon(){return new ItemStack(ItemRegistry.STONECOLUMN0.get());}};

	public static final Item.Properties COLUMN_TAB_PROPERTIES = new Item.Properties().tab(COLUMN_GROUP);

    public static final RegistryObject<ItemChisel> CHISEL = ITEMS.register("chisel",
            () -> new ItemChisel(-1.0F, -3.8F, Tiers.IRON, BlockTags.ACACIA_LOGS, COLUMN_TAB_PROPERTIES));

	//COLUMNS
	public static final RegistryObject<BlockItem> STONECOLUMN0 = ITEMS.register("column/stone_column0",
			() -> new BlockItem(BlockRegistry.STONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STONECOLUMN1 = ITEMS.register("column/stone_column1",
			() -> new BlockItem(BlockRegistry.STONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STONECOLUMN2 = ITEMS.register("column/stone_column2",
			() -> new BlockItem(BlockRegistry.STONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_STONECOLUMN0 = ITEMS.register("column/smooth_stone_column0",
			() -> new BlockItem(BlockRegistry.SMOOTH_STONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_STONECOLUMN1 = ITEMS.register("column/smooth_stone_column1",
			() -> new BlockItem(BlockRegistry.SMOOTH_STONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_STONECOLUMN2 = ITEMS.register("column/smooth_stone_column2",
			() -> new BlockItem(BlockRegistry.SMOOTH_STONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GRANITECOLUMN0 = ITEMS.register("column/granite_column0",
			() -> new BlockItem(BlockRegistry.GRANITE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GRANITECOLUMN1 = ITEMS.register("column/granite_column1",
			() -> new BlockItem(BlockRegistry.GRANITE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GRANITECOLUMN2 = ITEMS.register("column/granite_column2",
			() -> new BlockItem(BlockRegistry.GRANITE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_GRANITECOLUMN0 = ITEMS.register(
			"column/polished_granite_column0",
			() -> new BlockItem(BlockRegistry.POLISHED_GRANITE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_GRANITECOLUMN1 = ITEMS.register(
			"column/polished_granite_column1",
			() -> new BlockItem(BlockRegistry.POLISHED_GRANITE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_GRANITECOLUMN2 = ITEMS.register(
			"column/polished_granite_column2",
			() -> new BlockItem(BlockRegistry.POLISHED_GRANITE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIORITECOLUMN0 = ITEMS.register("column/diorite_column0",
			() -> new BlockItem(BlockRegistry.DIORITE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIORITECOLUMN1 = ITEMS.register("column/diorite_column1",
			() -> new BlockItem(BlockRegistry.DIORITE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIORITECOLUMN2 = ITEMS.register("column/diorite_column2",
			() -> new BlockItem(BlockRegistry.DIORITE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_DIORITECOLUMN0 = ITEMS.register(
			"column/polished_diorite_column0",
			() -> new BlockItem(BlockRegistry.POLISHED_DIORITE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_DIORITECOLUMN1 = ITEMS.register(
			"column/polished_diorite_column1",
			() -> new BlockItem(BlockRegistry.POLISHED_DIORITE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_DIORITECOLUMN2 = ITEMS.register(
			"column/polished_diorite_column2",
			() -> new BlockItem(BlockRegistry.POLISHED_DIORITE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANDESITECOLUMN0 = ITEMS.register("column/andesite_column0",
			() -> new BlockItem(BlockRegistry.ANDESITE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANDESITECOLUMN1 = ITEMS.register("column/andesite_column1",
			() -> new BlockItem(BlockRegistry.ANDESITE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANDESITECOLUMN2 = ITEMS.register("column/andesite_column2",
			() -> new BlockItem(BlockRegistry.ANDESITE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_ANDESITECOLUMN0 = ITEMS.register(
			"column/polished_andesite_column0", () -> new BlockItem(BlockRegistry.POLISHED_ANDESITE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_ANDESITECOLUMN1 = ITEMS.register(
			"column/polished_andesite_column1", () -> new BlockItem(BlockRegistry.POLISHED_ANDESITE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_ANDESITECOLUMN2 = ITEMS.register(
			"column/polished_andesite_column2", () -> new BlockItem(BlockRegistry.POLISHED_ANDESITE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COBBLESTONECOLUMN0 = ITEMS.register("column/cobblestone_column0",
			() -> new BlockItem(BlockRegistry.COBBLESTONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COBBLESTONECOLUMN1 = ITEMS.register("column/cobblestone_column1",
			() -> new BlockItem(BlockRegistry.COBBLESTONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COBBLESTONECOLUMN2 = ITEMS.register("column/cobblestone_column2",
			() -> new BlockItem(BlockRegistry.COBBLESTONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_spruce_log_column0", () -> new BlockItem(BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_spruce_log_column1", () -> new BlockItem(BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_spruce_log_column2", () -> new BlockItem(BlockRegistry.STRIPPED_SPRUCE_LOG_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_birch_log_column0", () -> new BlockItem(BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_birch_log_column1", () -> new BlockItem(BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_birch_log_column2", () -> new BlockItem(BlockRegistry.STRIPPED_BIRCH_LOG_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_jungle_log_column0", () -> new BlockItem(BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_jungle_log_column1", () -> new BlockItem(BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_jungle_log_column2", () -> new BlockItem(BlockRegistry.STRIPPED_JUNGLE_LOG_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_acacia_log_column0", () -> new BlockItem(BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_acacia_log_column1", () -> new BlockItem(BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_acacia_log_column2", () -> new BlockItem(BlockRegistry.STRIPPED_ACACIA_LOG_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_dark_oak_log_column0",
			() -> new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_dark_oak_log_column1",
			() -> new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_dark_oak_log_column2",
			() -> new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_LOG_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_OAK_LOGCOLUMN0 = ITEMS.register(
			"column/stripped_oak_log_column0",
			() -> new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_OAK_LOGCOLUMN1 = ITEMS.register(
			"column/stripped_oak_log_column1",
			() -> new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_OAK_LOGCOLUMN2 = ITEMS.register(
			"column/stripped_oak_log_column2",
			() -> new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> LAPIS_BLOCKCOLUMN0 = ITEMS.register("column/lapis_block_column0",
			() -> new BlockItem(BlockRegistry.LAPIS_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> LAPIS_BLOCKCOLUMN1 = ITEMS.register("column/lapis_block_column1",
			() -> new BlockItem(BlockRegistry.LAPIS_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> LAPIS_BLOCKCOLUMN2 = ITEMS.register("column/lapis_block_column2",
			() -> new BlockItem(BlockRegistry.LAPIS_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GOLD_BLOCKCOLUMN0 = ITEMS.register("column/gold_block_column0",
			() -> new BlockItem(BlockRegistry.GOLD_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GOLD_BLOCKCOLUMN1 = ITEMS.register("column/gold_block_column1",
			() -> new BlockItem(BlockRegistry.GOLD_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> GOLD_BLOCKCOLUMN2 = ITEMS.register("column/gold_block_column2",
			() -> new BlockItem(BlockRegistry.GOLD_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> IRON_BLOCKCOLUMN0 = ITEMS.register("column/iron_block_column0",
			() -> new BlockItem(BlockRegistry.IRON_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> IRON_BLOCKCOLUMN1 = ITEMS.register("column/iron_block_column1",
			() -> new BlockItem(BlockRegistry.IRON_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> IRON_BLOCKCOLUMN2 = ITEMS.register("column/iron_block_column2",
			() -> new BlockItem(BlockRegistry.IRON_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIAMOND_BLOCKCOLUMN0 = ITEMS.register("column/diamond_block_column0",
			() -> new BlockItem(BlockRegistry.DIAMOND_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIAMOND_BLOCKCOLUMN1 = ITEMS.register("column/diamond_block_column1",
			() -> new BlockItem(BlockRegistry.DIAMOND_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DIAMOND_BLOCKCOLUMN2 = ITEMS.register("column/diamond_block_column2",
			() -> new BlockItem(BlockRegistry.DIAMOND_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHERITE_BLOCKCOLUMN0 = ITEMS.register(
			"column/netherite_block_column0",
			() -> new BlockItem(BlockRegistry.NETHERITE_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHERITE_BLOCKCOLUMN1 = ITEMS.register(
			"column/netherite_block_column1",
			() -> new BlockItem(BlockRegistry.NETHERITE_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHERITE_BLOCKCOLUMN2 = ITEMS.register(
			"column/netherite_block_column2",
			() -> new BlockItem(BlockRegistry.NETHERITE_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SANDSTONECOLUMN0 = ITEMS.register("column/sandstone_column0",
			() -> new BlockItem(BlockRegistry.SANDSTONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SANDSTONECOLUMN1 = ITEMS.register("column/sandstone_column1",
			() -> new BlockItem(BlockRegistry.SANDSTONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SANDSTONECOLUMN2 = ITEMS.register("column/sandstone_column2",
			() -> new BlockItem(BlockRegistry.SANDSTONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_SANDSTONECOLUMN0 = ITEMS.register(
			"column/chiseled_sandstone_column0", () -> new BlockItem(BlockRegistry.CHISELED_SANDSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_SANDSTONECOLUMN1 = ITEMS.register(
			"column/chiseled_sandstone_column1", () -> new BlockItem(BlockRegistry.CHISELED_SANDSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_SANDSTONECOLUMN2 = ITEMS.register(
			"column/chiseled_sandstone_column2", () -> new BlockItem(BlockRegistry.CHISELED_SANDSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_SANDSTONECOLUMN0 = ITEMS.register("column/cut_sandstone_column0",
			() -> new BlockItem(BlockRegistry.CUT_SANDSTONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_SANDSTONECOLUMN1 = ITEMS.register("column/cut_sandstone_column1",
			() -> new BlockItem(BlockRegistry.CUT_SANDSTONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_SANDSTONECOLUMN2 = ITEMS.register("column/cut_sandstone_column2",
			() -> new BlockItem(BlockRegistry.CUT_SANDSTONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_SANDSTONECOLUMN0 = ITEMS.register(
			"column/smooth_sandstone_column0",
			() -> new BlockItem(BlockRegistry.SMOOTH_SANDSTONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_SANDSTONECOLUMN1 = ITEMS.register(
			"column/smooth_sandstone_column1",
			() -> new BlockItem(BlockRegistry.SMOOTH_SANDSTONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_SANDSTONECOLUMN2 = ITEMS.register(
			"column/smooth_sandstone_column2",
			() -> new BlockItem(BlockRegistry.SMOOTH_SANDSTONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BRICKSCOLUMN0 = ITEMS.register("column/bricks_column0",
			() -> new BlockItem(BlockRegistry.BRICKS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BRICKSCOLUMN1 = ITEMS.register("column/bricks_column1",
			() -> new BlockItem(BlockRegistry.BRICKS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BRICKSCOLUMN2 = ITEMS.register("column/bricks_column2",
			() -> new BlockItem(BlockRegistry.BRICKS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_COBBLESTONECOLUMN0 = ITEMS.register(
			"column/mossy_cobblestone_column0", () -> new BlockItem(BlockRegistry.MOSSY_COBBLESTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_COBBLESTONECOLUMN1 = ITEMS.register(
			"column/mossy_cobblestone_column1", () -> new BlockItem(BlockRegistry.MOSSY_COBBLESTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_COBBLESTONECOLUMN2 = ITEMS.register(
			"column/mossy_cobblestone_column2", () -> new BlockItem(BlockRegistry.MOSSY_COBBLESTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> OBSIDIANCOLUMN0 = ITEMS.register("column/obsidian_column0",
			() -> new BlockItem(BlockRegistry.OBSIDIAN_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> OBSIDIANCOLUMN1 = ITEMS.register("column/obsidian_column1",
			() -> new BlockItem(BlockRegistry.OBSIDIAN_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> OBSIDIANCOLUMN2 = ITEMS.register("column/obsidian_column2",
			() -> new BlockItem(BlockRegistry.OBSIDIAN_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BASALTCOLUMN0 = ITEMS.register("column/basalt_column0",
			() -> new BlockItem(BlockRegistry.BASALT_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BASALTCOLUMN1 = ITEMS.register("column/basalt_column1",
			() -> new BlockItem(BlockRegistry.BASALT_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> BASALTCOLUMN2 = ITEMS.register("column/basalt_column2",
			() -> new BlockItem(BlockRegistry.BASALT_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BASALTCOLUMN0 = ITEMS.register(
			"column/polished_basalt_column0",
			() -> new BlockItem(BlockRegistry.POLISHED_BASALT_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BASALTCOLUMN1 = ITEMS.register(
			"column/polished_basalt_column1",
			() -> new BlockItem(BlockRegistry.POLISHED_BASALT_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BASALTCOLUMN2 = ITEMS.register(
			"column/polished_basalt_column2",
			() -> new BlockItem(BlockRegistry.POLISHED_BASALT_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STONE_BRICKSCOLUMN0 = ITEMS.register("column/stone_bricks_column0",
			() -> new BlockItem(BlockRegistry.STONE_BRICKS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STONE_BRICKSCOLUMN1 = ITEMS.register("column/stone_bricks_column1",
			() -> new BlockItem(BlockRegistry.STONE_BRICKS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STONE_BRICKSCOLUMN2 = ITEMS.register("column/stone_bricks_column2",
			() -> new BlockItem(BlockRegistry.STONE_BRICKS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_STONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/mossy_stone_bricks_column0", () -> new BlockItem(BlockRegistry.MOSSY_STONE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_STONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/mossy_stone_bricks_column1", () -> new BlockItem(BlockRegistry.MOSSY_STONE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> MOSSY_STONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/mossy_stone_bricks_column2", () -> new BlockItem(BlockRegistry.MOSSY_STONE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_STONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/cracked_stone_bricks_column0", () -> new BlockItem(BlockRegistry.CRACKED_STONE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_STONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/cracked_stone_bricks_column1", () -> new BlockItem(BlockRegistry.CRACKED_STONE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_STONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/cracked_stone_bricks_column2", () -> new BlockItem(BlockRegistry.CRACKED_STONE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_STONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/chiseled_stone_bricks_column0",
			() -> new BlockItem(BlockRegistry.CHISELED_STONE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_STONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/chiseled_stone_bricks_column1",
			() -> new BlockItem(BlockRegistry.CHISELED_STONE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_STONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/chiseled_stone_bricks_column2",
			() -> new BlockItem(BlockRegistry.CHISELED_STONE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHER_BRICKSCOLUMN0 = ITEMS.register("column/nether_bricks_column0",
			() -> new BlockItem(BlockRegistry.NETHER_BRICKS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHER_BRICKSCOLUMN1 = ITEMS.register("column/nether_bricks_column1",
			() -> new BlockItem(BlockRegistry.NETHER_BRICKS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> NETHER_BRICKSCOLUMN2 = ITEMS.register("column/nether_bricks_column2",
			() -> new BlockItem(BlockRegistry.NETHER_BRICKS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> EMERALD_BLOCKCOLUMN0 = ITEMS.register("column/emerald_block_column0",
			() -> new BlockItem(BlockRegistry.EMERALD_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> EMERALD_BLOCKCOLUMN1 = ITEMS.register("column/emerald_block_column1",
			() -> new BlockItem(BlockRegistry.EMERALD_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> EMERALD_BLOCKCOLUMN2 = ITEMS.register("column/emerald_block_column2",
			() -> new BlockItem(BlockRegistry.EMERALD_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BLOCKCOLUMN0 = ITEMS.register("column/quartz_block_column0",
			() -> new BlockItem(BlockRegistry.QUARTZ_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BLOCKCOLUMN1 = ITEMS.register("column/quartz_block_column1",
			() -> new BlockItem(BlockRegistry.QUARTZ_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BLOCKCOLUMN2 = ITEMS.register("column/quartz_block_column2",
			() -> new BlockItem(BlockRegistry.QUARTZ_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_PILLARCOLUMN0 = ITEMS.register("column/quartz_pillar_column0",
			() -> new BlockItem(BlockRegistry.QUARTZ_PILLAR_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_PILLARCOLUMN1 = ITEMS.register("column/quartz_pillar_column1",
			() -> new BlockItem(BlockRegistry.QUARTZ_PILLAR_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_PILLARCOLUMN2 = ITEMS.register("column/quartz_pillar_column2",
			() -> new BlockItem(BlockRegistry.QUARTZ_PILLAR_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_QUARTZ_BLOCKCOLUMN0 = ITEMS.register(
			"column/smooth_quartz_block_column0", () -> new BlockItem(BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_QUARTZ_BLOCKCOLUMN1 = ITEMS.register(
			"column/smooth_quartz_block_column1", () -> new BlockItem(BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_QUARTZ_BLOCKCOLUMN2 = ITEMS.register(
			"column/smooth_quartz_block_column2", () -> new BlockItem(BlockRegistry.SMOOTH_QUARTZ_BLOCK_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_QUARTZ_BLOCKCOLUMN0 = ITEMS.register(
			"column/chiseled_quartz_block_column0",
			() -> new BlockItem(BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_QUARTZ_BLOCKCOLUMN1 = ITEMS.register(
			"column/chiseled_quartz_block_column1",
			() -> new BlockItem(BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_QUARTZ_BLOCKCOLUMN2 = ITEMS.register(
			"column/chiseled_quartz_block_column2",
			() -> new BlockItem(BlockRegistry.CHISELED_QUARTZ_BLOCK_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINECOLUMN0 = ITEMS.register("column/prismarine_column0",
			() -> new BlockItem(BlockRegistry.PRISMARINE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINECOLUMN1 = ITEMS.register("column/prismarine_column1",
			() -> new BlockItem(BlockRegistry.PRISMARINE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINECOLUMN2 = ITEMS.register("column/prismarine_column2",
			() -> new BlockItem(BlockRegistry.PRISMARINE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINE_BRICKSCOLUMN0 = ITEMS.register(
			"column/prismarine_bricks_column0", () -> new BlockItem(BlockRegistry.PRISMARINE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINE_BRICKSCOLUMN1 = ITEMS.register(
			"column/prismarine_bricks_column1", () -> new BlockItem(BlockRegistry.PRISMARINE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PRISMARINE_BRICKSCOLUMN2 = ITEMS.register(
			"column/prismarine_bricks_column2", () -> new BlockItem(BlockRegistry.PRISMARINE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DARK_PRISMARINECOLUMN0 = ITEMS.register(
			"column/dark_prismarine_column0",
			() -> new BlockItem(BlockRegistry.DARK_PRISMARINE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DARK_PRISMARINECOLUMN1 = ITEMS.register(
			"column/dark_prismarine_column1",
			() -> new BlockItem(BlockRegistry.DARK_PRISMARINE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> DARK_PRISMARINECOLUMN2 = ITEMS.register(
			"column/dark_prismarine_column2",
			() -> new BlockItem(BlockRegistry.DARK_PRISMARINE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COAL_BLOCKCOLUMN0 = ITEMS.register("column/coal_block_column0",
			() -> new BlockItem(BlockRegistry.COAL_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COAL_BLOCKCOLUMN1 = ITEMS.register("column/coal_block_column1",
			() -> new BlockItem(BlockRegistry.COAL_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> COAL_BLOCKCOLUMN2 = ITEMS.register("column/coal_block_column2",
			() -> new BlockItem(BlockRegistry.COAL_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_RED_SANDSTONECOLUMN0 = ITEMS.register(
			"column/chiseled_red_sandstone_column0",
			() -> new BlockItem(BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_RED_SANDSTONECOLUMN1 = ITEMS.register(
			"column/chiseled_red_sandstone_column1",
			() -> new BlockItem(BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_RED_SANDSTONECOLUMN2 = ITEMS.register(
			"column/chiseled_red_sandstone_column2",
			() -> new BlockItem(BlockRegistry.CHISELED_RED_SANDSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_SANDSTONECOLUMN0 = ITEMS.register("column/red_sandstone_column0",
			() -> new BlockItem(BlockRegistry.RED_SANDSTONE_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_SANDSTONECOLUMN1 = ITEMS.register("column/red_sandstone_column1",
			() -> new BlockItem(BlockRegistry.RED_SANDSTONE_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_SANDSTONECOLUMN2 = ITEMS.register("column/red_sandstone_column2",
			() -> new BlockItem(BlockRegistry.RED_SANDSTONE_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_RED_SANDSTONECOLUMN0 = ITEMS.register(
			"column/cut_red_sandstone_column0", () -> new BlockItem(BlockRegistry.CUT_RED_SANDSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_RED_SANDSTONECOLUMN1 = ITEMS.register(
			"column/cut_red_sandstone_column1", () -> new BlockItem(BlockRegistry.CUT_RED_SANDSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CUT_RED_SANDSTONECOLUMN2 = ITEMS.register(
			"column/cut_red_sandstone_column2", () -> new BlockItem(BlockRegistry.CUT_RED_SANDSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_RED_SANDSTONECOLUMN0 = ITEMS.register(
			"column/smooth_red_sandstone_column0", () -> new BlockItem(BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_RED_SANDSTONECOLUMN1 = ITEMS.register(
			"column/smooth_red_sandstone_column1", () -> new BlockItem(BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_RED_SANDSTONECOLUMN2 = ITEMS.register(
			"column/smooth_red_sandstone_column2", () -> new BlockItem(BlockRegistry.SMOOTH_RED_SANDSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> END_STONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/end_stone_bricks_column0",
			() -> new BlockItem(BlockRegistry.END_STONE_BRICKS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> END_STONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/end_stone_bricks_column1",
			() -> new BlockItem(BlockRegistry.END_STONE_BRICKS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> END_STONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/end_stone_bricks_column2",
			() -> new BlockItem(BlockRegistry.END_STONE_BRICKS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_NETHER_BRICKSCOLUMN0 = ITEMS.register(
			"column/red_nether_bricks_column0", () -> new BlockItem(BlockRegistry.RED_NETHER_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_NETHER_BRICKSCOLUMN1 = ITEMS.register(
			"column/red_nether_bricks_column1", () -> new BlockItem(BlockRegistry.RED_NETHER_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> RED_NETHER_BRICKSCOLUMN2 = ITEMS.register(
			"column/red_nether_bricks_column2", () -> new BlockItem(BlockRegistry.RED_NETHER_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEMCOLUMN0 = ITEMS.register(
			"column/stripped_crimson_stem_column0",
			() -> new BlockItem(BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEMCOLUMN1 = ITEMS.register(
			"column/stripped_crimson_stem_column1",
			() -> new BlockItem(BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEMCOLUMN2 = ITEMS.register(
			"column/stripped_crimson_stem_column2",
			() -> new BlockItem(BlockRegistry.STRIPPED_CRIMSON_STEM_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEMCOLUMN0 = ITEMS.register(
			"column/stripped_warped_stem_column0", () -> new BlockItem(BlockRegistry.STRIPPED_WARPED_STEM_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEMCOLUMN1 = ITEMS.register(
			"column/stripped_warped_stem_column1", () -> new BlockItem(BlockRegistry.STRIPPED_WARPED_STEM_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEMCOLUMN2 = ITEMS.register(
			"column/stripped_warped_stem_column2", () -> new BlockItem(BlockRegistry.STRIPPED_WARPED_STEM_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANCIENT_DEBRISCOLUMN0 = ITEMS.register(
			"column/ancient_debris_column0",
			() -> new BlockItem(BlockRegistry.ANCIENT_DEBRIS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANCIENT_DEBRISCOLUMN1 = ITEMS.register(
			"column/ancient_debris_column1",
			() -> new BlockItem(BlockRegistry.ANCIENT_DEBRIS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> ANCIENT_DEBRISCOLUMN2 = ITEMS.register(
			"column/ancient_debris_column2",
			() -> new BlockItem(BlockRegistry.ANCIENT_DEBRIS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRYING_OBSIDIANCOLUMN0 = ITEMS.register(
			"column/crying_obsidian_column0",
			() -> new BlockItem(BlockRegistry.CRYING_OBSIDIAN_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRYING_OBSIDIANCOLUMN1 = ITEMS.register(
			"column/crying_obsidian_column1",
			() -> new BlockItem(BlockRegistry.CRYING_OBSIDIAN_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRYING_OBSIDIANCOLUMN2 = ITEMS.register(
			"column/crying_obsidian_column2",
			() -> new BlockItem(BlockRegistry.CRYING_OBSIDIAN_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_POLISHED_BLACKSTONECOLUMN0 = ITEMS.register(
			"column/chiseled_polished_blackstone_column0",
			() -> new BlockItem(BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_POLISHED_BLACKSTONECOLUMN1 = ITEMS.register(
			"column/chiseled_polished_blackstone_column1",
			() -> new BlockItem(BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_POLISHED_BLACKSTONECOLUMN2 = ITEMS.register(
			"column/chiseled_polished_blackstone_column2",
			() -> new BlockItem(BlockRegistry.CHISELED_POLISHED_BLACKSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONECOLUMN0 = ITEMS.register(
			"column/polished_blackstone_column0", () -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONECOLUMN1 = ITEMS.register(
			"column/polished_blackstone_column1", () -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONECOLUMN2 = ITEMS.register(
			"column/polished_blackstone_column2", () -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_POLISHED_BLACKSTONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/cracked_polished_blackstone_bricks_column0",
			() -> new BlockItem(BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_POLISHED_BLACKSTONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/cracked_polished_blackstone_bricks_column1",
			() -> new BlockItem(BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_POLISHED_BLACKSTONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/cracked_polished_blackstone_bricks_column2",
			() -> new BlockItem(BlockRegistry.CRACKED_POLISHED_BLACKSTONE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONE_BRICKSCOLUMN0 = ITEMS.register(
			"column/polished_blackstone_bricks_column0",
			() -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONE_BRICKSCOLUMN1 = ITEMS.register(
			"column/polished_blackstone_bricks_column1",
			() -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> POLISHED_BLACKSTONE_BRICKSCOLUMN2 = ITEMS.register(
			"column/polished_blackstone_bricks_column2",
			() -> new BlockItem(BlockRegistry.POLISHED_BLACKSTONE_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BRICKSCOLUMN0 = ITEMS.register("column/quartz_bricks_column0",
			() -> new BlockItem(BlockRegistry.QUARTZ_BRICKS_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BRICKSCOLUMN1 = ITEMS.register("column/quartz_bricks_column1",
			() -> new BlockItem(BlockRegistry.QUARTZ_BRICKS_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> QUARTZ_BRICKSCOLUMN2 = ITEMS.register("column/quartz_bricks_column2",
			() -> new BlockItem(BlockRegistry.QUARTZ_BRICKS_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_NETHER_BRICKSCOLUMN0 = ITEMS.register(
			"column/chiseled_nether_bricks_column0",
			() -> new BlockItem(BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_NETHER_BRICKSCOLUMN1 = ITEMS.register(
			"column/chiseled_nether_bricks_column1",
			() -> new BlockItem(BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CHISELED_NETHER_BRICKSCOLUMN2 = ITEMS.register(
			"column/chiseled_nether_bricks_column2",
			() -> new BlockItem(BlockRegistry.CHISELED_NETHER_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_NETHER_BRICKSCOLUMN0 = ITEMS.register(
			"column/cracked_nether_bricks_column0",
			() -> new BlockItem(BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_NETHER_BRICKSCOLUMN1 = ITEMS.register(
			"column/cracked_nether_bricks_column1",
			() -> new BlockItem(BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> CRACKED_NETHER_BRICKSCOLUMN2 = ITEMS.register(
			"column/cracked_nether_bricks_column2",
			() -> new BlockItem(BlockRegistry.CRACKED_NETHER_BRICKS_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_COPPERCOLUMN0 = ITEMS.register(
	            "column/oxidized_copper_column0",
	            () -> new BlockItem(BlockRegistry.OXIDIZED_COPPER_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_COPPERCOLUMN1 = ITEMS.register(
	            "column/oxidized_copper_column1",
	            () -> new BlockItem(BlockRegistry.OXIDIZED_COPPER_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_COPPERCOLUMN2 = ITEMS.register(
	            "column/oxidized_copper_column2",
	            () -> new BlockItem(BlockRegistry.OXIDIZED_COPPER_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_COPPERCOLUMN0 = ITEMS.register(
	            "column/weathered_copper_column0",
	            () -> new BlockItem(BlockRegistry.WEATHERED_COPPER_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_COPPERCOLUMN1 = ITEMS.register(
	            "column/weathered_copper_column1",
	            () -> new BlockItem(BlockRegistry.WEATHERED_COPPER_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_COPPERCOLUMN2 = ITEMS.register(
	            "column/weathered_copper_column2",
	            () -> new BlockItem(BlockRegistry.WEATHERED_COPPER_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_COPPERCOLUMN0 = ITEMS.register(
	            "column/exposed_copper_column0",
	            () -> new BlockItem(BlockRegistry.EXPOSED_COPPER_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_COPPERCOLUMN1 = ITEMS.register(
	            "column/exposed_copper_column1",
	            () -> new BlockItem(BlockRegistry.EXPOSED_COPPER_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_COPPERCOLUMN2 = ITEMS.register(
	            "column/exposed_copper_column2",
	            () -> new BlockItem(BlockRegistry.EXPOSED_COPPER_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> COPPER_BLOCKCOLUMN0 = ITEMS.register("column/copper_block_column0",
	            () -> new BlockItem(BlockRegistry.COPPER_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> COPPER_BLOCKCOLUMN1 = ITEMS.register("column/copper_block_column1",
	            () -> new BlockItem(BlockRegistry.COPPER_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> COPPER_BLOCKCOLUMN2 = ITEMS.register("column/copper_block_column2",
	            () -> new BlockItem(BlockRegistry.COPPER_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_CUT_COPPERCOLUMN0 = ITEMS.register(
	            "column/oxidized_cut_copper_column0", () -> new BlockItem(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN0.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_CUT_COPPERCOLUMN1 = ITEMS.register(
	            "column/oxidized_cut_copper_column1", () -> new BlockItem(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN1.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> OXIDIZED_CUT_COPPERCOLUMN2 = ITEMS.register(
	            "column/oxidized_cut_copper_column2", () -> new BlockItem(BlockRegistry.OXIDIZED_CUT_COPPER_COLUMN2.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_CUT_COPPERCOLUMN0 = ITEMS.register(
	            "column/weathered_cut_copper_column0",
	            () -> new BlockItem(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN0.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_CUT_COPPERCOLUMN1 = ITEMS.register(
	            "column/weathered_cut_copper_column1",
	            () -> new BlockItem(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN1.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> WEATHERED_CUT_COPPERCOLUMN2 = ITEMS.register(
	            "column/weathered_cut_copper_column2",
	            () -> new BlockItem(BlockRegistry.WEATHERED_CUT_COPPER_COLUMN2.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_CUT_COPPERCOLUMN0 = ITEMS.register(
	            "column/exposed_cut_copper_column0", () -> new BlockItem(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN0.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_CUT_COPPERCOLUMN1 = ITEMS.register(
	            "column/exposed_cut_copper_column1", () -> new BlockItem(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN1.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> EXPOSED_CUT_COPPERCOLUMN2 = ITEMS.register(
	            "column/exposed_cut_copper_column2", () -> new BlockItem(BlockRegistry.EXPOSED_CUT_COPPER_COLUMN2.get(),
	                    new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> CUT_COPPERCOLUMN0 = ITEMS.register("column/cut_copper_column0",
	            () -> new BlockItem(BlockRegistry.CUT_COPPER_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> CUT_COPPERCOLUMN1 = ITEMS.register("column/cut_copper_column1",
	            () -> new BlockItem(BlockRegistry.CUT_COPPER_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	    public static final RegistryObject<BlockItem> CUT_COPPERCOLUMN2 = ITEMS.register("column/cut_copper_column2",
	            () -> new BlockItem(BlockRegistry.CUT_COPPER_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_COPPER_BLOCKCOLUMN0 = ITEMS.register(
			"column/waxed_copper_block_column0", () -> new BlockItem(BlockRegistry.WAXED_COPPER_BLOCK_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_COPPER_BLOCKCOLUMN1 = ITEMS.register(
			"column/waxed_copper_block_column1", () -> new BlockItem(BlockRegistry.WAXED_COPPER_BLOCK_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_COPPER_BLOCKCOLUMN2 = ITEMS.register(
			"column/waxed_copper_block_column2", () -> new BlockItem(BlockRegistry.WAXED_COPPER_BLOCK_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_weathered_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_weathered_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_weathered_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_exposed_copper_column0", () -> new BlockItem(BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_exposed_copper_column1", () -> new BlockItem(BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_exposed_copper_column2", () -> new BlockItem(BlockRegistry.WAXED_EXPOSED_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_oxidized_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_oxidized_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_oxidized_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_CUT_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_oxidized_cut_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_CUT_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_oxidized_cut_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_OXIDIZED_CUT_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_oxidized_cut_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_OXIDIZED_CUT_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_CUT_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_weathered_cut_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_CUT_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_weathered_cut_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_WEATHERED_CUT_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_weathered_cut_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_WEATHERED_CUT_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_CUT_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_exposed_cut_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN0.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_CUT_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_exposed_cut_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN1.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_EXPOSED_CUT_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_exposed_cut_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_EXPOSED_CUT_COPPER_COLUMN2.get(),
					new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_CUT_COPPERCOLUMN0 = ITEMS.register(
			"column/waxed_cut_copper_column0",
			() -> new BlockItem(BlockRegistry.WAXED_CUT_COPPER_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_CUT_COPPERCOLUMN1 = ITEMS.register(
			"column/waxed_cut_copper_column1",
			() -> new BlockItem(BlockRegistry.WAXED_CUT_COPPER_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> WAXED_CUT_COPPERCOLUMN2 = ITEMS.register(
			"column/waxed_cut_copper_column2",
			() -> new BlockItem(BlockRegistry.WAXED_CUT_COPPER_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_BASALTCOLUMN0 = ITEMS.register("column/smooth_basalt_column0",
			() -> new BlockItem(BlockRegistry.SMOOTH_BASALT_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_BASALTCOLUMN1 = ITEMS.register("column/smooth_basalt_column1",
			() -> new BlockItem(BlockRegistry.SMOOTH_BASALT_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> SMOOTH_BASALTCOLUMN2 = ITEMS.register("column/smooth_basalt_column2",
			() -> new BlockItem(BlockRegistry.SMOOTH_BASALT_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_BLOCKCOLUMN0 = ITEMS.register("column/purpur_block_column0",
			() -> new BlockItem(BlockRegistry.PURPUR_BLOCK_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_BLOCKCOLUMN1 = ITEMS.register("column/purpur_block_column1",
			() -> new BlockItem(BlockRegistry.PURPUR_BLOCK_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_BLOCKCOLUMN2 = ITEMS.register("column/purpur_block_column2",
			() -> new BlockItem(BlockRegistry.PURPUR_BLOCK_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_PILLARCOLUMN0 = ITEMS.register("column/purpur_pillar_column0",
			() -> new BlockItem(BlockRegistry.PURPUR_PILLAR_COLUMN0.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_PILLARCOLUMN1 = ITEMS.register("column/purpur_pillar_column1",
			() -> new BlockItem(BlockRegistry.PURPUR_PILLAR_COLUMN1.get(), new Item.Properties().tab(COLUMN_GROUP)));
	public static final RegistryObject<BlockItem> PURPUR_PILLARCOLUMN2 = ITEMS.register("column/purpur_pillar_column2",
			() -> new BlockItem(BlockRegistry.PURPUR_PILLAR_COLUMN2.get(), new Item.Properties().tab(COLUMN_GROUP)));

	public static void registerItems(IEventBus modBus) {
	        ITEMS.register(modBus);
	    }
}