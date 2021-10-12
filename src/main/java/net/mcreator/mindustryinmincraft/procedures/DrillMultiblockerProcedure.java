package net.mcreator.mindustryinmincraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.mindustryinmincraft.block.Drill11Block;
import net.mcreator.mindustryinmincraft.MindustryinmincraftMod;

import java.util.Map;

public class DrillMultiblockerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency x for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency y for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency z for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency world for procedure DrillMultiblocker!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Placed = 0;
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Drill11Block.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Drill11Block.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Drill11Block.block.getDefaultState(), 3);
	}
}
