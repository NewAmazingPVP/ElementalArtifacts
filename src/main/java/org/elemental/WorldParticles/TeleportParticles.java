package org.elemental.WorldParticles;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.Collection;

import static org.elemental.ElementalArtifacts.elementalArtifacts;


public class TeleportParticles {



    public static void test(){
        new BukkitRunnable() {
            @Override
            public void run() {
                Location location1 = new Location(Bukkit.getWorld("world"), 265.0, 105.5, -28.0);
                Location location2 = new Location(Bukkit.getWorld("world"), 265.0, 105.5, -29.0);
                Location location3 = new Location(Bukkit.getWorld("world"), 266.0, 105.5, -28.0);
                Location location4 = new Location(Bukkit.getWorld("world"), 266.0, 105.5, -29.0);
                Bukkit.getWorld("world").spawnParticle(Particle.COMPOSTER, location1, 10);
                Bukkit.getWorld("world").spawnParticle(Particle.COMPOSTER, location2, 10);
                Bukkit.getWorld("world").spawnParticle(Particle.COMPOSTER, location3, 10);
                Bukkit.getWorld("world").spawnParticle(Particle.COMPOSTER, location4, 10);






                Location alter1 = new Location(Bukkit.getWorld("world"), 329.5, 105.5, -45.5);
                Bukkit.getWorld("world").spawnParticle(Particle.CLOUD, alter1, 10);

            }
        }.runTaskTimer(elementalArtifacts, 0, 1);
    }
}

