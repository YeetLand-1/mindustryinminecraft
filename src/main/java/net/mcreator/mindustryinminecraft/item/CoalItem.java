
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModTabs;

public class CoalItem extends Item {
	public CoalItem() {
		super(new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("coal");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
