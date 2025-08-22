package com.digi.creaturesfromtherealms.datagen;

import com.digi.creaturesfromtherealms.block.ModBlocks;
import com.digi.creaturesfromtherealms.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_GIRAFFE_FUR_BLOCK)
        .pattern("XX")
        .pattern("XX")
                .input('X', ModItems.SNOW_GIRAFFE_FUR)
                .criterion(hasItem(ModItems.SNOW_GIRAFFE_FUR), conditionsFromItem(ModItems.SNOW_GIRAFFE_FUR))
                .offerTo(recipeExporter);
    }
}
