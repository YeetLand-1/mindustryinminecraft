package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DrillMultiblockerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Placed = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			world.setBlock(new BlockPos(x, y, z), MindustryinminecraftModBlocks.DRILL.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z), MindustryinminecraftModBlocks.DRILL_13.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), MindustryinminecraftModBlocks.DRILL_11.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z - 1), MindustryinminecraftModBlocks.DRILL_12.get().defaultBlockState(), 3);
		} else {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
