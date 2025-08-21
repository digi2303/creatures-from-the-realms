package com.digi.creaturesfromtherealms.item;

import com.digi.creaturesfromtherealms.CreaturesFromTheRealms;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SNOW_GIRAFFE_FUR = registerItem("snow_giraffe_fur", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CreaturesFromTheRealms.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CreaturesFromTheRealms.LOGGER.info("Registering Mod Items for " + CreaturesFromTheRealms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SNOW_GIRAFFE_FUR);
        });
    }
}
