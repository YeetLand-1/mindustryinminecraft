package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;

import net.mcreator.mindustryinminecraft.item.ScrapItem;
import net.mcreator.mindustryinminecraft.block.StoneScrapOreBlock;
import net.mcreator.mindustryinminecraft.block.ConveyerBlock;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class ScrapDrillingProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency x for procedure ScrapDrilling!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency y for procedure ScrapDrilling!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency z for procedure ScrapDrilling!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency world for procedure ScrapDrilling!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean Itemset = false;
		double slot = 0;
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StoneScrapOreBlock.block)) {
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ConveyerBlock.block) && ((new Object() {
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
			}.getItemStack(new BlockPos((int) (x - 1), (int) y, (int) z), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == ConveyerBlock.block)
					&& ((new Object() {
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
					}.getItemStack(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == ConveyerBlock.block) && ((new Object() {
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) (z - 2)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z - 2)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == ConveyerBlock.block)
					&& ((new Object() {
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
					}.getItemStack(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == ConveyerBlock.block)
					&& ((new Object() {
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
					}.getItemStack(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == ConveyerBlock.block) && ((new Object() {
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
			}.getItemStack(new BlockPos((int) (x + 2), (int) y, (int) z), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 2), (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == ConveyerBlock.block)
					&& ((new Object() {
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
					}.getItemStack(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == ConveyerBlock.block) && ((new Object() {
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) (z + 1)), (int) (0))).getItem() == (ItemStack.EMPTY).getItem()))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(ScrapItem.block);
						_setstack.setCount((int) 1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else {
				while (((Itemset == (false)) && (slot != 10))) {
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
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (slot))).getItem() == (ItemStack.EMPTY).getItem()))) {
						slot = (double) (slot + 1);
					} else {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (slot);
								final ItemStack _setstack = new ItemStack(ScrapItem.block);
								_setstack.setCount((int) 1);
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						Itemset = (boolean) (true);
					}
				}
			}
		}
	}
}
