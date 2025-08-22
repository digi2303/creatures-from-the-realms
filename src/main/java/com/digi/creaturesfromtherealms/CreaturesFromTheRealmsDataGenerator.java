package com.digi.creaturesfromtherealms;

import com.digi.creaturesfromtherealms.datagen.ModLootTableProvider;
import com.digi.creaturesfromtherealms.datagen.ModModelProvider;
import com.digi.creaturesfromtherealms.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CreaturesFromTheRealmsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack =fabricDataGenerator.createPack();

                pack.addProvider(ModLootTableProvider::new);
                pack.addProvider(ModModelProvider::new);
                pack.addProvider(ModRecipeProvider::new);
	}
}
