
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mindustryinminecraft.block.entity.ROUTERBlockEntity;
import net.mcreator.mindustryinminecraft.block.entity.DrillBlockEntity;
import net.mcreator.mindustryinminecraft.block.entity.ConveyerBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MindustryinminecraftModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> ROUTER = register("mindustryinminecraft:router", MindustryinminecraftModBlocks.ROUTER,
			ROUTERBlockEntity::new);
	public static final BlockEntityType<?> CONVEYER = register("mindustryinminecraft:conveyer", MindustryinminecraftModBlocks.CONVEYER,
			ConveyerBlockEntity::new);
	public static final BlockEntityType<?> DRILL = register("mindustryinminecraft:drill", MindustryinminecraftModBlocks.DRILL, DrillBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
