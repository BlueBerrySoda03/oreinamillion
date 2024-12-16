package com.blueberrysoda.oreinamillion.init;

import com.blueberrysoda.oreinamillion.config.OreInAMillionConfig;
import com.blueberrysoda.oreinamillion.items.ItemCoal;
import com.blueberrysoda.oreinamillion.items.ItemIngot;
import com.blueberrysoda.oreinamillion.items.ItemNugget;
import com.blueberrysoda.oreinamillion.items.misc.ItemIcon;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModItems {
    //=========
    //minerals
    //=========
    //base ingots
    public static ItemIngot ingotAluminium;
    public static ItemIngot ingotChrome;
    public static ItemIngot ingotCobalt;
    public static ItemIngot ingotCopper;
    public static ItemIngot ingotIridium;
    public static ItemIngot ingotLead;
    public static ItemIngot ingotMithril;
    public static ItemIngot ingotNickel;
    public static ItemIngot ingotOsmium;
    public static ItemIngot ingotPlatinum;
    public static ItemIngot ingotSilver;
    public static ItemIngot ingotTin;
    public static ItemIngot ingotTitanium;
    public static ItemIngot ingotTungsten;
    public static ItemIngot ingotUranium;
    public static ItemIngot ingotZinc;
    //alloy ingots
    public static ItemIngot ingotBrass;
    public static ItemIngot ingotBronze;
    public static ItemIngot ingotElectrum;
    public static ItemIngot ingotInvar;
    public static ItemIngot ingotSteel;
    //gems


    //=========
    //nuggets
    //=========
    //base nuggets
    public static ItemNugget nuggetAluminium;
    public static ItemNugget nuggetChrome;
    public static ItemNugget nuggetCobalt;
    public static ItemNugget nuggetCopper;
    public static ItemNugget nuggetIridium;
    public static ItemNugget nuggetLead;
    public static ItemNugget nuggetMithril;
    public static ItemNugget nuggetNickel;
    public static ItemNugget nuggetOsmium;
    public static ItemNugget nuggetPlatinum;
    public static ItemNugget nuggetSilver;
    public static ItemNugget nuggetTin;
    public static ItemNugget nuggetTitanium;
    public static ItemNugget nuggetTungsten;
    public static ItemNugget nuggetUranium;
    public static ItemNugget nuggetZinc;
    //alloy nuggets
    public static ItemNugget nuggetBrass;
    public static ItemNugget nuggetBronze;
    public static ItemNugget nuggetElectrum;
    public static ItemNugget nuggetInvar;
    public static ItemNugget nuggetSteel;
    //gem nuggets

    //vanilla nuggets
    public static ItemNugget nuggetDiamond;
    public static ItemNugget nuggetEmerald;
    public static ItemCoal nuggetCoal;
    public static ItemCoal nuggetCharcoal;

    //========
    //icons
    //========
    public static ItemIcon creativeIcon1;
    public static ItemIcon creativeIcon2;
    public static ItemIcon creativeIcon3;

    public static void init(){
        // = new ("");
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            ingotAluminium = new ItemIngot("aluminium_ingot");
            nuggetAluminium = new ItemNugget("aluminium_nugget");
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            ingotChrome = new ItemIngot("chrome_ingot");
            nuggetChrome = new ItemNugget("chrome_nugget");
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            ingotCobalt = new ItemIngot("cobalt_ingot");
            nuggetCobalt = new ItemNugget("cobalt_nugget");
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            ingotCopper = new ItemIngot("copper_ingot");
            nuggetCopper = new ItemNugget("copper_nugget");
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            ingotIridium = new ItemIngot("iridium_ingot");
            nuggetIridium = new ItemNugget("iridium_nugget");
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            ingotLead = new ItemIngot("lead_ingot");
            nuggetLead = new ItemNugget("lead_nugget");
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            ingotMithril = new ItemIngot("mithril_ingot");
            nuggetMithril = new ItemNugget("mithril_nugget");
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            ingotNickel = new ItemIngot("nickel_ingot");
            nuggetNickel = new ItemNugget("nickel_nugget");
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            ingotOsmium = new ItemIngot("osmium_ingot");
            nuggetOsmium = new ItemNugget("osmium_nugget");
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            ingotPlatinum = new ItemIngot("platinum_ingot");
            nuggetPlatinum = new ItemNugget("platinum_nugget");
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            ingotSilver = new ItemIngot("silver_ingot");
            nuggetSilver = new ItemNugget("silver_nugget");
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            ingotTin = new ItemIngot("tin_ingot");
            nuggetTin = new ItemNugget("tin_nugget");
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            ingotTitanium = new ItemIngot("titanium_ingot");
            nuggetTitanium = new ItemNugget("titanium_nugget");
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            ingotTungsten = new ItemIngot("tungsten_ingot");
            nuggetTungsten = new ItemNugget("tungsten_nugget");
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            ingotUranium = new ItemIngot("uranium_ingot");
            nuggetUranium = new ItemNugget("uranium_nugget");
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            ingotZinc = new ItemIngot("zinc_ingot");
            nuggetZinc = new ItemNugget("zinc_nugget");
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){
            ingotBrass = new ItemIngot("brass_ingot");
            nuggetBrass = new ItemNugget("brass_nugget");
        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){
            ingotBronze = new ItemIngot("bronze_ingot");
            nuggetBronze = new ItemNugget("bronze_nugget");
        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){
            ingotElectrum = new ItemIngot("electrum_ingot");
            nuggetElectrum = new ItemNugget("electrum_nugget");
        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){
            ingotInvar= new ItemIngot("invar_ingot");
            nuggetInvar = new ItemNugget("invar_nugget");
        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){
            ingotSteel = new ItemIngot("steel_ingot");
            nuggetSteel = new ItemNugget("steel_nugget");
        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){
            nuggetDiamond = new ItemNugget("diamond_nugget");
        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){
            nuggetEmerald = new ItemNugget("emerald_nugget");
        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){
            nuggetCoal = new ItemCoal("coal_nugget", 200);
        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){
            nuggetCharcoal = new ItemCoal("charcoal_nugget", 200);
        }

        creativeIcon1 = new ItemIcon("creative_icon1");
        creativeIcon2 = new ItemIcon("creative_icon2");
        creativeIcon3 = new ItemIcon("creative_icon3");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        //event.getRegistry().register();
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            event.getRegistry().register(ingotAluminium);
            event.getRegistry().register(nuggetAluminium);
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            event.getRegistry().register(ingotChrome);
            event.getRegistry().register(nuggetChrome);
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            event.getRegistry().register(ingotCobalt);
            event.getRegistry().register(nuggetCobalt);
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            event.getRegistry().register(ingotCopper);
            event.getRegistry().register(nuggetCopper);
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            event.getRegistry().register(ingotIridium);
            event.getRegistry().register(nuggetIridium);
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            event.getRegistry().register(ingotLead);
            event.getRegistry().register(nuggetLead);
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            event.getRegistry().register(ingotMithril);
            event.getRegistry().register(nuggetMithril);
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            event.getRegistry().register(ingotNickel);
            event.getRegistry().register(nuggetNickel);
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            event.getRegistry().register(ingotOsmium);
            event.getRegistry().register(nuggetOsmium);
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            event.getRegistry().register(ingotPlatinum);
            event.getRegistry().register(nuggetPlatinum);
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            event.getRegistry().register(ingotSilver);
            event.getRegistry().register(nuggetSilver);
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            event.getRegistry().register(ingotTin);
            event.getRegistry().register(nuggetTin);
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            event.getRegistry().register(ingotTitanium);
            event.getRegistry().register(nuggetTitanium);
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            event.getRegistry().register(ingotTungsten);
            event.getRegistry().register(nuggetTungsten);
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            event.getRegistry().register(ingotUranium);
            event.getRegistry().register(nuggetUranium);
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            event.getRegistry().register(ingotZinc);
            event.getRegistry().register(nuggetZinc);
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){
            event.getRegistry().register(ingotBrass);
            event.getRegistry().register(nuggetBrass);
        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){
            event.getRegistry().register(ingotBronze);
            event.getRegistry().register(nuggetBronze);
        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){
            event.getRegistry().register(ingotElectrum);
            event.getRegistry().register(nuggetElectrum);
        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){
            event.getRegistry().register(ingotInvar);
            event.getRegistry().register(nuggetInvar);
        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){
            event.getRegistry().register(ingotSteel);
            event.getRegistry().register(nuggetSteel);
        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){
            event.getRegistry().register(nuggetDiamond);
        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){
            event.getRegistry().register(nuggetEmerald);
        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){
            event.getRegistry().register(nuggetCoal);
        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){
            event.getRegistry().register(nuggetCharcoal);
        }

        event.getRegistry().register(creativeIcon1);
        event.getRegistry().register(creativeIcon2);
        event.getRegistry().register(creativeIcon3);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        //registerRender();
        //aluminum
        if(OreInAMillionConfig.isAluminiumEnabled){
            registerRender(ingotAluminium);
            registerRender(nuggetAluminium);
        }
        //chrome
        if(OreInAMillionConfig.isChromeEnabled){
            registerRender(ingotChrome);
            registerRender(nuggetChrome);
        }
        //cobalt
        if(OreInAMillionConfig.isCobaltEnabled){
            registerRender(ingotCobalt);
            registerRender(nuggetCobalt);
        }
        //copper
        if(OreInAMillionConfig.isCopperEnabled){
            registerRender(ingotCopper);
            registerRender(nuggetCopper);
        }
        //iridium
        if(OreInAMillionConfig.isIridiumEnabled){
            registerRender(ingotIridium);
            registerRender(nuggetIridium);
        }
        //lead
        if(OreInAMillionConfig.isLeadEnabled){
            registerRender(ingotLead);
            registerRender(nuggetLead);
        }
        //mithril
        if(OreInAMillionConfig.isMithrilEnabled){
            registerRender(ingotMithril);
            registerRender(nuggetMithril);
        }
        //nickel
        if(OreInAMillionConfig.isNickelEnabled){
            registerRender(ingotNickel);
            registerRender(nuggetNickel);
        }
        //osmium
        if(OreInAMillionConfig.isOsmiumEnabled){
            registerRender(ingotOsmium);
            registerRender(nuggetOsmium);
        }
        //platinum
        if(OreInAMillionConfig.isPlatinumEnabled){
            registerRender(ingotPlatinum);
            registerRender(nuggetPlatinum);
        }
        //silver
        if(OreInAMillionConfig.isSilverEnabled){
            registerRender(ingotSilver);
            registerRender(nuggetSilver);
        }
        //tin
        if(OreInAMillionConfig.isTinEnabled){
            registerRender(ingotTin);
            registerRender(nuggetTin);
        }
        //titanium
        if(OreInAMillionConfig.isTitaniumEnabled){
            registerRender(ingotTitanium);
            registerRender(nuggetTitanium);
        }
        //tungsten
        if(OreInAMillionConfig.isTungstenEnabled){
            registerRender(ingotTungsten);
            registerRender(nuggetTungsten);
        }
        //uranium
        if(OreInAMillionConfig.isUraniumEnabled){
            registerRender(ingotUranium);
            registerRender(nuggetUranium);
        }
        //zinc
        if(OreInAMillionConfig.isZincEnabled){
            registerRender(ingotZinc);
            registerRender(nuggetZinc);
        }
        //brass
        if(OreInAMillionConfig.isBrassEnabled){
            registerRender(ingotBrass);
            registerRender(nuggetBrass);
        }
        //bronze
        if(OreInAMillionConfig.isBronzeEnabled){
            registerRender(ingotBronze);
            registerRender(nuggetBronze);
        }
        //electrum
        if(OreInAMillionConfig.isElectrumEnabled){
            registerRender(ingotElectrum);
            registerRender(nuggetElectrum);
        }
        //invar
        if(OreInAMillionConfig.isInvarEnabled){
            registerRender(ingotInvar);
            registerRender(nuggetInvar);
        }
        //steel
        if(OreInAMillionConfig.isSteelEnabled){
            registerRender(ingotSteel);
            registerRender(nuggetSteel);
        }
        //diamond
        if(OreInAMillionConfig.isDiamondEnabled){
            registerRender(nuggetDiamond);
        }
        //emerald
        if(OreInAMillionConfig.isEmeraldEnabled){
            registerRender(nuggetEmerald);
        }
        //coal
        if(OreInAMillionConfig.isCoalEnabled){
            registerRender(nuggetCoal);
        }
        //charcoal
        if(OreInAMillionConfig.isCharcoalEnabled){
            registerRender(nuggetCharcoal);
        }

        registerRender(creativeIcon1);
        registerRender(creativeIcon2);
        registerRender(creativeIcon3);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void initOreDict(){
        //minerals
        //base ingots
        OreDictionary.registerOre("ingotAluminium", ModItems.ingotAluminium);
        OreDictionary.registerOre("ingotChrome", ModItems.ingotChrome);
        OreDictionary.registerOre("ingotCobalt", ModItems.ingotCobalt);
        OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
        OreDictionary.registerOre("ingotIridium", ModItems.ingotIridium);
        OreDictionary.registerOre("ingotLead", ModItems.ingotLead);
        OreDictionary.registerOre("ingotMithril", ModItems.ingotMithril);
        OreDictionary.registerOre("ingotNickel", ModItems.ingotNickel);
        OreDictionary.registerOre("ingotOsmium", ModItems.ingotOsmium);
        OreDictionary.registerOre("ingotPlatinum", ModItems.ingotPlatinum);
        OreDictionary.registerOre("ingotSilver", ModItems.ingotSilver);
        OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
        OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
        OreDictionary.registerOre("ingotTungsten", ModItems.ingotTungsten);
        OreDictionary.registerOre("ingotUranium", ModItems.ingotUranium);
        OreDictionary.registerOre("ingotZinc", ModItems.ingotZinc);
        //alloy ingots
        OreDictionary.registerOre("ingotBrass", ModItems.ingotBrass);
        OreDictionary.registerOre("ingotBronze", ModItems.ingotBronze);
        OreDictionary.registerOre("ingotElectrum", ModItems.ingotElectrum);
        OreDictionary.registerOre("ingotInvar", ModItems.ingotInvar);
        OreDictionary.registerOre("ingotSteel", ModItems.ingotSteel);
        //gems

        //nuggets
        //base nuggets
        OreDictionary.registerOre("nuggetAluminium", ModItems.nuggetAluminium);
        OreDictionary.registerOre("nuggetChrome", ModItems.nuggetChrome);
        OreDictionary.registerOre("nuggetCobalt", ModItems.nuggetCobalt);
        OreDictionary.registerOre("nuggetCopper", ModItems.nuggetCopper);
        OreDictionary.registerOre("nuggetIridium", ModItems.nuggetIridium);
        OreDictionary.registerOre("nuggetLead", ModItems.nuggetLead);
        OreDictionary.registerOre("nuggetMithril", ModItems.nuggetMithril);
        OreDictionary.registerOre("nuggetNickel", ModItems.nuggetNickel);
        OreDictionary.registerOre("nuggetOsmium", ModItems.nuggetOsmium);
        OreDictionary.registerOre("nuggetPlatinum", ModItems.nuggetPlatinum);
        OreDictionary.registerOre("nuggetSilver", ModItems.nuggetSilver);
        OreDictionary.registerOre("nuggetTin", ModItems.nuggetTin);
        OreDictionary.registerOre("nuggetTitanium", ModItems.nuggetTitanium);
        OreDictionary.registerOre("nuggetTungsten", ModItems.nuggetTungsten);
        OreDictionary.registerOre("nuggetUranium", ModItems.nuggetUranium);
        OreDictionary.registerOre("nuggetZinc", ModItems.nuggetZinc);
        //alloy nuggets
        OreDictionary.registerOre("nuggetBrass", ModItems.nuggetBrass);
        OreDictionary.registerOre("nuggetBronze", ModItems.nuggetBronze);
        OreDictionary.registerOre("nuggetElectrum", ModItems.nuggetElectrum);
        OreDictionary.registerOre("nuggetInvar", ModItems.nuggetInvar);
        OreDictionary.registerOre("nuggetSteel", ModItems.nuggetSteel);
        //gems

        //vanilla nuggets
        OreDictionary.registerOre("nuggetDiamond", ModItems.nuggetDiamond);
        OreDictionary.registerOre("nuggetEmerald", ModItems.nuggetEmerald);
        OreDictionary.registerOre("nuggetCoal", ModItems.nuggetCoal);
        OreDictionary.registerOre("nuggetCharcoal", ModItems.nuggetCharcoal);
    }
}
