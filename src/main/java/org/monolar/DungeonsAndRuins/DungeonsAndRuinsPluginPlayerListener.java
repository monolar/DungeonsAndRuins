package org.monolar.DungeonsAndRuins;

//import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerListener;
//import org.bukkit.event.player.PlayerMoveEvent;

public class DungeonsAndRuinsPluginPlayerListener extends PlayerListener {
	@SuppressWarnings("unused")
	private final DungeonsAndRuinsPlugin dungeonsAndRuinsPlugin;

    public DungeonsAndRuinsPluginPlayerListener(DungeonsAndRuinsPlugin instance) {
        dungeonsAndRuinsPlugin = instance;
    }
    
    /*@Override
    public void onPlayerMove(PlayerMoveEvent event) {
    	Block targettedBlock = event.getPlayer().getTargetBlock(null, 100);
    	event.getPlayer().sendMessage("targetted Block: " + targettedBlock.getType().toString());
    }*/
}
