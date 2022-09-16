
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MindustryinminecraftModTabs {
	public static CreativeModeTab TAB_MINDUSTRY;

	public static void load() {
		TAB_MINDUSTRY = new CreativeModeTab("tabmindustry") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MindustryinminecraftModBlocks.CONVEYER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
