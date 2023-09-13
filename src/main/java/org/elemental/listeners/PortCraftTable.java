package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PortCraftTable implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().name().contains("RIGHT_CLICK")) {
            if (event.getItem() != null && event.getItem().getType() == Material.CRAFTING_TABLE
                    && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasDisplayName()
                    && event.getItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Portable Crafting Table" + ChatColor.DARK_AQUA + " [Item]")) {
                // Open crafting table menu for the player
                // Replace the code below with your own implementation
                event.getPlayer().openWorkbench(null, true);
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);

                event.setCancelled(true); // Prevent the player from placing the crafting table
            }
        }
    }
}