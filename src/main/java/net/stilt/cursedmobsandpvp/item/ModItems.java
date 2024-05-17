package net.stilt.cursedmobsandpvp.item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.stilt.cursedmobsandpvp.CursedMobsAndPVP;

public class ModItems {
    public static final Item Filad_Ingot = registerItem("filad_ingot", new Item(new FabricItemSettings()));
    public static final Item Filad_Scrap = registerItem("filad_scrap", new Item(new FabricItemSettings()));
    public static final Item BEAN = registerItem("bean", new Item(new FabricItemSettings().food(ModFoodComponents.BEAN)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CursedMobsAndPVP.Mod_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod items for " + CursedMobsAndPVP.Mod_ID);
    }
}
