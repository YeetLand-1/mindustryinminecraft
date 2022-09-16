
package net.mcreator.mindustryinminecraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class Lead1Item extends Item {

	public Lead1Item() {
		super(new Item.Properties().tab(MindustryinminecraftModTabs.TAB_MINDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

}
