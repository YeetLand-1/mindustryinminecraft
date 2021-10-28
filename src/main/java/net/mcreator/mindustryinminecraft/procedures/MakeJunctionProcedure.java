package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mindustryinminecraft.item.CopperItem;
import net.mcreator.mindustryinminecraft.block.JunctionBlock;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.Map;

public class MakeJunctionProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MindustryinminecraftMod.LOGGER.warn("Failed to load dependency entity for procedure MakeJunction!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CopperItem.block)) : false)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(CopperItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 2,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(JunctionBlock.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
