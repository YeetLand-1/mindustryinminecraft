
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mindustryinminecraft.block.Turret1Block;
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
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

public class MindustryinminecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MindustryinminecraftMod.MODID);
	public static final RegistryObject<Block> ROUTER = REGISTRY.register("router", () -> new ROUTERBlock());
	public static final RegistryObject<Block> CONVEYER = REGISTRY.register("conveyer", () -> new ConveyerBlock());
	public static final RegistryObject<Block> DRILL = REGISTRY.register("drill", () -> new DrillBlock());
	public static final RegistryObject<Block> DRILL_11 = REGISTRY.register("drill_11", () -> new Drill11Block());
	public static final RegistryObject<Block> DRILL_12 = REGISTRY.register("drill_12", () -> new Drill12Block());
	public static final RegistryObject<Block> DRILL_13 = REGISTRY.register("drill_13", () -> new Drill13Block());
	public static final RegistryObject<Block> STONE_COPPER_ORE = REGISTRY.register("stone_copper_ore", () -> new StoneCopperOreBlock());
	public static final RegistryObject<Block> STONE_LEAD_ORE = REGISTRY.register("stone_lead_ore", () -> new StoneLeadOreBlock());
	public static final RegistryObject<Block> STONE_COAL_ORE = REGISTRY.register("stone_coal_ore", () -> new StoneCoalOreBlock());
	public static final RegistryObject<Block> STONE_TITANIUM_ORE = REGISTRY.register("stone_titanium_ore", () -> new StoneTitaniumOreBlock());
	public static final RegistryObject<Block> STONE_SCRAP_ORE = REGISTRY.register("stone_scrap_ore", () -> new StoneScrapOreBlock());
	public static final RegistryObject<Block> JUNCTION = REGISTRY.register("junction", () -> new JunctionBlock());
	public static final RegistryObject<Block> TURRET_1 = REGISTRY.register("turret_1", () -> new Turret1Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ConveyerBlock.registerRenderLayer();
			Turret1Block.registerRenderLayer();
		}
	}
}
