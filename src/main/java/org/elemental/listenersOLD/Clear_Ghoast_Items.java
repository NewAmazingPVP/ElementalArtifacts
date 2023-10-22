package org.elemental.listenersOLD;

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
            ItemStack clickedItem = event.getCurrentItem();

            // Check if the clicked item is a ghost item (null or air)
            if (clickedItem == null || clickedItem.getType() == Material.AIR) {
                // Clear the clicked slot
                event.setCurrentItem(null);
            }
        }
    }
}
