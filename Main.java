package com.craftilandia.potionmixer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void clickpotion(PlayerInteractEvent e){
	    Player p = e.getPlayer();
	    if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
	    	 Block b = e.getClickedBlock();
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.GLASS_BOTTLE))) {
	 	    	p.sendMessage("work");
	 	    	//p.getItemInHand().setType(Material.POTION);
	 	    	//b.setData((byte) 1);// la data 0 es vacio 1 es con 1 botella 2 es 2 y 3 es lleno
		    		 b.setData((byte) 0);
	 	    	 }
	    	 if((b.getType().equals(Material.CAULDRON)) && (p.getItemInHand().getType().equals(Material.POTION))) {
	    		 p.sendMessage(p.getItemInHand().getData().toString());
	    		 int a = b.getData();
		    		 a++;
		    		 p.getItemInHand().setType(Material.POTION);
		    		 b.setData((byte) a);	
		    		 
	    		
	 	    	 }
	    }
	    
	}
	
	
}
