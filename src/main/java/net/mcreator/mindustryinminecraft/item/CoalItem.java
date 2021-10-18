
package net.mcreator.mindustryinminecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mindustryinminecraft.itemgroup.MindustryItemGroup;
import net.mcreator.mindustryinminecraft.MindustryinminecraftModElements;

@MindustryinminecraftModElements.ModElement.Tag
public class CoalItem extends MindustryinminecraftModElements.ModElement {
	@ObjectHolder("mindustryinminecraft:coal")
	public static final Item block = null;
	public CoalItem(MindustryinminecraftModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MindustryItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("coal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
