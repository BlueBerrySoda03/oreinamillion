package com.blueberrysoda.oreinamillion.recipes;

import com.blueberrysoda.oreinamillion.init.ModBlocks;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
    public static void init(){
        GameRegistry.addSmelting(ModBlocks.oreAluminium, new ItemStack(ModItems.ingotAluminium, 1), 0.7F);
    }
}
