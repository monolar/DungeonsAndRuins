package org.monolar.DungeonsAndRuins;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.WorldListener;

public class DungeonsAndRuinsPluginWorldListener extends WorldListener {
    @SuppressWarnings("unused")
    private final DungeonsAndRuinsPlugin plugin;
    private final DungeonsAndRuinsPluginBlockPopulator populator = new DungeonsAndRuinsPluginBlockPopulator();
    
    public DungeonsAndRuinsPluginWorldListener(final DungeonsAndRuinsPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public void onChunkPopulate(ChunkPopulateEvent event) {
        //System.out.println("onChunkPopulate...");
        final Chunk chunk = event.getChunk();
        final World world = event.getWorld();
        
        final Random random = new Random();
        random.setSeed(world.getSeed());
        long xRand = random.nextLong() / 2L * 2L + 1L;
        long zRand = random.nextLong() / 2L * 2L + 1L;
        random.setSeed((long) chunk.getX() * xRand + (long) chunk.getZ() * zRand ^ world.getSeed());
        
        populator.populate(world, random, chunk);
    }
}
