package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class Montu_Staff_Left implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();

        // Check if the player is not crouching
        if(!player.isSneaking()) {
            // Check if the player is left-clicking
            if(event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
                // Check if the player is holding an item named "11111111111111"
                if(itemInHand != null && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName()) {
                    String name = itemInHand.getItemMeta().getDisplayName();
                    if(name.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                        // Send a message to the player with the name of the item
                        player.sendMessage("Left");
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        double x = player.getLocation().getX();
                        double y = player.getLocation().getY();
                        double z = player.getLocation().getZ();
                        double dx = player.getLocation().getDirection().getX();
                        double dy = player.getLocation().getDirection().getY();
                        double dz = player.getLocation().getDirection().getZ();

                        for (int i = 0; i < 7; i++) {
                            player.spawnParticle(Particle.REDSTONE, x + dx * i, y + dy * i, z + dz * i, 0, 0, 0, 0, new Particle.DustOptions(Color.PURPLE, 1.0f));
                        }

                    }
                }
            }
        }
    }
}

