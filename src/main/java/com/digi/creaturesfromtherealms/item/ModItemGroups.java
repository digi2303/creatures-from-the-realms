package com.digi.creaturesfromtherealms.item;

import com.digi.creaturesfromtherealms.CreaturesFromTheRealms;
import com.digi.creaturesfromtherealms.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SNOW_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CreaturesFromTheRealms.MOD_ID, "snow_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SNOW_GIRAFFE_FUR))
                    .displayName(Text.translatable("itemgroup.creatures-from-the-realms.snow_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SNOW_GIRAFFE_FUR);
                        entries.add(ModBlocks.SNOW_GIRAFFE_FUR_BLOCK);
                        entries.add(ModItems.CHOCOLATE);
                    }).build());



    public static void registerItemGroups() {
        CreaturesFromTheRealms.LOGGER.info("Registering Item Groups for " + CreaturesFromTheRealms.MOD_ID);
    }
}
