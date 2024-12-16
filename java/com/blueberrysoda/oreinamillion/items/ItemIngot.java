package com.blueberrysoda.oreinamillion.items;

import com.blueberrysoda.oreinamillion.OreInAMillion;
import com.blueberrysoda.oreinamillion.items.base.ItemBase;
import net.minecraft.item.Item;

public class ItemIngot extends ItemBase {

    public ItemIngot(String name){
        super(name);
        setCreativeTab(OreInAMillion.CREATIVE_TAB_MINERAL);
    }
}
