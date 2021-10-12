package net.mcreator.mindustryinmincraft.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;

import net.mcreator.mindustryinmincraft.MindustryinmincraftMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class ConveyerValueProcedure {
	public static double executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency x for procedure ConveyerValue!");
			return 0;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency y for procedure ConveyerValue!");
			return 0;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency z for procedure ConveyerValue!");
			return 0;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MindustryinmincraftMod.LOGGER.warn("Failed to load dependency world for procedure ConveyerValue!");
			return 0;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x - 1), (int) y, (int) z),
						((World) world).getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock());
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) z),
						((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock());
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) (z - 1)),
						((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock());
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) (z + 1)),
						((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock());
			return 5;
		}
		return 0;
	}
}
