package com.blueberrysoda.oreinamillion.blocks.ores;

import com.blueberrysoda.oreinamillion.blocks.base.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOreTier2 extends BlockBase {

    public BlockOreTier2(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3.0F);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
    }
}
