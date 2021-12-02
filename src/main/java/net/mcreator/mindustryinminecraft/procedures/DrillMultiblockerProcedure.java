package net.mcreator.mindustryinminecraft.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModBlocks;

public class DrillMultiblockerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Placed = 0;
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), MindustryinminecraftModBlocks.DRILL.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), MindustryinminecraftModBlocks.DRILL_13.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), MindustryinminecraftModBlocks.DRILL_11.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), MindustryinminecraftModBlocks.DRILL_12.defaultBlockState(), 3);
		} else {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}
