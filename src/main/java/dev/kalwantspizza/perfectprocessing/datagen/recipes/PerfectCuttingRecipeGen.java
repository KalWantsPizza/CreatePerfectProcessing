package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.awoolanche.applewoodrebarked.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.satisfy.vinery.core.registry.ObjectRegistry;

import java.util.concurrent.CompletableFuture;

import static dev.kalwantspizza.perfectprocessing.PerfectProcessing.MODID;

public class PerfectCuttingRecipeGen extends CuttingRecipeGen {
    public PerfectCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MODID);
    }

    static {
        String[][] checks = {
                {"vinery", "apple_log"},
                {"vinery", "apple_wood"},
                {"applewoodrebarked", "stripped_apple_log"},
                {"applewoodrebarked", "stripped_apple_wood"},
                {"applewoodrebarked", "apple_planks"}
        };
        for (String[] check : checks) {
            var item = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(check[0], check[1]));
            if (item == net.minecraft.world.item.Items.AIR) {
                System.err.println("MISSING ITEM: " + check[0] + ":" + check[1]);
            }
        }
    }

    GeneratedRecipe

            STRIPPED_APPLE_LOG = create(ObjectRegistry.APPLE_LOG::get, b -> b.duration(50)
                    .whenModLoaded("vinery")
                    .whenModLoaded("applewoodrebarked")
                    .output(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "stripped_apple_log")),1)),

            STRIPPED_APPLE_WOOD = create(ObjectRegistry.APPLE_WOOD::get, b -> b.duration(50)
                    .whenModLoaded("vinery")
                    .whenModLoaded("applewoodrebarked")
                    .output(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "stripped_apple_wood")), 1)),

            APPLE_PLANKS = create(() -> BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "stripped_apple_log")), b -> b.duration(50)
                    .whenModLoaded("vinery")
                    .whenModLoaded("applewoodrebarked")
                    .output(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "apple_planks")), 6)),

            APPLE_PLANKS_FROM_WOOD = create(() -> BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "stripped_apple_wood")), b -> b.duration(50)
                    .whenModLoaded("vinery")
                    .whenModLoaded("applewoodrebarked")
                    .output(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("applewoodrebarked", "apple_planks")), 6));

}