package net.stilt.cursedmobsandpvp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;

public class ModItemGroups {
    public static final ItemGroup cursedmobsandpvp = Registry.register(Registries.ITEM_GROUP,
    new Identifier(CursedMobsAndPVP.Mod_ID, "bean"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bean"))
            .icon(() -> new ItemStack(ModItems.BEAN)).entries((displayContext, entries) -> {
                entries.add(ModItems.Filad_Ingot);
                entries.add(ModItems.BEAN);
            }).build());
    
    
    

    public static void registerItemGroups(){
        CursedMobsAndPVP.LOGGER.info("Registering Item Group");
    }
}