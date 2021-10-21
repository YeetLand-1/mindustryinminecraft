package net.mcreator.mindustryinminecraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.mindustryinminecraft.block.DrillBlock;
import net.mcreator.mindustryinminecraft.block.Drill13Block;
import net.mcreator.mindustryinminecraft.block.Drill12Block;
import net.mcreator.mindustryinminecraft.block.Drill11Block;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.Map;

public class DrillMultiblockerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency x for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency y for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency z for procedure DrillMultiblocker!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency world for procedure DrillMultiblocker!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Placed = 0;
		if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR)
				&& (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == net.minecraft.block.material.Material.AIR)
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
								.getMaterial() == net.minecraft.block.material.Material.AIR)))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DrillBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Drill13Block.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Drill11Block.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Drill12Block.block.getDefaultState(), 3);
		} else {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}
