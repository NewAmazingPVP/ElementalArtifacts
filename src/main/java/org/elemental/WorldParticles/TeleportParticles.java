package org.elemental.WorldParticles;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;

import static org.elemental.ElementalArtifacts.elementalArtifacts;


public class TeleportParticles {


    public static void test(){

        //get random info from server
        Collection<? extends Player> onlinePlayers = Bukkit.getOnlinePlayers();
        Location location = new Location(Bukkit.getWorld("world"), 265.0, 105.0, -28.0);
        //other variables
        int radius = 1;
        final double[] y = {0};

        new BukkitRunnable() {

            @Override
            public void run() {

                double x = radius * Math.cos(y[0]);
                double z = radius * Math.sin(y[0]);
                for (Player player : onlinePlayers) {

                    player.spawnParticle(Particle.REDSTONE, location.add(x, y[0], z), 50, new Particle.DustOptions(Color.LIME,1.0F));

                    y[0] = y[0] + 0.1;


                }
            }
        }.runTaskTimer(elementalArtifacts, 0, 10);
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
