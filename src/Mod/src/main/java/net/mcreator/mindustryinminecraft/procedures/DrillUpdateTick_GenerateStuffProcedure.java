package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DrillUpdateTick_GenerateStuffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_COPPER_ORE.get()) {
			CopperDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_LEAD_ORE.get()) {
			LeadDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_COAL_ORE.get()) {
			CoalDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_SCRAP_ORE.get()) {
			ScrapDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_TITANIUM_ORE.get()) {
			TitaniumDrillingProcedure.execute(world, x, y, z);
		}
	}
}
