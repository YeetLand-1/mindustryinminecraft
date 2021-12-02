
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mindustryinminecraft.network.ConveyermakerkeyMessage;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MindustryinminecraftModKeyMappings {
	public static final KeyMapping CONVEYERMAKERKEY = new KeyMapping("key.mindustryinminecraft.conveyermakerkey", GLFW.GLFW_KEY_C,
			"key.categories.mindustry");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(CONVEYERMAKERKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == CONVEYERMAKERKEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new ConveyermakerkeyMessage(0, 0));
						ConveyermakerkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
