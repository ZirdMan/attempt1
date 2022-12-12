package net.zird.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zird.testmod.TestMod;
import net.minecraft.item.Item;

public class ModItems {

    public static final  Item REDONITE_GEM = registerItem("redonite_gem",
            new Item(new Item.Settings()));
    public static final  Item UNPROCESSED_REDONITE = registerItem("unprocessed_redonite",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering Mod Items for" + TestMod.MOD_ID);
    }
}
