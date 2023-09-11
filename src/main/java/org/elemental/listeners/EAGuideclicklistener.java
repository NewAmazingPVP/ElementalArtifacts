package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class EAGuideclicklistener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        //this is for the team select menu thing good luck de bugging xD
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide")) {


            if (event.getCurrentItem() == null) {
                return;
            }
        }
    }
}