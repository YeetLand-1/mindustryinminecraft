
package net.mcreator.mindustryinminecraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mindustryinminecraft.block.ConveyerBlock;
import net.mcreator.mindustryinminecraft.MindustryinminecraftModElements;

@MindustryinminecraftModElements.ModElement.Tag
public class MindustryItemGroup extends MindustryinminecraftModElements.ModElement {
	public MindustryItemGroup(MindustryinminecraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmindustry") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ConveyerBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
