package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CraftJunctionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MindustryinminecraftModItems.COPPER.get()))
				: false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MindustryinminecraftModItems.COPPER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MindustryinminecraftModBlocks.JUNCTION.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
