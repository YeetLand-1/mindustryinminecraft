
package net.mcreator.mindustryinminecraft.world.features.ores;

public class StoneLeadOreFeature extends OreFeature {

	public static StoneLeadOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new StoneLeadOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("mindustryinminecraft:stone_lead_ore", FEATURE, new OreConfiguration(
				StoneLeadOreFeatureRuleTest.INSTANCE, MindustryinminecraftModBlocks.STONE_LEAD_ORE.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("mindustryinminecraft:stone_lead_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public StoneLeadOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class StoneLeadOreFeatureRuleTest extends RuleTest {

		static final StoneLeadOreFeatureRuleTest INSTANCE = new StoneLeadOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<StoneLeadOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<StoneLeadOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("mindustryinminecraft:stone_lead_ore_match"), CUSTOM_MATCH);
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
