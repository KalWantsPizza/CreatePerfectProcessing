package dev.kalwantspizza.perfectprocessing.config;

import net.createmod.catnip.config.ConfigBase;

public class PBlocks extends ConfigBase {
    public final ConfigBool crushingDeepslate = b(true, "crushDeepslate", Comments.crushingDeepslate, Comments.defaultTrue);
    public final ConfigBool compactResource = b(true, "compactResourceBlocks", Comments.compactResource, Comments.resourceList, Comments.defaultTrue);
    public final ConfigBool fillDecorative = b(true, "fillDecorativeBlocks", Comments.fillDecorative, Comments.decorativeList, Comments.defaultTrue);
    public final ConfigBool mixingProduce = b(true, "mixProductionalBlocks", Comments.mixingProduce, Comments.produceList, Comments.defaultTrue);
    public final ConfigBool spongeDupe = b(true, "duplicateSponges", Comments.spongeDupe, Comments.defaultTrue);
    public final ConfigBool pawOxidize = b(true, "oxidizeMasts", Comments.pawOxidize, Comments.pantoList, Comments.requiresPAW,  Comments.defaultTrue);
    public final ConfigBool dirtHoe = b(true, "hoeCoarseDirt", Comments.dirtHoe, Comments.defaultTrue);


    @Override
    public String getName() {
        return "blocks";
    }

    private static class Comments {
        static String fillDecorative = "Whether the recipes for decorative blocks are enabled";
        static String compactResource = "Whether the compacting recipes for resource blocks are enabled";
        static String mixingProduce = "Whether the mixing recipes for productional blocks are enabled";
        static String spongeDupe = "Whether corals can be compacted into additional sponges";
        static String crushingDeepslate = "Whether deepslate can be crushed into cobbled deepslate";
        static String pawOxidize = "Whether weathering for masts from C: P&W is active";
        static String dirtHoe = "Whether or not deployers can use a hoe to make dirt";

        static String decorativeList = "§dDecorative: §dBasalt, §dCalcite, §dDeepslate, §dDripstone";
        static String resourceList = "§dResource: §dAsurine, §dCrimsite, §dOchrum, §dVeridium";
        static String produceList = "§dProductional: §dDiorite, §dNetherrack, §dTuff";
        static String pantoList = "§dP&W: §dMasts §dfrom §dCreate: §dPantographs §dand §dWires";

        static String requiresPAW = "§eRequires §emod §e'Create: §ePantographs §eand §eWires'";

        static String defaultTrue = "§2Default: True";
    }
}
