package org.elemental.WorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import static org.elemental.ElementalArtifacts.elementalArtifacts;

public class TeleportParticles {
    public static void test(){
        new BukkitRunnable() {
            @Override
            public void run() {
                Location location = new Location(Bukkit.getWorld("world"), 50.0, -20.0, -120.0);
                Bukkit.getWorld("world").spawnParticle(Particle.FLAME, location, 10);
            }
        }.runTaskTimer(elementalArtifacts, 0, 20);
    }

}
