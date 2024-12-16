package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier1;
import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier2;
import com.blueberrysoda.oreinamillion.blocks.ores.BlockOreTier3;
import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModBlocks {
    //=========
    //ores
    //=========
    //ingots
    public static BlockOreTier1 oreAluminium;
    public static BlockOreTier1 oreChrome;
    public static BlockOreTier2 oreCobalt;
    public static BlockOreTier1 oreCopper;
    public static BlockOreTier2 oreIridium;
    public static BlockOreTier1 oreLead;
    public static BlockOreTier3 oreMithril;
    public static BlockOreTier2 oreNickel;
    public static BlockOreTier1 oreOsmium;
    public static BlockOreTier3 orePlatinum;
    public static BlockOreTier2 oreSilver;
    public static BlockOreTier1 oreTin;
    public static BlockOreTier3 oreTitanium;
    public static BlockOreTier2 oreTungsten;
    public static BlockOreTier3 oreUranium;
    public static BlockOreTier1 oreZinc;
    //gems


    //=========
    //combined
    //=========
    //base ingots

    //alloy ingots

    //gems

    public static void init(){
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            oreAluminium = new BlockOreTier1("aluminium_ore", Material.ROCK);
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            oreChrome = new BlockOreTier1("chrome_ore", Material.ROCK);
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            oreCobalt = new BlockOreTier2("cobalt_ore", Material.ROCK);
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            oreCopper = new BlockOreTier1("copper_ore", Material.ROCK);
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            oreIridium = new BlockOreTier2("iridium_ore", Material.ROCK);
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            oreLead = new BlockOreTier1("lead_ore", Material.ROCK);
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            oreMithril = new BlockOreTier3("mithril_ore", Material.ROCK);
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            oreNickel = new BlockOreTier2("nickel_ore", Material.ROCK);
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            oreOsmium = new BlockOreTier1("osmium_ore", Material.ROCK);
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            orePlatinum = new BlockOreTier3("platinum_ore", Material.ROCK);
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            oreSilver = new BlockOreTier2("silver_ore", Material.ROCK);
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            oreTin = new BlockOreTier1("tin_ore", Material.ROCK);
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            oreTitanium = new BlockOreTier3("titanium_ore", Material.ROCK);
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            oreTungsten = new BlockOreTier2("tungsten_ore", Material.ROCK);
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            oreUranium = new BlockOreTier3("uranium_ore", Material.ROCK);
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            oreZinc = new BlockOreTier1("zinc_ore", Material.ROCK);
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){

        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){

        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){

        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){

        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){

        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){

        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){

        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){

        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){

        }
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            event.getRegistry().register(oreAluminium);
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            event.getRegistry().register(oreChrome);
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            event.getRegistry().register(oreCobalt);
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            event.getRegistry().register(oreCopper);
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            event.getRegistry().register(oreIridium);
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            event.getRegistry().register(oreLead);
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            event.getRegistry().register(oreMithril);
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            event.getRegistry().register(oreNickel);
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            event.getRegistry().register(oreOsmium);
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            event.getRegistry().register(orePlatinum);
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            event.getRegistry().register(oreSilver);
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            event.getRegistry().register(oreTin);
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            event.getRegistry().register(oreTitanium);
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            event.getRegistry().register(oreTungsten);
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            event.getRegistry().register(oreUranium);
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            event.getRegistry().register(oreZinc);
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){

        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){

        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){

        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){

        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){

        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){

        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){

        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){

        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){

        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        //event.getRegistry().register(new ItemBlock().setRegistryName(Objects.requireNonNull(.getRegistryName())));
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            event.getRegistry().register(new ItemBlock(oreAluminium).setRegistryName(Objects.requireNonNull(oreAluminium.getRegistryName())));
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            event.getRegistry().register(new ItemBlock(oreChrome).setRegistryName(Objects.requireNonNull(oreChrome.getRegistryName())));
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            event.getRegistry().register(new ItemBlock(oreCobalt).setRegistryName(Objects.requireNonNull(oreCobalt.getRegistryName())));
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            event.getRegistry().register(new ItemBlock(oreCopper).setRegistryName(Objects.requireNonNull(oreCopper.getRegistryName())));
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            event.getRegistry().register(new ItemBlock(oreIridium).setRegistryName(Objects.requireNonNull(oreIridium.getRegistryName())));
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            event.getRegistry().register(new ItemBlock(oreLead).setRegistryName(Objects.requireNonNull(oreLead.getRegistryName())));
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            event.getRegistry().register(new ItemBlock(oreMithril).setRegistryName(Objects.requireNonNull(oreMithril.getRegistryName())));
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            event.getRegistry().register(new ItemBlock(oreNickel).setRegistryName(Objects.requireNonNull(oreNickel.getRegistryName())));
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            event.getRegistry().register(new ItemBlock(oreOsmium).setRegistryName(Objects.requireNonNull(oreOsmium.getRegistryName())));
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            event.getRegistry().register(new ItemBlock(orePlatinum).setRegistryName(Objects.requireNonNull(orePlatinum.getRegistryName())));
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            event.getRegistry().register(new ItemBlock(oreSilver).setRegistryName(Objects.requireNonNull(oreSilver.getRegistryName())));
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            event.getRegistry().register(new ItemBlock(oreTin).setRegistryName(Objects.requireNonNull(oreTin.getRegistryName())));
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            event.getRegistry().register(new ItemBlock(oreTitanium).setRegistryName(Objects.requireNonNull(oreTitanium.getRegistryName())));
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            event.getRegistry().register(new ItemBlock(oreTungsten).setRegistryName(Objects.requireNonNull(oreTungsten.getRegistryName())));
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            event.getRegistry().register(new ItemBlock(oreUranium).setRegistryName(Objects.requireNonNull(oreUranium.getRegistryName())));
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            event.getRegistry().register(new ItemBlock(oreZinc).setRegistryName(Objects.requireNonNull(oreZinc.getRegistryName())));
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){

        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){

        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){

        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){

        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){

        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){

        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){

        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){

        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){

        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerRenders(ModelRegistryEvent event){
        //registerRender(Item.getItemFromBlock());
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            registerRender(Item.getItemFromBlock(oreAluminium));
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            registerRender(Item.getItemFromBlock(oreChrome));
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            registerRender(Item.getItemFromBlock(oreCobalt));
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            registerRender(Item.getItemFromBlock(oreCopper));
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            registerRender(Item.getItemFromBlock(oreIridium));
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            registerRender(Item.getItemFromBlock(oreLead));
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            registerRender(Item.getItemFromBlock(oreMithril));
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            registerRender(Item.getItemFromBlock(oreNickel));
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            registerRender(Item.getItemFromBlock(oreOsmium));
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            registerRender(Item.getItemFromBlock(orePlatinum));
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            registerRender(Item.getItemFromBlock(oreSilver));
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            registerRender(Item.getItemFromBlock(oreTin));
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            registerRender(Item.getItemFromBlock(oreTitanium));
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            registerRender(Item.getItemFromBlock(oreTungsten));
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            registerRender(Item.getItemFromBlock(oreUranium));
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            registerRender(Item.getItemFromBlock(oreZinc));
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){

        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){

        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){

        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){

        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){

        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){

        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){

        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){

        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){

        }
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict(){
        //ores
        OreDictionary.registerOre("oreAluminium", ModBlocks.oreAluminium);
        OreDictionary.registerOre("oreChrome", ModBlocks.oreChrome);
        OreDictionary.registerOre("oreCobalt", ModBlocks.oreCobalt);
        OreDictionary.registerOre("oreCopper", ModBlocks.oreCopper);
        OreDictionary.registerOre("oreIridium", ModBlocks.oreIridium);
        OreDictionary.registerOre("oreLead", ModBlocks.oreLead);
        OreDictionary.registerOre("oreMithril", ModBlocks.oreMithril);
        OreDictionary.registerOre("oreNickel", ModBlocks.oreNickel);
        OreDictionary.registerOre("oreOsmium", ModBlocks.oreOsmium);
        OreDictionary.registerOre("orePlatinum", ModBlocks.orePlatinum);
        OreDictionary.registerOre("oreSilver", ModBlocks.oreSilver);
        OreDictionary.registerOre("oreTin", ModBlocks.oreTin);
        OreDictionary.registerOre("oreTitanium", ModBlocks.oreTitanium);
        OreDictionary.registerOre("oreTungsten", ModBlocks.oreTungsten);
        OreDictionary.registerOre("oreUranium", ModBlocks.oreUranium);
        OreDictionary.registerOre("oreZinc", ModBlocks.oreZinc);
        //combined
        //OreDictionary.registerOre("blockAluminium", ModBlocks.blockAluminium);
        //OreDictionary.registerOre("blockChrome", ModBlocks.blockChrome);
        //OreDictionary.registerOre("blockCobalt", ModBlocks.blockCobalt);
        //OreDictionary.registerOre("blockCopper", ModBlocks.blockCopper);
    }
}
