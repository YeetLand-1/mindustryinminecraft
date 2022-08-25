package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModBlocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class SouthfacingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double slot = 0;
		boolean itemset = false;
		slot = 0;
		ConveyerUpdateTickProcedure.execute(world, x, y, z);
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
					_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) (z - 1)),
					_level.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) (z + 1)),
					_level.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) (x - 1), (int) y, (int) z),
					_level.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos((int) (x + 1), (int) y, (int) z),
					_level.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock());
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).getCount());
						});
					}
					return _retval.get();
				}
			}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 0) == 0) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = (new Object() {
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
						}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0));
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, ItemStack.EMPTY);
							}
						});
					}
				}
				ConveyerUpdateTickProcedure.execute(world, x, y, z);
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.CHEST
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.TRAPPED_CHEST) {
			while (itemset == false && slot != 27) {
				ConveyerUpdateTickProcedure.execute(world, x, y, z);
				if (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot) == 64 || new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot) < 64 && !((new Object() {
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
				}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == (new Object() {
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
				}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot)).getItem())) {
					slot = slot + 1;
				} else if (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot) < 64 && (new Object() {
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
				}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == (new Object() {
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
				}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot)).getItem() || (new Object() {
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
				}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot)).getItem() == (ItemStack.EMPTY).getItem()) {
					if ((new Object() {
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
					}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot)).getItem() == (ItemStack.EMPTY).getItem()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
							if (_ent != null) {
								final int _sltid = (int) slot;
								final ItemStack _setstack = (new Object() {
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
								}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0));
								_setstack.setCount(1);
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
							if (_ent != null) {
								final int _sltid = (int) slot;
								final ItemStack _setstack = (new Object() {
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
								}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0));
								_setstack.setCount((int) (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) slot) + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
						if (_ent != null) {
							final int _sltid = 0;
							final int _amount = 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_sltid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
								}
							});
						}
					}
					itemset = true;
				}
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) (z + 1)),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock());
				ConveyerUpdateTickProcedure.execute(world, x, y, z);
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == MindustryinminecraftModBlocks.ROUTER) {
			if (!(new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).getCount());
						});
					}
					return _retval.get();
				}
			}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 0) == 3 || (new Object() {
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == (new Object() {
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 0)).getItem()) || (new Object() {
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
			}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = (new Object() {
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
						}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0));
						_setstack.setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos((int) x, (int) y, (int) (z - 1)), 0) + 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, ItemStack.EMPTY);
							}
						});
					}
				}
				ConveyerUpdateTickProcedure.execute(world, x, y, z);
			}
		}
	}
}
