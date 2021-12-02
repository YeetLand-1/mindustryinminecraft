
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModTabs;
import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModSounds;

public class Soundtrack2Item extends RecordItem {
	public Soundtrack2Item() {
		super(0, MindustryinminecraftModSounds.REGISTRY.get(new ResourceLocation("mindustryinminecraft:soundtrack2")),
				new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("soundtrack_2");
	}
}
