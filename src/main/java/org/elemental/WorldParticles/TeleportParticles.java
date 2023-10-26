package org.elemental.WorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import static org.elemental.ElementalArtifacts.elementalArtifacts;

public class TeleportParticles {
    public static void test(){
        new BukkitRunnable() {
            @Override
            public void run() {
                elementalArtifacts.getServer().broadcastMessage("Alr so this works ig every 20 ticks or every second ");
            }
        }.runTaskTimer(elementalArtifacts, 0, 20);
    }

}
