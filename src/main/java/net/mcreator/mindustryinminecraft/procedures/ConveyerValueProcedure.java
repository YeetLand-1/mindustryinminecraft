package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ConveyerValueProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (!((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == (ItemStack.EMPTY).getItem())) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(x - 1, y, z), _level.getBlockState(new BlockPos(x - 1, y, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(x + 1, y, z), _level.getBlockState(new BlockPos(x + 1, y, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(x, y, z - 1), _level.getBlockState(new BlockPos(x, y, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(x, y, z + 1), _level.getBlockState(new BlockPos(x, y, z + 1)).getBlock());
			return 5;
		}
		return 0;
	}
}
