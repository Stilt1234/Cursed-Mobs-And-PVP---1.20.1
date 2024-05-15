package net.stilt.cursedmobsandpvp.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;

import java.util.*;

public class ModPlacedFeatures {

    public static RegistryKey<PlacedFeature> Filad_Ore_Placed_Key = registerKey("filad_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
    
        register(context, Filad_Ore_Placed_Key, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FILAD_ORE_KEY),
         ModOrePlacement.modifiersWithCount(3, HeightRangePlacementModifier.uniform(YOffset.fixed(-59), YOffset.fixed(16))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(CursedMobsAndPVP.Mod_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
