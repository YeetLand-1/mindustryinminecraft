package net.mcreator.mindustryinminecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModBlocks;

public class DrillUpdateTick_GenerateStuffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MindustryinminecraftModBlocks.STONE_COPPER_ORE) {
			CopperDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MindustryinminecraftModBlocks.STONE_LEAD_ORE) {
			LeadDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MindustryinminecraftModBlocks.STONE_COAL_ORE) {
			CoalDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MindustryinminecraftModBlocks.STONE_SCRAP_ORE) {
			ScrapDrillingProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
				.getBlock() == MindustryinminecraftModBlocks.STONE_TITANIUM_ORE) {
			TitaniumDrillingProcedure.execute(world, x, y, z);
		}
	}
}
