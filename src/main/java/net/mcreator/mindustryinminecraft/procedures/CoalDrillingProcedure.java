package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModItems;
import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModBlocks;

import java.util.concurrent.atomic.AtomicReference;

public class CoalDrillingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean Itemset = false;
		double slot = 0;
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MindustryinminecraftModBlocks.STONE_COAL_ORE) {
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x - 1), (int) y, (int) z), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z - 2)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z - 2)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x + 2), (int) y, (int) z), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x + 2), (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == MindustryinminecraftModBlocks.CONVEYER
					&& (new Object() {
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
					}.getItemStack(world, new BlockPos((int) x, (int) y, (int) (z + 1)), 0)).getItem() == (ItemStack.EMPTY).getItem()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COAL);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else {
				while (Itemset == false && slot != 10) {
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
					}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), (int) slot)).getItem() == (ItemStack.EMPTY).getItem())) {
						slot = slot + 1;
					} else {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) slot;
								final ItemStack _setstack = new ItemStack(MindustryinminecraftModItems.COPPER);
								_setstack.setCount(1);
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
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
