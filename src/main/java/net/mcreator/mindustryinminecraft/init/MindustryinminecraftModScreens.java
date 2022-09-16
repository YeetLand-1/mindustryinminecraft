
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mindustryinminecraft.client.gui.RouterguiScreen;
import net.mcreator.mindustryinminecraft.client.gui.DrillguiScreen;
import net.mcreator.mindustryinminecraft.client.gui.CraftingScreenScreen;
import net.mcreator.mindustryinminecraft.client.gui.ConveyorGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MindustryinminecraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MindustryinminecraftModMenus.ROUTERGUI, RouterguiScreen::new);
			MenuScreens.register(MindustryinminecraftModMenus.CONVEYOR_GUI, ConveyorGuiScreen::new);
			MenuScreens.register(MindustryinminecraftModMenus.DRILLGUI, DrillguiScreen::new);
			MenuScreens.register(MindustryinminecraftModMenus.CRAFTING_SCREEN, CraftingScreenScreen::new);
		});
	}
}
