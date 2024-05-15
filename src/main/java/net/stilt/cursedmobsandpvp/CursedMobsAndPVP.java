package net.stilt.cursedmobsandpvp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.stilt.cursedmobsandpvp.block.ModBlocks;
import net.stilt.cursedmobsandpvp.item.ModFoodComponents;
import net.stilt.cursedmobsandpvp.item.ModItemGroups;
import net.stilt.cursedmobsandpvp.item.ModItems;
import net.stilt.cursedmobsandpvp.world.gen.ModWorldGeneration;
import net.stilt.cursedmobsandpvp.event.CursedWoolAttackEventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CursedMobsAndPVP implements ModInitializer {

	public static final String Mod_ID = "cursed-mobs-and-pvp";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModFoodComponents.registeringFoodComponents();
		ModBlocks.registerModBlocks();
		
		AttackBlockCallback.EVENT.register(new CursedWoolAttackEventHandler());

		ModWorldGeneration.generateModWorldGen();
	}
}