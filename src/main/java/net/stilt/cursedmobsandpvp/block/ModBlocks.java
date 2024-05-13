package net.stilt.cursedmobsandpvp.block;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlocks {

    public static final Block Cursed_Wool = registerBlocks("cursed_wool",
     new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));


    private static Block registerBlocks(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CursedMobsAndPVP.Mod_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CursedMobsAndPVP.Mod_ID, name), 
        new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        CursedMobsAndPVP.LOGGER.info("Registering Mod Blocks for " + CursedMobsAndPVP.Mod_ID);
    }
}