
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mindustryinminecraft.block.StoneTitaniumOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneScrapOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneLeadOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneCopperOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneCoalOreBlock;
import net.mcreator.mindustryinminecraft.block.ROUTERBlock;
import net.mcreator.mindustryinminecraft.block.JunctionBlock;
import net.mcreator.mindustryinminecraft.block.DrillBlock;
import net.mcreator.mindustryinminecraft.block.Drill13Block;
import net.mcreator.mindustryinminecraft.block.Drill12Block;
import net.mcreator.mindustryinminecraft.block.Drill11Block;
import net.mcreator.mindustryinminecraft.block.ConveyerBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MindustryinminecraftModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ROUTER = register(new ROUTERBlock());
	public static final Block CONVEYER = register(new ConveyerBlock());
	public static final Block DRILL = register(new DrillBlock());
	public static final Block DRILL_11 = register(new Drill11Block());
	public static final Block DRILL_12 = register(new Drill12Block());
	public static final Block DRILL_13 = register(new Drill13Block());
	public static final Block STONE_COPPER_ORE = register(new StoneCopperOreBlock());
	public static final Block STONE_LEAD_ORE = register(new StoneLeadOreBlock());
	public static final Block STONE_COAL_ORE = register(new StoneCoalOreBlock());
	public static final Block STONE_TITANIUM_ORE = register(new StoneTitaniumOreBlock());
	public static final Block STONE_SCRAP_ORE = register(new StoneScrapOreBlock());
	public static final Block JUNCTION = register(new JunctionBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ConveyerBlock.registerRenderLayer();
		}
	}
}
