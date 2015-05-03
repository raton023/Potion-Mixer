package com.craftilandia.potionmixer;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
public class Main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	ArrayList<String> potions = new ArrayList<String>();
	ArrayList<String> potions2 = new ArrayList<String>();
	@SuppressWarnings("deprecation")
	@EventHandler
	public void clickpotion(PlayerInteractEvent e){
	    Player p = e.getPlayer();
	    if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
	    	 Block b = e.getClickedBlock();
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.POTION))) {
	    		 int a = b.getData();
	    		 p.sendMessage(p.getItemInHand().getData().toString().replace("POTION(", "").replace(")", ""));
		    		 if(a <= 3){a++;
		    		 b.setData((byte) a);
		    		 potions.add(p.getItemInHand().getData().toString().replace("POTION(", "").replace(")", ""));
		    		 potions2.add(p.getItemInHand().getItemMeta().toString());
		    		 }
		    		 if(potions.size() == 3){
		    			 p.sendMessage(ChatColor.AQUA + "you create a new potion");
		    			 ItemStack potion = new ItemStack(Material.POTION);
		    			 PotionMeta meta = (PotionMeta) potion.getItemMeta();
		    			 List<String> lore = new ArrayList<String>();
		    			 if(potions.get(0).contentEquals("0")){
		    				 if(potions2.get(0).contains("FIRE_RESISTANCE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Fire Resistance");
		    				 }
		    				 if(potions2.get(0).contains("HARM")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Harm");
		    				 }
		    				 if(potions2.get(0).contains("HEAL")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Heal");
		    				 }
		    				 if(potions2.get(0).contains("INCREASE_DAMAGE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Strength");
		    				 }
		    				 if(potions2.get(0).contains("INVISIBILITY")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Invisibility");
		    				 }
		    				 if(potions2.get(0).contains("NIGHT_VISION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Night Vision");
		    				 }
		    				 if(potions2.get(0).contains("POISON")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Poison");
		    				 }
		    				 if(potions2.get(0).contains("REGENERATION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Regeneration");
		    				 }
		    				 if(potions2.get(0).contains("SLOW")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Slowness");
		    				 }
		    				 if(potions2.get(0).contains("SPEED")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Speed");
		    				 }
		    				 if(potions2.get(0).contains("WATER_BREATHING")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Water Breathing");
		    				 }
		    				 if(potions2.get(0).contains("WEAKNESS")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Weakness");
		    				 }
		    			 }
		    			 if(potions.get(1).contentEquals("0")){
		    				 if(potions2.get(1).contains("FIRE_RESISTANCE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Fire Resistance");
		    				 }
		    				 if(potions2.get(1).contains("HARM")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Harm");
		    				 }
		    				 if(potions2.get(1).contains("HEAL")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Heal");
		    				 }
		    				 if(potions2.get(1).contains("INCREASE_DAMAGE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Strength");
		    				 }
		    				 if(potions2.get(1).contains("INVISIBILITY")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Invisibility");
		    				 }
		    				 if(potions2.get(1).contains("NIGHT_VISION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Night Vision");
		    				 }
		    				 if(potions2.get(1).contains("POISON")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Poison");
		    				 }
		    				 if(potions2.get(1).contains("REGENERATION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Regeneration");
		    				 }
		    				 if(potions2.get(1).contains("SLOW")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Slowness");
		    				 }
		    				 if(potions2.get(1).contains("SPEED")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Speed");
		    				 }
		    				 if(potions2.get(1).contains("WATER_BREATHING")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Water Breathing");
		    				 }
		    				 if(potions2.get(1).contains("WEAKNESS")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Weakness");
		    				 }
		    			 }
		    			 if(potions.get(2).contentEquals("0")){
		    				 if(potions2.get(2).contains("FIRE_RESISTANCE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Fire Resistance");
		    				 }
		    				 if(potions2.get(2).contains("HARM")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Harm");
		    				 }
		    				 if(potions2.get(2).contains("HEAL")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Heal");
		    				 }
		    				 if(potions2.get(2).contains("INCREASE_DAMAGE")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Strength");
		    				 }
		    				 if(potions2.get(2).contains("INVISIBILITY")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Invisibility");
		    				 }
		    				 if(potions2.get(2).contains("NIGHT_VISION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Night Vision");
		    				 }
		    				 if(potions2.get(2).contains("POISON")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Poison");
		    				 }
		    				 if(potions2.get(2).contains("REGENERATION")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Regeneration");
		    				 }
		    				 if(potions2.get(2).contains("SLOW")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Slowness");
		    				 }
		    				 if(potions2.get(2).contains("SPEED")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Speed");
		    				 }
		    				 if(potions2.get(2).contains("WATER_BREATHING")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Water Breathing");
		    				 }
		    				 if(potions2.get(2).contains("WEAKNESS")){
		    					 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
					    		 lore.add(ChatColor.GOLD + "Weakness");
		    				 }
		    			 }
		    			 if(potions.get(0).contentEquals("35") || potions.get(1).contentEquals("35") || potions.get(2).contentEquals("35")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Fire Resistance");
		    			 }
		    			 if(potions.get(0).contentEquals("76") || potions.get(1).contentEquals("76") || potions.get(2).contentEquals("76")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 20, 0), true);
				    		 lore.add(ChatColor.GOLD + "Harm");
		    			 }
		    			 if(potions.get(0).contentEquals("69") || potions.get(1).contentEquals("69") || potions.get(2).contentEquals("69")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 0), true);
				    		 lore.add(ChatColor.GOLD + "Heal");
		    			 }
		    			 if(potions.get(0).contentEquals("9") || potions.get(1).contentEquals("9") || potions.get(2).contentEquals("9")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Strength");
		    			 }
		    			 if(potions.get(0).contentEquals("46") || potions.get(1).contentEquals("46") || potions.get(2).contentEquals("46")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Invisibility");
		    			 }
		    			 if(potions.get(0).contentEquals("38") || potions.get(1).contentEquals("38") || potions.get(2).contentEquals("38")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Night Vision");
		    			 }
		    			 if(potions.get(0).contentEquals("4") || potions.get(1).contentEquals("4") || potions.get(2).contentEquals("4")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 900, 0), true);
				    		 lore.add(ChatColor.GOLD + "Poison");
		    			 }
		    			 if(potions.get(0).contentEquals("1") || potions.get(1).contentEquals("1") || potions.get(2).contentEquals("1")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 900, 0), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration");
		    			 }
		    			 if(potions.get(0).contentEquals("33") || potions.get(1).contentEquals("33") || potions.get(2).contentEquals("33")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 440, 1), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration");
		    			 }
		    			 if(potions.get(0).contentEquals("65") || potions.get(1).contentEquals("65") || potions.get(2).contentEquals("65")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 2400, 0), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration");
		    			 }
		    			 if(potions.get(0).contentEquals("42") || potions.get(1).contentEquals("42") || potions.get(2).contentEquals("42")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 1800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Slowness");
		    			 }
		    			 if(potions.get(0).contentEquals("2") || potions.get(1).contentEquals("2") || potions.get(2).contentEquals("2")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Speed");
		    			 }
		    			 if(potions.get(0).contentEquals("45") || potions.get(1).contentEquals("45") || potions.get(2).contentEquals("45")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Water Breathing");
		    			 }
		    			 if(potions.get(0).contentEquals("40") || potions.get(1).contentEquals("40") || potions.get(2).contentEquals("40")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Weakness");
		    			 }
		    			 meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Custom Potion");
		    			 meta.setLore(lore);
			    		 potion.setItemMeta(meta);
			    		 p.getInventory().addItem(potion);
			    		 potions.remove(0);
		    			 potions.remove(0);
		    			 potions.remove(0);
		    			 potions2.remove(0);
		    			 potions2.remove(0);
		    			 potions2.remove(0);
		    			 a=0;
			    		 b.setData((byte) 0);
			    		 //ItemStack pota = new ItemStack(Material.POTION, 1, (short) 6); // el 6 es el id del effecto
			    		 //p.getWorld().dropItemNaturally(p.getLocation(), pota);
		    		 }}}}}
