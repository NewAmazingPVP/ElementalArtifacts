package org.elemental.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Montu_Staff_Shift_Left implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        // Check if the player is holding the item "1111111111111"
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        ItemMeta meta = itemInHand.getItemMeta();
        if (meta != null && meta.hasDisplayName() && meta.getDisplayName().equals("1111111111111")) {
            // Check if the player is crouching
            if (player.isSneaking()) {
                // Check if the player is left-clicking
                if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
                    // Send a message to the chat
                    player.sendMessage("Shift Left");
                }
            }
        }
    }
}

