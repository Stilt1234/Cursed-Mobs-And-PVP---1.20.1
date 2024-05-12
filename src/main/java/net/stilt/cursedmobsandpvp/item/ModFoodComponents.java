package net.stilt.cursedmobsandpvp.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;

public class ModFoodComponents {
    public static final FoodComponent BEAN = new FoodComponent.Builder().alwaysEdible()
    .hunger(20).saturationModifier(0.8f)
    .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 2400), 0.75f)
    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 4800), 1f)
    .build();

    public static void registeringFoodComponents(){
        CursedMobsAndPVP.LOGGER.info("Registering Food Components");
    }
}
