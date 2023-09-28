package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Stick_Of_Power implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // Check if the player is sneaking (crouching)
        if (event.getPlayer().isSneaking()) {
            return;
        }

        // Check if the player is right-clicking
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            // Get the item in the player's hand
            ItemStack item = event.getItem();

            // Check if the item is a stick and is named "1111111111111111"
            if (item != null && item.getType() == Material.STICK && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                // Send a message to the player
                event.getPlayer().sendMessage("Right");
            }
        }

        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInHand();

        if (item != null && item.getType() == Material.STICK && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
            if (player.isSneaking()) {
                player.sendMessage("Shift Right");
            }
        }
    }
}



