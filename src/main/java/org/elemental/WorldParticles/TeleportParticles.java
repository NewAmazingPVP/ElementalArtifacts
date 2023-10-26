package org.elemental.WorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import static org.elemental.ElementalArtifacts.elementalArtifacts;


public class TeleportParticles {
    private static final double SPEED = 0.1;
    private static double y = 0;
    private static double x = 0;
    private static double z = 0;

    public static void test(){
        new BukkitRunnable() {
            @Override
            public void run() {
                Location location = new Location(Bukkit.getWorld("world"), 265.0, 105.0, -28.0);
                location.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, location, 1, 0, 0, 0, 0);

                y += SPEED;
                x += SPEED;
                z += SPEED;
            }
        }.runTaskTimer(elementalArtifacts, 0, 20);
    }
}







/*public class TeleportParticles {
    public static void test(){
        new BukkitRunnable() {
            @Override
            public void run() {
                Location location = new Location(Bukkit.getWorld("world"), 265.0, 105.0, -28.0);
                Bukkit.getWorld("world").spawnParticle(Particle.CLOUD, location, 10);





            }
        }.runTaskTimer(elementalArtifacts, 0, 20);
    }

}*/
