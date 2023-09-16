package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
            if (player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Warp Sword" + ChatColor.DARK_AQUA + " [Item]")) {
                if(cooldowns.containsKey(player.getUniqueId())) {
                    if(cooldowns.get(player.getUniqueId()) > System.currentTimeMillis()){
                        long remainingTime = (cooldowns.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000;
                        player.sendMessage("You cannot use this for " + remainingTime + " more seconds.");
                        return;
                    }
                }
                cooldowns.put(player.getUniqueId(), System.currentTimeMillis() + (30 * 1000));

                Vector direction = player.getLocation().getDirection().multiply(5);
                player.teleport(player.getLocation().add(direction));
            }
        }
    }
}