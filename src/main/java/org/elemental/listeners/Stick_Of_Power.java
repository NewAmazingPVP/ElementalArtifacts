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
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK && event.getAction() != Action.RIGHT_CLICK_AIR) {
            return; // Ignore other click actions
        }

        ItemStack item = event.getItem();
        if (item == null || item.getType() != Material.AIR) {
            return; // Ignore if the player is not holding an item
        }

        if (!item.hasItemMeta() || !item.getItemMeta().hasDisplayName()) {
            return; // Ignore if the item doesn't have a display name
        }

        String displayName = item.getItemMeta().getDisplayName();
        if (!displayName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
            return; // Ignore if the display name is not "111111111111111111111111"
        }

        if (event.getPlayer().isSneaking()) {
            return; // Ignore if the player is shifting
        }

        // Perform action when conditions met
        event.getPlayer().sendMessage("Right Click");
    }
}