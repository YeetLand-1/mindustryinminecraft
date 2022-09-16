
package net.mcreator.mindustryinminecraft.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class Turret1Block extends Block {

	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public Turret1Block() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(12, 3, 10, 16, 11, 12), box(8, 7, 8, 12, 9, 12), box(4, 4, 4, 14, 5, 14));
			case NORTH -> Shapes.or(box(0, 3, 4, 4, 11, 6), box(4, 7, 4, 8, 9, 8), box(2, 4, 2, 12, 5, 12));
			case EAST -> Shapes.or(box(10, 3, 0, 12, 11, 4), box(8, 7, 4, 12, 9, 8), box(4, 4, 2, 14, 5, 12));
			case WEST -> Shapes.or(box(4, 3, 12, 6, 11, 16), box(4, 7, 8, 8, 9, 12), box(2, 4, 4, 12, 5, 14));
			case UP -> Shapes.or(box(0, 10, 3, 4, 12, 11), box(4, 8, 7, 8, 12, 9), box(2, 4, 4, 12, 14, 5));
			case DOWN -> Shapes.or(box(0, 4, 5, 4, 6, 13), box(4, 4, 7, 8, 8, 9), box(2, 2, 11, 12, 12, 12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
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
		ItemBlockRenderTypes.setRenderLayer(MindustryinminecraftModBlocks.TURRET_1.get(), renderType -> renderType == RenderType.cutoutMipped());
	}

}
