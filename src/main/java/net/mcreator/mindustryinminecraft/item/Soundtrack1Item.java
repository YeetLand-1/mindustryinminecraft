
package net.mcreator.mindustryinminecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.mindustryinminecraft.itemgroup.MindustryItemGroup;
import net.mcreator.mindustryinminecraft.MindustryinminecraftModElements;

@MindustryinminecraftModElements.ModElement.Tag
public class Soundtrack1Item extends MindustryinminecraftModElements.ModElement {
	@ObjectHolder("mindustryinminecraft:soundtrack_1")
	public static final Item block = null;
	public Soundtrack1Item(MindustryinminecraftModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MindustryinminecraftModElements.sounds.get(new ResourceLocation("mindustryinminecraft:soundtrack1")),
					new Item.Properties().group(MindustryItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("soundtrack_1");
		}
	}
}
