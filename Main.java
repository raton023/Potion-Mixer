package com.craftilandia.potionmixer;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	ArrayList<MaterialData> potions = new ArrayList<MaterialData>();
	@SuppressWarnings("deprecation")
	@EventHandler
	public void clickpotion(PlayerInteractEvent e){
	    Player p = e.getPlayer();
	    if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
	    	 Block b = e.getClickedBlock();
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.GLASS_BOTTLE))) {
	 	    	p.sendMessage("work");
	 	    	
	 	    	 }
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.POTION))) {
	    		 p.sendMessage(p.getItemInHand().getData().toString());
	    		 int a = b.getData();
		    		 if(a <= 3){a++;
		    		 b.setData((byte) a);
		    		 potions.add(p.getItemInHand().getData());
}
		    		 if(potions.size() == 3){
		    			 //Object[] pociones = potions.toArray();
		    			 p.sendMessage("you got 3 " + potions.get(0).toString().replace("POTION(", "").replace(")", ""));
		    			 short poo = 0;
		    			 if(potions.get(0).toString().endsWith("1)")){
		    			 poo = 1;
		    			 }
		    			 potions.remove(0);
		    			 potions.remove(0);
		    			 potions.remove(0);
		    			 
		    			 a=0;
			    		 b.setData((byte) 0);
			    		 ItemStack pota = new ItemStack(Material.POTION, 1, (short) poo);
			    		 p.getWorld().dropItemNaturally(p.getLocation(), pota);
		    		 }
		    		 
	 	    	 }
	    }
	    
	}
	
	
}
