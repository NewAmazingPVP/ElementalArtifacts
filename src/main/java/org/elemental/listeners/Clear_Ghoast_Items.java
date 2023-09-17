package org.elemental.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Clear_Ghoast_Items implements Listener {


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        Inventory inventory = event.getInventory();

        // Check if the clicked inventory is the player's inventory
        if (inventory.getType() == InventoryType.PLAYER) {
            ItemStack[] contents = inventory.getContents();

            // Iterate through the inventory and remove ghost items
            for (int i = 0; i < contents.length; i++) {
                ItemStack item = contents[i];

                // Check if the item is a ghost item
                if (item == null || item.getType() == Material.AIR) {
                    inventory.setItem(i, null);
                }
            }

            player.updateInventory();
        }
    }
}
