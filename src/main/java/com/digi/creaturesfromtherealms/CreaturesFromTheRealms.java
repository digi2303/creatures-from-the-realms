package com.digi.creaturesfromtherealms;

import com.digi.creaturesfromtherealms.block.ModBlocks;
import com.digi.creaturesfromtherealms.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreaturesFromTheRealms implements ModInitializer {
	public static final String MOD_ID = "creatures-from-the-realms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}