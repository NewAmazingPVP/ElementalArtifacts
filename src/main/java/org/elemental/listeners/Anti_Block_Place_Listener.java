package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Anti_Block_Place_Listener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemStack item = event.getItemInHand();
        ItemMeta meta = item.getItemMeta();

        if (meta != null && meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block" + ChatColor.DARK_AQUA + " [Item]")) {
            event.setCancelled(true);
        }
    }
}