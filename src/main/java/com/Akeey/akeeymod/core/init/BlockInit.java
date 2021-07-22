package com.Akeey.akeeymod.core.init;

import com.Akeey.akeeymod.AkeeyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,AkeeyMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("testblock", () -> new Block(AbstractBlock.Properties
			.of(Material.DIRT, MaterialColor.FIRE)
			.strength(2f, 5f)
			.harvestTool(ToolType.SHOVEL)
			.harvestLevel(0)
			.jumpFactor(5)
			.sound(SoundType.CORAL_BLOCK)));
	
}
