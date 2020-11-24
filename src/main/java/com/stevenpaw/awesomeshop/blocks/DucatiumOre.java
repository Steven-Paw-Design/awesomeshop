package com.stevenpaw.awesomeshop.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DucatiumOre extends Block {

    //hardness:         how easy it is to mine block
    //resistance:       how easy it can be destroyed by TNT
    //sound:            how the block sounds
    //harvestLevel:     1-Wood, 2-Stone, 3-Iron/Gold, 4-Diamond | What you need to harvest the block
    //harvestTool:      What kind of Tool you need to harvest the block

    public DucatiumOre() {
        super(Properties.create(Material.CLAY)
                .hardnessAndResistance(6.0f,1200)
                .sound(SoundType.HONEY)
                .harvestLevel(3)
                .harvestTool(ToolType.SHOVEL)
                .setRequiresTool()
        );
    }
}
