package com.github.h0bit.modtutorial;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModTutorial.MODID, name = ModTutorial.NAME, version = ModTutorial.VERSION)

public class ModTutorial {
	public static final String MODID = "modtutorial";
	public static final String NAME = "ModTutorial";
	public static final String VERSION = "v1.0.0";
	
	private ItemStack op_sword;
	private ItemStack op_pickaxe;
	private ItemStack op_bow;
	private ItemStack op_helmet;
	private ItemStack op_chestplate;
	private ItemStack op_leggings;
	private ItemStack op_boots;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 1), "DDD", "DDD", "DDD", 
				'D', Blocks.dirt);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 5), 
				Blocks.dirt, Blocks.sand, Items.water_bucket.setContainerItem(Items.bucket));
		
		GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Items.diamond, 1), 1.0F);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "EEE", "EBE", "EEE",
				'E', Items.diamond, 'B', Items.blaze_powder);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor), "  I", "III", "I I",
				'I', Items.iron_ingot);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor), "  G", "GGG", "G G",
				'G', Items.gold_ingot);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor), "  D", "DDD", "D D",
				'D', Items.diamond);
		
		//Op Sword!
		op_sword = new ItemStack(Items.diamond_sword);
		op_sword.addEnchantment(Enchantment.fireAspect, 2);
		op_sword.addEnchantment(Enchantment.looting, 3);
		op_sword.addEnchantment(Enchantment.sharpness, 5);
		op_sword.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_sword, " N ", " N ", " S ",
				'N', Items.nether_star, 'S', Items.stick);
		
		//Op Pickaxe!
		op_pickaxe = new ItemStack(Items.diamond_pickaxe);
		op_pickaxe.addEnchantment(Enchantment.efficiency, 5);
		op_pickaxe.addEnchantment(Enchantment.fortune, 3);
		op_pickaxe.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_pickaxe, "NNN", " S ", " S ",
				'N', Items.nether_star, 'S', Items.stick);
		
		//Op Bow!
		op_bow = new ItemStack(Items.bow);
		op_bow.addEnchantment(Enchantment.power, 5);
		op_bow.addEnchantment(Enchantment.flame, 1);
		op_bow.addEnchantment(Enchantment.infinity, 1);
		op_bow.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_bow, "SN ", "S N", "SN ",
				'N', Items.nether_star, 'S', Items.string);
		
		//Op Helmet!
		op_helmet = new ItemStack(Items.diamond_helmet);
		op_helmet.addEnchantment(Enchantment.protection, 4);
		op_helmet.addEnchantment(Enchantment.thorns, 3);
		op_helmet.addEnchantment(Enchantment.respiration, 3);
		op_helmet.addEnchantment(Enchantment.aquaAffinity, 1);
		op_helmet.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_helmet, "NNN", "N N",
				'N', Items.nether_star);
		
		//Op Chestplate!
		op_chestplate = new ItemStack(Items.diamond_chestplate);
		op_chestplate.addEnchantment(Enchantment.protection, 4);
		op_chestplate.addEnchantment(Enchantment.thorns, 3);
		op_chestplate.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_chestplate, "N N", "NNN", "NNN",
				'N', Items.nether_star);
		
		//Op Chestplate!
		op_leggings = new ItemStack(Items.diamond_leggings);
		op_leggings.addEnchantment(Enchantment.protection, 4);
		op_leggings.addEnchantment(Enchantment.thorns, 3);
		op_leggings.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_leggings, "NNN", "N N", "N N",
				'N', Items.nether_star);
		
		//Op Boots!
		op_boots = new ItemStack(Items.diamond_boots);
		op_boots.addEnchantment(Enchantment.protection, 4);
		op_boots.addEnchantment(Enchantment.thorns, 3);
		op_boots.addEnchantment(Enchantment.featherFalling, 4);
		op_boots.addEnchantment(Enchantment.unbreaking, 3);
		
		GameRegistry.addShapedRecipe(op_boots, "N N", "N N",
				'N', Items.nether_star);
		
		System.out.println("============== Done with custom recipes!");
	}
	
	//TODO: research about onArmorTick
	/*public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		System.out.println("============== hi");
		
		if (player.getCurrentArmor(2) == op_chestplate) {
			System.out.println("============== yes!");
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
		}
	}*/
}
