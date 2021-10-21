package net.mcreator.mindustryinminecraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.mindustryinminecraft.block.StoneTitaniumOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneScrapOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneLeadOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneCopperOreBlock;
import net.mcreator.mindustryinminecraft.block.StoneCoalOreBlock;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.Map;
import java.util.HashMap;

public class DrillUpdateTick_GenerateStuffProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency x for procedure DrillUpdateTick_GenerateStuff!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency y for procedure DrillUpdateTick_GenerateStuff!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency z for procedure DrillUpdateTick_GenerateStuff!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency world for procedure DrillUpdateTick_GenerateStuff!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneCopperOreBlock.block)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CopperDrillingProcedure.executeProcedure($_dependencies);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneLeadOreBlock.block)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				LeadDrillingProcedure.executeProcedure($_dependencies);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneCoalOreBlock.block)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CoalDrillingProcedure.executeProcedure($_dependencies);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneScrapOreBlock.block)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ScrapDrillingProcedure.executeProcedure($_dependencies);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneTitaniumOreBlock.block)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				TitaniumDrillingProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
