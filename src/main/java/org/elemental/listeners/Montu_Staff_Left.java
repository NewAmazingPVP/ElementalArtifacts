package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


public class Montu_Staff_Left implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();

        // Check if the player is not crouching
        if (!player.isSneaking()) {
            // Check if the player is left-clicking
            if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
                // Check if the player is holding an item named "11111111111111"
                if (itemInHand != null && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName()) {
                    String name = itemInHand.getItemMeta().getDisplayName();
                    if (name.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                        // Send a message to the player with the name of the item
                        player.sendMessage("Left");
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        Location location = player.getEyeLocation().add(0, 0.5, 0);
                        Vector direction = player.getLocation().getDirection();
                        for (int i = 0; i < 15; i++) {
                            location.add(direction);
                            player.getWorld().spawnParticle(Particle.REDSTONE, location, 0, new Particle.DustOptions(Color.PURPLE, 2.0F));
                        }
                    }
                }
            }
        }
    }
}





