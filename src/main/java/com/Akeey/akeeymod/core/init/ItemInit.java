package com.Akeey.akeeymod.core.init;

import com.Akeey.akeeymod.AkeeyMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	//Deferredregister
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AkeeyMod.MOD_ID);
	
	//Register the deffered register.
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("test", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC))); 
	
	
	//BlockItems
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("testblock", ()-> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
