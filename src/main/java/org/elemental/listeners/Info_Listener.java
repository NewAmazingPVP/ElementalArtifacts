package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Info_Listener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Info")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.BARRIER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                player.closeInventory();

            }
            event.setCancelled(true);
        }

    }
}
