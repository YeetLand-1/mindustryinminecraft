
package net.mcreator.mindustryinminecraft.world.features.ores;

public class StoneTitaniumOreFeature extends OreFeature {

	public static StoneTitaniumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new StoneTitaniumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("mindustryinminecraft:stone_titanium_ore", FEATURE, new OreConfiguration(
				StoneTitaniumOreFeatureRuleTest.INSTANCE, MindustryinminecraftModBlocks.STONE_TITANIUM_ORE.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("mindustryinminecraft:stone_titanium_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public StoneTitaniumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class StoneTitaniumOreFeatureRuleTest extends RuleTest {

		static final StoneTitaniumOreFeatureRuleTest INSTANCE = new StoneTitaniumOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<StoneTitaniumOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<StoneTitaniumOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("mindustryinminecraft:stone_titanium_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
