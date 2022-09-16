package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoalDrillingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean Itemset = false;
		double slot = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MindustryinminecraftModBlocks.STONE_COAL_ORE.get()) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x - 1, y, z), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get()
					&& (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x - 1, y, z - 1), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z - 1));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z - 2), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 2));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x + 1, y, z - 2))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get()
					&& (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x + 1, y, z - 2), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z - 2));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x + 2, y, z - 1))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get()
					&& (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x + 2, y, z - 1), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 2, y, z - 1));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x + 2, y, z), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 2, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get()
					&& (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x + 1, y, z + 1), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z + 1));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == MindustryinminecraftModBlocks.CONVEYER.get() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z + 1), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL.get());
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
			} else {
				while (Itemset == false && slot != 10) {
					if (!((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) slot)).getItem() == (ItemStack.EMPTY).getItem())) {
						slot = slot + 1;
					} else {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = (int) slot;
								final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COPPER.get());
								_setstack.setCount(1);
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
						Itemset = true;
					}
				}
			}
		}
	}
}
