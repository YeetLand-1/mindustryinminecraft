
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModTabs;

public class Lead1Item extends Item {
	public Lead1Item() {
		super(new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("lead_1");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
