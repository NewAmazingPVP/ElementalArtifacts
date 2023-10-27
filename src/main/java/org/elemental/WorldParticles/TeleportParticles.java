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
            int t = 0;
            double x = 0, y = 0, z = 0;
            double radius = 1.0;
            double height = 0.0;
            double dHeight = 0.1;
            double dRadius = 0.05;
            double angle = 0.0;
            double dAngle = 0.1;
            int particleCount = 100;

            @Override
            public void run() {
                if (t >= particleCount) {
                    cancel();
                    return;
                }

                double newX = x + radius * Math.cos(angle);
                double newY = y + height;
                double newZ = z + radius * Math.sin(angle);

                Location location = new Location(Bukkit.getWorld("world"), 265.0, 105.0, -28.0);;
                location.getWorld().spawnParticle(Particle.SPELL_WITCH, location, 1);

                angle += dAngle;
                height += dHeight;
                radius -= dRadius;
                t++;
            }
        }.runTaskTimer(elementalArtifacts, 0, 20);
    }
}}







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
