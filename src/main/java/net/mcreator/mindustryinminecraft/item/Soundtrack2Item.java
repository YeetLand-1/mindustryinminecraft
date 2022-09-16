
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.network.chat.Component;

public class Soundtrack2Item extends RecordItem {

	public Soundtrack2Item() {
		super(0, MindustryinminecraftModSounds.REGISTRY.get(new ResourceLocation("mindustryinminecraft:soundtrack2")),
				new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(1).rarity(Rarity.RARE));
	}

}
