
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mindustryinminecraft.block.entity.ROUTERBlockEntity;
import net.mcreator.mindustryinminecraft.block.entity.DrillBlockEntity;
import net.mcreator.mindustryinminecraft.block.entity.ConveyerBlockEntity;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

public class MindustryinminecraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			MindustryinminecraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ROUTER = register("router", MindustryinminecraftModBlocks.ROUTER, ROUTERBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CONVEYER = register("conveyer", MindustryinminecraftModBlocks.CONVEYER,
			ConveyerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DRILL = register("drill", MindustryinminecraftModBlocks.DRILL, DrillBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
