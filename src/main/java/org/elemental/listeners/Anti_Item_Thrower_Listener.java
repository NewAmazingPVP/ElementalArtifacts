package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Anti_Item_Thrower_Listener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().name().contains("RIGHT_CLICK") && event.getItem() != null) {
            Material itemMaterial = event.getItem().getType();

            if (itemMaterial == Material.ENDER_PEARL || itemMaterial == Material.getMaterial(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]")) {
                event.setCancelled(true);
            }
            if (itemMaterial == Material.ENDER_EYE || itemMaterial == Material.getMaterial(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]")) {
                event.setCancelled(true);
            }
        }

    }

}