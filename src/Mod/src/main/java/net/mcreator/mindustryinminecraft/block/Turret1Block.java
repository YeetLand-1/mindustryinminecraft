
package net.mcreator.mindustryinminecraft.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mindustryinminecraft.init.MindustryinminecraftModBlocks;

import java.util.List;
import java.util.Collections;

public class Turret1Block extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public Turret1Block() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
		setRegistryName("turret_1");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return Shapes.or(box(12, 3, 10, 16, 11, 12), box(8, 7, 8, 12, 9, 12), box(4, 4, 4, 14, 5, 14)).move(offset.x, offset.y, offset.z);
			case NORTH :
				return Shapes.or(box(0, 3, 4, 4, 11, 6), box(4, 7, 4, 8, 9, 8), box(2, 4, 2, 12, 5, 12)).move(offset.x, offset.y, offset.z);
			case EAST :
				return Shapes.or(box(10, 3, 0, 12, 11, 4), box(8, 7, 4, 12, 9, 8), box(4, 4, 2, 14, 5, 12)).move(offset.x, offset.y, offset.z);
			case WEST :
				return Shapes.or(box(4, 3, 12, 6, 11, 16), box(4, 7, 8, 8, 9, 12), box(2, 4, 4, 12, 5, 14)).move(offset.x, offset.y, offset.z);
			case UP :
				return Shapes.or(box(0, 10, 3, 4, 12, 11), box(4, 8, 7, 8, 12, 9), box(2, 4, 4, 12, 14, 5)).move(offset.x, offset.y, offset.z);
			case DOWN :
				return Shapes.or(box(0, 4, 5, 4, 6, 13), box(4, 4, 7, 8, 8, 9), box(2, 2, 11, 12, 12, 12)).move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		;
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MindustryinminecraftModBlocks.TURRET_1, renderType -> renderType == RenderType.cutoutMipped());
	}

}
