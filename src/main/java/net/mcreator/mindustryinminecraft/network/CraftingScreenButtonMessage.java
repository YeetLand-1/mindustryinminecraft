
package net.mcreator.mindustryinminecraft.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.world.inventory.CraftingScreenMenu;
import net.mcreator.mindustryinminecraft.procedures.CraftRouterProcedure;
import net.mcreator.mindustryinminecraft.procedures.CraftJunctionProcedure;
import net.mcreator.mindustryinminecraft.procedures.CraftDrillProcedure;
import net.mcreator.mindustryinminecraft.procedures.CraftConveyerProcedure;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftingScreenButtonMessage {
	private final int buttonID, x, y, z;

	public CraftingScreenButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CraftingScreenButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CraftingScreenButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CraftingScreenButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = CraftingScreenMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CraftConveyerProcedure.execute(entity);
		}
		if (buttonID == 1) {

			CraftRouterProcedure.execute(entity);
		}
		if (buttonID == 3) {

			CraftDrillProcedure.execute(entity);
		}
		if (buttonID == 5) {

			CraftJunctionProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MindustryinminecraftMod.addNetworkMessage(CraftingScreenButtonMessage.class, CraftingScreenButtonMessage::buffer,
				CraftingScreenButtonMessage::new, CraftingScreenButtonMessage::handler);
	}
}
