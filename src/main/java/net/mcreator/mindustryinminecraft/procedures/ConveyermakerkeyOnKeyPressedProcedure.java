package net.mcreator.mindustryinminecraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ConveyermakerkeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos(x, y, z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("CraftingScreen");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new CraftingScreenMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
