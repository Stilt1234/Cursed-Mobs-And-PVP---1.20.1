package net.stilt.cursedmobsandpvp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;
import net.stilt.cursedmobsandpvp.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup cursedmobsandpvp = Registry.register(Registries.ITEM_GROUP,
    new Identifier(CursedMobsAndPVP.Mod_ID, "bean"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bean"))
            .icon(() -> new ItemStack(ModItems.BEAN)).entries((displayContext, entries) -> {
                entries.add(ModItems.BEAN);
                entries.add(ModItems.Filad_Ingot);
                entries.add(ModItems.Filad_Scrap);
                entries.add(ModBlocks.Block_Of_Filad);
                entries.add(ModBlocks.Filad_Ore);
                entries.add(ModBlocks.Deepslate_Filad_Ore);
                entries.add(ModBlocks.Cursed_Wool);
            }).build());
    
    
    

    public static void registerItemGroups(){
        CursedMobsAndPVP.LOGGER.info("Registering Item Group");
    }
}