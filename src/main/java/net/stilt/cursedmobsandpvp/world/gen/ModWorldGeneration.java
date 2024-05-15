package net.stilt.cursedmobsandpvp.world.gen;

import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        CursedMobsAndPVP.LOGGER.info("Adding and generating custom ores");
        ModOreGeneration.generateOres();
    }
}
