
package net.mcreator.mindustryinminecraft.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.mindustryinminecraft.procedures.MakeRouterProcedure;
import net.mcreator.mindustryinminecraft.procedures.MakeJunctionProcedure;
import net.mcreator.mindustryinminecraft.procedures.MakeDrill1Procedure;
import net.mcreator.mindustryinminecraft.procedures.MakeConveyerProcedure;
import net.mcreator.mindustryinminecraft.client.gui.CraftingScreenScreen;
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
		HashMap guistate = CraftingScreenScreen.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MakeConveyerProcedure.execute(entity);
		}
		if (buttonID == 1) {

			MakeRouterProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MakeDrill1Procedure.execute(entity);
		}
		if (buttonID == 5) {

			MakeJunctionProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MindustryinminecraftMod.addNetworkMessage(CraftingScreenButtonMessage.class, CraftingScreenButtonMessage::buffer,
				CraftingScreenButtonMessage::new, CraftingScreenButtonMessage::handler);
	}
}
