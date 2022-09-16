
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mindustryinminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.mindustryinminecraft.world.features.ores.StoneTitaniumOreFeature;
import net.mcreator.mindustryinminecraft.world.features.ores.StoneLeadOreFeature;
import net.mcreator.mindustryinminecraft.world.features.ores.StoneCopperOreFeature;
import net.mcreator.mindustryinminecraft.world.features.ores.StoneCoalOreFeature;
import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MindustryinminecraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MindustryinminecraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> STONE_COPPER_ORE = register("stone_copper_ore", StoneCopperOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StoneCopperOreFeature.GENERATE_BIOMES,
					StoneCopperOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STONE_LEAD_ORE = register("stone_lead_ore", StoneLeadOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, StoneLeadOreFeature.GENERATE_BIOMES, StoneLeadOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STONE_COAL_ORE = register("stone_coal_ore", StoneCoalOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, StoneCoalOreFeature.GENERATE_BIOMES, StoneCoalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STONE_TITANIUM_ORE = register("stone_titanium_ore", StoneTitaniumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StoneTitaniumOreFeature.GENERATE_BIOMES,
					StoneTitaniumOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
