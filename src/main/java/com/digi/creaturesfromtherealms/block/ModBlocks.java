package com.digi.creaturesfromtherealms.block;

import com.digi.creaturesfromtherealms.CreaturesFromTheRealms;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SNOW_GIRAFFE_FUR_BLOCK = registerBlock("snow_giraffe_fur_block",
            new Block(AbstractBlock.Settings.create().strength(0.8f)
                    .sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CreaturesFromTheRealms.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CreaturesFromTheRealms.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CreaturesFromTheRealms.LOGGER.info("Registering Mod Blocks for " + CreaturesFromTheRealms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SNOW_GIRAFFE_FUR_BLOCK);
        });
    }
}
