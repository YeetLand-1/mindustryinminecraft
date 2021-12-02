package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class ConveyerValueProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (!((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == (ItemStack.EMPTY).getItem())) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) (x - 1), (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) (x + 1), (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) (z - 1)),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) (z + 1)),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock());
			return 5;
		}
		return 0;
	}
}
