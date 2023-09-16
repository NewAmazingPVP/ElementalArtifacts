package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.UUID;

public class WarpSword implements Listener {

    private HashMap<UUID, Long> cooldowns = new HashMap<UUID, Long>();

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().toString().contains("RIGHT") && player.getItemInHand().getType() != Material.AIR) {
            if (player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Warp Sword" + ChatColor.DARK_AQUA + " [Sword]")) {
                if(cooldowns.containsKey(player.getUniqueId())) {
                    if(cooldowns.get(player.getUniqueId()) > System.currentTimeMillis()){
                        long remainingTime = (cooldowns.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000;
                        player.sendMessage(ChatColor.RED + "You cannot use this for " + remainingTime + " more seconds.");
                        player.playSound(player.getLocation(), "minecraft:entity.enderman.teleport", 1.0f, 0.0f);
                        return;
                    }
                }
                cooldowns.put(player.getUniqueId(), System.currentTimeMillis() + (30 * 1000));

                Vector direction = player.getLocation().getDirection().multiply(5);
                player.playSound(player.getLocation(), "minecraft:entity.enderman.teleport", 1.0f, 1.0f);
                player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.BLACK, 3));
                player.teleport(player.getLocation().add(direction));
            }
        }
    }
}