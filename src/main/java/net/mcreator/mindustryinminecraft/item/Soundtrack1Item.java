
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.network.chat.Component;

public class Soundtrack1Item extends RecordItem {

	public Soundtrack1Item() {
		super(0, MindustryinminecraftModSounds.REGISTRY.get(new ResourceLocation("mindustryinminecraft:soundtrack1")),
				new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(1).rarity(Rarity.RARE));
	}

}
