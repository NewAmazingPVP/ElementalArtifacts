package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.net.http.WebSocket;

public class Montu_Staff_OtherItemCode implements Listener {
    @EventHandler
    public void onBlockPlace(PlayerInteractEvent event) {
        if (event.getAction().name().contains("LEFT_CLICK") && event.getItem() != null) {
            ItemStack item = event.getItem();
            ItemMeta meta = item.getItemMeta();

            if (meta != null && meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                event.setCancelled(true);
            }
        }
    }
}

