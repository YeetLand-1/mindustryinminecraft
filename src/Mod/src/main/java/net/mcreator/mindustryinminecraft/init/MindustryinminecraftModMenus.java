
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.mindustryinminecraft.world.inventory.RouterguiMenu;
import net.mcreator.mindustryinminecraft.world.inventory.DrillguiMenu;
import net.mcreator.mindustryinminecraft.world.inventory.CraftingScreenMenu;
import net.mcreator.mindustryinminecraft.world.inventory.ConveyorGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MindustryinminecraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<RouterguiMenu> ROUTERGUI = register("routergui", (id, inv, extraData) -> new RouterguiMenu(id, inv, extraData));
	public static final MenuType<ConveyorGuiMenu> CONVEYOR_GUI = register("conveyor_gui",
			(id, inv, extraData) -> new ConveyorGuiMenu(id, inv, extraData));
	public static final MenuType<DrillguiMenu> DRILLGUI = register("drillgui", (id, inv, extraData) -> new DrillguiMenu(id, inv, extraData));
	public static final MenuType<CraftingScreenMenu> CRAFTING_SCREEN = register("crafting_screen",
			(id, inv, extraData) -> new CraftingScreenMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
