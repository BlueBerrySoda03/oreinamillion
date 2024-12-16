package com.blueberrysoda.oreinamillion.proxy;

import com.blueberrysoda.oreinamillion.init.ModBlocks;
import com.blueberrysoda.oreinamillion.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public static void preInitCommon(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlocks.init();
    }

    public static void initCommon(FMLInitializationEvent event){
        ModItems.initOreDict();
        ModBlocks.initOreDict();
    }

    public static void postInitCommon(FMLPostInitializationEvent event){

    }
}