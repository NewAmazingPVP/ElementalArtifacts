package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ALL_RECIPIE_GUIDE_LISTENER implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe")) {


            if (event.getCurrentItem() == null) {
                return;
            }


            event.setCancelled(true);
        }
    }
}


