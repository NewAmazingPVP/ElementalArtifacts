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
        if (event.getAction().name().contains("RIGHT_CLICK") && !event.getPlayer().isSneaking()) {
            ItemStack item = event.getItem();
            if (item != null && item.getType() == Material.NAME_TAG && item.hasItemMeta() && item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                event.getPlayer().sendMessage("Right Click");
            }
        }
    }
}