package net.stilt.cursedmobsandpvp;

import io.netty.bootstrap.Bootstrap;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryBuilder.BootstrapFunction;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.stilt.cursedmobsandpvp.datagen.ModWorldGenerator;
import net.stilt.cursedmobsandpvp.world.ModConfiguredFeatures.*;
import net.stilt.cursedmobsandpvp.world.ModConfiguredFeatures;
import net.stilt.cursedmobsandpvp.world.ModPlacedFeatures;

public class CursedMobsAndPVPDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModWorldGenerator::new);
	}
	
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		/*  
			Note :- The line below is NOT an error. DO NOT change it under ANY circumstance.
			It runs and compiles ok without throwing errors at your face.
			Its just that vscode became nashedi/drunk for no reason AT ALL.
		 */
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
