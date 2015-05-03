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
	@SuppressWarnings("deprecation")
	@EventHandler
	public void clickpotion(PlayerInteractEvent e){
	    Player p = e.getPlayer();
	    if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
	    	 Block b = e.getClickedBlock();
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.POTION))) {
	    		 p.sendMessage(p.getItemInHand().getData().toString());
	    		 int a = b.getData();
		    		 if(a <= 3){a++;
		    		 b.setData((byte) a);
		    		 potions.add(p.getItemInHand().getData().toString().replace("POTION(", "").replace(")", ""));}
		    		 if(potions.size() == 3){
		    			 p.sendMessage("you create a new potion");
		    			 ItemStack potion = new ItemStack(Material.POTION);
		    			 PotionMeta meta = (PotionMeta) potion.getItemMeta();
		    			 List<String> lore = new ArrayList<String>();
		    			 if(potions.get(0).contentEquals("0")){
				//    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
		    			 }
		    			 if(potions.get(0).contentEquals("35")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
				    		 lore.add("Fire Resistance");
		    			 }
		    			 if(potions.get(0).contentEquals("76")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
				    		 lore.add("Harm");
		    			 }
		    			 if(potions.get(0).contentEquals("69")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
				    		 lore.add("Heal");
		    			 }
		    			 if(potions.get(0).contentEquals("9")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
				    		 lore.add("Strength");
		    			 }
		    			 if(potions.get(0).contentEquals("46")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
				    		 lore.add("Invisibility");
		    			 }
		    			 if(potions.get(0).contentEquals("38")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
				    		 lore.add("Night Vision");
		    			 }
		    			 if(potions.get(0).contentEquals("4")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
				    		 lore.add("Poison");
		    			 }
		    			 if(potions.get(0).contentEquals("1")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
				    		 lore.add("Regeneration");
		    			 }
		    			 if(potions.get(0).contentEquals("42")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
				    		 lore.add("Slowness");
		    			 }
		    			 if(potions.get(0).contentEquals("2")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
				    		 lore.add("Speed");
		    			 }
		    			 if(potions.get(0).contentEquals("45")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
				    		 lore.add("Water Breathing");
		    			 }
		    			 if(potions.get(0).contentEquals("40")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
				    		 lore.add("Weakness");
		    			 }
		    			 if(potions.get(1).contentEquals("0")){
				//    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
		    			 }
		    			 if(potions.get(1).contentEquals("35")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
				    		 lore.add("Fire Resistance");
		    			 }
		    			 if(potions.get(1).contentEquals("76")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
				    		 lore.add("Harm");
		    			 }
		    			 if(potions.get(1).contentEquals("69")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
				    		 lore.add("Heal");
		    			 }
		    			 if(potions.get(1).contentEquals("9")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
				    		 lore.add("Strength");
		    			 }
		    			 if(potions.get(1).contentEquals("46")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
				    		 lore.add("Invisibility");
		    			 }
		    			 if(potions.get(1).contentEquals("38")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
				    		 lore.add("Night Vision");
		    			 }
		    			 if(potions.get(1).contentEquals("4")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
				    		 lore.add("Poison");
		    			 }
		    			 if(potions.get(1).contentEquals("1")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
				    		 lore.add("Regeneration");
		    			 }
		    			 if(potions.get(1).contentEquals("42")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
				    		 lore.add("Slowness");
		    			 }
		    			 if(potions.get(1).contentEquals("2")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
				    		 lore.add("Speed");
		    			 }
		    			 if(potions.get(1).contentEquals("45")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
				    		 lore.add("Water Breathing");
		    			 }
		    			 if(potions.get(1).contentEquals("40")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
				    		 lore.add("Weakness");
		    			 }
		    			 if(potions.get(2).contentEquals("0")){
			//	    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
		    			 }
		    			 if(potions.get(2).contentEquals("35")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 1), true);
				    		 lore.add("Fire Resistance");
		    			 }
		    			 if(potions.get(2).contentEquals("76")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 600, 1), true);
				    		 lore.add("Harm");
		    			 }
		    			 if(potions.get(2).contentEquals("69")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1), true);
				    		 lore.add("Heal");
		    			 }
		    			 if(potions.get(2).contentEquals("9")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1), true);
				    		 lore.add("Strength");
		    			 }
		    			 if(potions.get(2).contentEquals("46")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1), true);
				    		 lore.add("Invisibility");
		    			 }
		    			 if(potions.get(2).contentEquals("38")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1), true);
				    		 lore.add("Night Vision");
		    			 }
		    			 if(potions.get(2).contentEquals("4")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 600, 1), true);
				    		 lore.add("Poison");
		    			 }
		    			 if(potions.get(2).contentEquals("1")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 1), true);
				    		 lore.add("Regeneration");
		    			 }
		    			 if(potions.get(2).contentEquals("42")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1), true);
				    		 lore.add("Slowness");
		    			 }
		    			 if(potions.get(2).contentEquals("2")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1), true);
				    		 lore.add("Speed");
		    			 }
		    			 if(potions.get(2).contentEquals("45")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 1), true);
				    		 lore.add("Water Breathing");
		    			 }
		    			 if(potions.get(2).contentEquals("40")){
				    		 meta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1), true);
				    		 lore.add("Weakness");
		    			 }
		    			 meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Custom Potion");
		    			 meta.setLore(lore);
			    		 potion.setItemMeta(meta);
			    		 p.getInventory().addItem(potion);
		    			 potions.remove(0);
		    			 potions.remove(0);
		    			 potions.remove(0);
		    			 a=0;
			    		 b.setData((byte) 0);
			    		 //ItemStack pota = new ItemStack(Material.POTION, 1, (short) 6); // el 6 es el id del effecto
			    		 //p.getWorld().dropItemNaturally(p.getLocation(), pota);
		    		 }}}}}
