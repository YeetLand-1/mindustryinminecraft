
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

public class MindustryinminecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MindustryinminecraftMod.MODID);
	public static final RegistryObject<Item> ROUTER = block(MindustryinminecraftModBlocks.ROUTER, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> CONVEYER = block(MindustryinminecraftModBlocks.CONVEYER, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> COPPER = REGISTRY.register("copper", () -> new CopperItem());
	public static final RegistryObject<Item> SOUNDTRACK_1 = REGISTRY.register("soundtrack_1", () -> new Soundtrack1Item());
	public static final RegistryObject<Item> SOUNDTRACK_2 = REGISTRY.register("soundtrack_2", () -> new Soundtrack2Item());
	public static final RegistryObject<Item> DRILL = block(MindustryinminecraftModBlocks.DRILL, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> DRILL_11 = block(MindustryinminecraftModBlocks.DRILL_11, null);
	public static final RegistryObject<Item> DRILL_12 = block(MindustryinminecraftModBlocks.DRILL_12, null);
	public static final RegistryObject<Item> DRILL_13 = block(MindustryinminecraftModBlocks.DRILL_13, null);
	public static final RegistryObject<Item> STONE_COPPER_ORE = block(MindustryinminecraftModBlocks.STONE_COPPER_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> STONE_LEAD_ORE = block(MindustryinminecraftModBlocks.STONE_LEAD_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> STONE_COAL_ORE = block(MindustryinminecraftModBlocks.STONE_COAL_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> STONE_TITANIUM_ORE = block(MindustryinminecraftModBlocks.STONE_TITANIUM_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> STONE_SCRAP_ORE = block(MindustryinminecraftModBlocks.STONE_SCRAP_ORE,
			MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> TITANIUM = REGISTRY.register("titanium", () -> new TitaniumItem());
	public static final RegistryObject<Item> SCRAP = REGISTRY.register("scrap", () -> new ScrapItem());
	public static final RegistryObject<Item> COAL = REGISTRY.register("coal", () -> new CoalItem());
	public static final RegistryObject<Item> LEAD_1 = REGISTRY.register("lead_1", () -> new Lead1Item());
	public static final RegistryObject<Item> JUNCTION = block(MindustryinminecraftModBlocks.JUNCTION, MindustryinminecraftModTabs.TAB_MINDUSTRY);
	public static final RegistryObject<Item> TURRET_1 = block(MindustryinminecraftModBlocks.TURRET_1, MindustryinminecraftModTabs.TAB_MINDUSTRY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
