package org.monolar.DungeonsAndRuins;
//import org.bukkit.block.Block;
//import org.bukkit.block.BlockFace;
//import org.bukkit.Material;
//import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
//import org.bukkit.event.block.BlockPhysicsEvent;

public class DungeonsAndRuinsPluginBlockListener extends BlockListener {
	@SuppressWarnings("unused")
	private final DungeonsAndRuinsPlugin dungeonsAndRuinsPlugin;

    public DungeonsAndRuinsPluginBlockListener(final DungeonsAndRuinsPlugin dungeonsAndRuinsPlugin) {
        this.dungeonsAndRuinsPlugin = dungeonsAndRuinsPlugin;
    }
    
    
    @Override
    public void onBlockBreak(BlockBreakEvent event) {
    	System.out.println("onBlockBreak");
    	
    	Block block = event.getBlock();
    	Player player = event.getPlayer();
    	
    	if (player != null) {
    		Biome biome = block.getBiome();
        	player.sendMessage("Biome: " + biome.toString());
    	}
    }
    
}
