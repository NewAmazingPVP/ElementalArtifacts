package org.elemental.WorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TeleportParticles{

    private class MessageSenderTask extends BukkitRunnable {
        @Override
        public void run() {
            // Get all online players
            for (Player player : Bukkit.getOnlinePlayers()) {
                // Send a message to each player
                player.sendMessage("Hello, players!");
            }
        }
    }

}
