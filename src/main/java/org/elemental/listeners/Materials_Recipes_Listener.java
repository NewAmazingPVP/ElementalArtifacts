package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Materials_Recipes_Listener implements Listener {

    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Materials Recipes")) {


            if (event.getCurrentItem() == null) {
                return;
            }
            event.setCancelled(true);
        }
    }
}