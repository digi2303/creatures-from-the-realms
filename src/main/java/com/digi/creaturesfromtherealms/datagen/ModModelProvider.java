package com.digi.creaturesfromtherealms.datagen;

import com.digi.creaturesfromtherealms.block.ModBlocks;
import com.digi.creaturesfromtherealms.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SNOW_GIRAFFE_FUR_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SNOW_GIRAFFE_FUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE, Models.GENERATED);
    }
}
