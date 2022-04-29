
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mindustryinminecraft.item.TitaniumItem;
import net.mcreator.mindustryinminecraft.item.Soundtrack2Item;
import net.mcreator.mindustryinminecraft.item.Soundtrack1Item;
import net.mcreator.mindustryinminecraft.item.ScrapItem;
import net.mcreator.mindustryinminecraft.item.Lead1Item;
import net.mcreator.mindustryinminecraft.item.CopperItem;
import net.mcreator.mindustryinminecraft.item.CoalItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MindustryinminecraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ROUTER = register(MindustryinminecraftModBlocks.ROUTER, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item CONVEYER = register(MindustryinminecraftModBlocks.CONVEYER, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item COPPER = register(new CopperItem());
	public static final Item SOUNDTRACK_1 = register(new Soundtrack1Item());
	public static final Item SOUNDTRACK_2 = register(new Soundtrack2Item());
	public static final Item DRILL = register(MindustryinminecraftModBlocks.DRILL, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item DRILL_11 = register(MindustryinminecraftModBlocks.DRILL_11, null);
	public static final Item DRILL_12 = register(MindustryinminecraftModBlocks.DRILL_12, null);
	public static final Item DRILL_13 = register(MindustryinminecraftModBlocks.DRILL_13, null);
	public static final Item STONE_COPPER_ORE = register(MindustryinminecraftModBlocks.STONE_COPPER_ORE, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item STONE_LEAD_ORE = register(MindustryinminecraftModBlocks.STONE_LEAD_ORE, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item STONE_COAL_ORE = register(MindustryinminecraftModBlocks.STONE_COAL_ORE, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item STONE_TITANIUM_ORE = register(MindustryinminecraftModBlocks.STONE_TITANIUM_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item STONE_SCRAP_ORE = register(MindustryinminecraftModBlocks.STONE_SCRAP_ORE, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item TITANIUM = register(new TitaniumItem());
	public static final Item SCRAP = register(new ScrapItem());
	public static final Item COAL = register(new CoalItem());
	public static final Item LEAD_1 = register(new Lead1Item());
	public static final Item JUNCTION = register(MindustryinminecraftModBlocks.JUNCTION, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final Item TURRET_1 = register(MindustryinminecraftModBlocks.TURRET_1, MindustryinminecraftModTabs.TAB_MINDUSTRY);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
