package dev.kalwantspizza.perfectprocessing.datagen.recipes;

import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import dev.kalwantspizza.perfectprocessing.PerfectProcessing;
import dev.kalwantspizza.perfectprocessing.config.RecipeEnabledCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import de.mrjulsen.paw.registry.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class PerfectDeployingRecipeGen extends DeployingRecipeGen {
    public PerfectDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PerfectProcessing.MODID);
    }

    GeneratedRecipe

            POWDER_SNOW_BUCKET_FROM_SNOW = create("content/powder_snow_bucket_from_snow", b -> b
                .require(Items.SNOW_BLOCK)
                .require(Items.BUCKET)
                .output(Items.POWDER_SNOW_BUCKET)
                .withCondition(new RecipeEnabledCondition("powderedSnowBucketDeploying"))

    ),

            DIRT_FROM_DEPLOYING_HOE = create("content/dirt_from_deploying_hoe", b -> b
                .require(Items.COARSE_DIRT)
                .require(ItemTags.HOES)
                .output(Items.DIRT)
                .withCondition(new RecipeEnabledCondition("hoeDirt"))

    );
}
