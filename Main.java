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
		    			 if(potions.get(0).contentEquals("0") || potions.get(1).contentEquals("0") || potions.get(2).contentEquals("0")){
		    				 if(potions2.get(0).contains("FIRE_RESISTANCE") || potions2.get(1).contains("FIRE_RESISTANCE") || potions2.get(2).contains("FIRE_RESISTANCE")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Fire Resistance 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Fire Resistance 8:00");
		    					 }	  
		    				 }
		    				 if(potions2.get(0).contains("HARM") || potions2.get(1).contains("HARM") || potions2.get(2).contains("HARM")){
		    					 if(potions2.get(0).contains("x1") || potions2.get(1).contains("x1") || potions2.get(2).contains("x1")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 20, 1), true);
						    		 lore.add(ChatColor.GOLD + "Harm2");
		    					 }
		    					 if(potions2.get(0).contains("x0") || potions2.get(1).contains("x0") || potions2.get(2).contains("x0")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 20, 0), true);
						    		 lore.add(ChatColor.GOLD + "Harm");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("HEAL") || potions2.get(1).contains("HEAL") || potions2.get(2).contains("HEAL")){
		    					 if(potions2.get(0).contains("x1") || potions2.get(1).contains("x1") || potions2.get(2).contains("x1")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 1), true);
						    		 lore.add(ChatColor.GOLD + "Heal2");
		    					 }
		    					 if(potions2.get(0).contains("x0") || potions2.get(1).contains("x0") || potions2.get(2).contains("x0")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 0), true);
						    		 lore.add(ChatColor.GOLD + "Heal");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("INCREASE_DAMAGE") || potions2.get(1).contains("INCREASE_DAMAGE") || potions2.get(2).contains("INCREASE_DAMAGE")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Strength 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Strength 8:00");
		    					 }
		    					 if(potions2.get(0).contains("1800") || potions2.get(1).contains("1800") || potions2.get(2).contains("1800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1800, 1), true);
						    		 lore.add(ChatColor.GOLD + "Strength2 1:30");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("INVISIBILITY") || potions2.get(1).contains("INVISIBILITY") || potions2.get(2).contains("INVISIBILITY")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Invisibility 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Invisibility 8:00");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("NIGHT_VISION") || potions2.get(1).contains("NIGHT_VISION") || potions2.get(2).contains("NIGHT_VISION")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Night Vision 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Night Vision 8:00");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("POISON") || potions2.get(1).contains("POISON") || potions2.get(2).contains("POISON")){
		    					 if(potions2.get(0).contains("440") || potions2.get(1).contains("440") || potions2.get(2).contains("440")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 440, 1), true);
						    		 lore.add(ChatColor.GOLD + "Poison2 0:22");
		    					 }
		    					 if(potions2.get(0).contains("900") || potions2.get(1).contains("900") || potions2.get(2).contains("900")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 900, 0), true);
						    		 lore.add(ChatColor.GOLD + "Poison 0:45");
		    					 }
		    					 if(potions2.get(0).contains("2400") || potions2.get(1).contains("2400") || potions2.get(2).contains("2400")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 2400, 0), true);
						    		 lore.add(ChatColor.GOLD + "Poison 2:00");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("REGENERATION") || potions2.get(1).contains("REGENERATION") || potions2.get(2).contains("REGENERATION")){
		    					 if(potions2.get(0).contains("440") || potions2.get(1).contains("440") || potions2.get(2).contains("440")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 440, 1), true);
						    		 lore.add(ChatColor.GOLD + "Regeneration2 0:22");
		    					 }
		    					 if(potions2.get(0).contains("900") || potions2.get(1).contains("900") || potions2.get(2).contains("900")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 900, 0), true);
						    		 lore.add(ChatColor.GOLD + "Regeneration 0:45");
		    					 }
		    					 if(potions2.get(0).contains("2400") || potions2.get(1).contains("2400") || potions2.get(2).contains("2400")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 2400, 0), true);
						    		 lore.add(ChatColor.GOLD + "Regeneration 2:00");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("SLOW") || potions2.get(1).contains("SLOW") || potions2.get(2).contains("SLOW")){
		    					 if(potions2.get(0).contains("4800") || potions2.get(1).contains("4800") || potions2.get(2).contains("4800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 4800, 0), true);
						    		 lore.add(ChatColor.GOLD + "Slowness 4:00");
		    					 }
		    					 if(potions2.get(0).contains("1800") || potions2.get(1).contains("1800") || potions2.get(2).contains("1800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 1800, 0), true);
						    		 lore.add(ChatColor.GOLD + "Slowness 1:30");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("SPEED") || potions2.get(1).contains("SPEED") || potions2.get(2).contains("SPEED")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Speed 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Speed 8:00");
		    					 }
		    					 if(potions2.get(0).contains("1800") || potions2.get(1).contains("1800") || potions2.get(2).contains("1800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 1800, 1), true);
						    		 lore.add(ChatColor.GOLD + "Speed2 1:30");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("WATER_BREATHING") || potions2.get(1).contains("WATER_BREATHING") || potions2.get(2).contains("WATER_BREATHING")){
		    					 if(potions2.get(0).contains("3600") || potions2.get(1).contains("3600") || potions2.get(2).contains("3600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 3600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Water Breathing 3:00");
		    					 }
		    					 if(potions2.get(0).contains("9600") || potions2.get(1).contains("9600") || potions2.get(2).contains("9600")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 9600, 0), true);
						    		 lore.add(ChatColor.GOLD + "Water Breathing 8:00");
		    					 }
		    				 }
		    				 if(potions2.get(0).contains("WEAKNESS") || potions2.get(1).contains("WEAKNESS") || potions2.get(2).contains("WEAKNESS")){
		    					 if(potions2.get(0).contains("1800") || potions2.get(1).contains("1800") || potions2.get(2).contains("1800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1800, 0), true);
						    		 lore.add(ChatColor.GOLD + "Weakness 1:30");
		    					 }
		    					 if(potions2.get(0).contains("4800") || potions2.get(1).contains("4800") || potions2.get(2).contains("4800")){
		    						 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 4800, 0), true);
						    		 lore.add(ChatColor.GOLD + "Weakness 4:00");
		    					 }
		    				 }
		    			 }
		    			 
		    			 if(potions.get(0).contentEquals("35") || potions.get(1).contentEquals("35") || potions.get(2).contentEquals("35")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Fire Resistance 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("67") || potions.get(1).contentEquals("67") || potions.get(2).contentEquals("67")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Fire Resistance 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("76") || potions.get(1).contentEquals("76") || potions.get(2).contentEquals("76")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 20, 0), true);
				    		 lore.add(ChatColor.GOLD + "Harm");
		    			 }
		    			 if(potions.get(0).contentEquals("44") || potions.get(1).contentEquals("44") || potions.get(2).contentEquals("44")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 20, 1), true);
				    		 lore.add(ChatColor.GOLD + "Harm2");
		    			 }
		    			 if(potions.get(0).contentEquals("69") || potions.get(1).contentEquals("69") || potions.get(2).contentEquals("69")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 0), true);
				    		 lore.add(ChatColor.GOLD + "Heal");
		    			 }
		    			 if(potions.get(0).contentEquals("37") || potions.get(1).contentEquals("37") || potions.get(2).contentEquals("37")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 1), true);
				    		 lore.add(ChatColor.GOLD + "Heal2");
		    			 }
		    			 if(potions.get(0).contentEquals("9") || potions.get(1).contentEquals("9") || potions.get(2).contentEquals("9")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Strength 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("41") || potions.get(1).contentEquals("41") || potions.get(2).contentEquals("41")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1800, 1), true);
				    		 lore.add(ChatColor.GOLD + "Strength2 1:30");
		    			 }
		    			 if(potions.get(0).contentEquals("73") || potions.get(1).contentEquals("73") || potions.get(2).contentEquals("73")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Strength 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("46") || potions.get(1).contentEquals("46") || potions.get(2).contentEquals("46")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Invisibility 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("78") || potions.get(1).contentEquals("78") || potions.get(2).contentEquals("78")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Invisibility 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("38") || potions.get(1).contentEquals("38") || potions.get(2).contentEquals("38")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Night Vision 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("70") || potions.get(1).contentEquals("70") || potions.get(2).contentEquals("70")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Night Vision 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("4") || potions.get(1).contentEquals("4") || potions.get(2).contentEquals("4")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 900, 0), true);
				    		 lore.add(ChatColor.GOLD + "Poison 0:45");
		    			 }
		    			 if(potions.get(0).contentEquals("36") || potions.get(1).contentEquals("36") || potions.get(2).contentEquals("36")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 440, 1), true);
				    		 lore.add(ChatColor.GOLD + "Poison2 0:22");
		    			 }
		    			 if(potions.get(0).contentEquals("68") || potions.get(1).contentEquals("68") || potions.get(2).contentEquals("68")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 2400, 0), true);
				    		 lore.add(ChatColor.GOLD + "Poison 2:00");
		    			 }
		    			 if(potions.get(0).contentEquals("1") || potions.get(1).contentEquals("1") || potions.get(2).contentEquals("1")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 900, 0), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration 0:45");
		    			 }
		    			 if(potions.get(0).contentEquals("33") || potions.get(1).contentEquals("33") || potions.get(2).contentEquals("33")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 440, 1), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration2 0:22");
		    			 }
		    			 if(potions.get(0).contentEquals("65") || potions.get(1).contentEquals("65") || potions.get(2).contentEquals("65")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 2400, 0), true);
				    		 lore.add(ChatColor.GOLD + "Regeneration 2:00");
		    			 }
		    			 if(potions.get(0).contentEquals("42") || potions.get(1).contentEquals("42") || potions.get(2).contentEquals("42")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 1800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Slowness 1:30");
		    			 }
		    			 if(potions.get(0).contentEquals("74") || potions.get(1).contentEquals("74") || potions.get(2).contentEquals("74")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 4800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Slowness 4:00");
		    			 }
		    			 if(potions.get(0).contentEquals("2") || potions.get(1).contentEquals("2") || potions.get(2).contentEquals("2")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Speed 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("34") || potions.get(1).contentEquals("34") || potions.get(2).contentEquals("34")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 1800, 1), true);
				    		 lore.add(ChatColor.GOLD + "Speed2 1:30");
		    			 }
		    			 if(potions.get(0).contentEquals("66") || potions.get(1).contentEquals("66") || potions.get(2).contentEquals("66")){
		    				 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Speed 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("45") || potions.get(1).contentEquals("45") || potions.get(2).contentEquals("45")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 3600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Water Breathing 3:00");
		    			 }
		    			 if(potions.get(0).contentEquals("77") || potions.get(1).contentEquals("77") || potions.get(2).contentEquals("77")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 9600, 0), true);
				    		 lore.add(ChatColor.GOLD + "Water Breathing 8:00");
		    			 }
		    			 if(potions.get(0).contentEquals("40") || potions.get(1).contentEquals("40") || potions.get(2).contentEquals("40")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Weakness 1:30");
		    			 }
		    			 if(potions.get(0).contentEquals("72") || potions.get(1).contentEquals("72") || potions.get(2).contentEquals("72")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 4800, 0), true);
				    		 lore.add(ChatColor.GOLD + "Weakness 4:00");
		    			 }
		    			 meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Witch Potion");
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
