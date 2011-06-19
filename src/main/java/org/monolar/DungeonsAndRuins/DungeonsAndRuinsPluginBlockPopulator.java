package org.monolar.DungeonsAndRuins;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.util.BlockVector;

public class DungeonsAndRuinsPluginBlockPopulator extends BlockPopulator {

    @Override
    public void populate(World world, Random random, Chunk source) {
        System.out.println("Mono populating chunk at " + source.getX() + " " + source.getZ());
        BlockVector brickVector = new BlockVector(
                source.getX(),
                0,
                source.getZ());
        brickVector.multiply(16); // yeah << 4 would work on every component as well. meh.
        brickVector.setY(world.getHighestBlockYAt((int)brickVector.getX(), (int)brickVector.getZ()));

        System.out.println(" ... " + brickVector.toString());
        
        world.getBlockAt(brickVector.toLocation(world)).setType(Material.BRICK);
    }

}
