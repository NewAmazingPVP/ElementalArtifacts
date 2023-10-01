package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Montu_Staff_Shift_Right implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().isRightClick()) {
            Player player = event.getPlayer();
            if (player.isSneaking()) {
                ItemStack itemInHand = player.getInventory().getItemInMainHand();
                if (itemInHand != null && itemInHand.getType() == Material.STICK && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
                    Player p = event.getPlayer();
                    Location loc = p.getLocation();
                    for (double angle = 0; angle < 2 * Math.PI; angle += Math.PI / 16) {
                        double x = loc.getX() + Math.cos(angle) * 2;
                        double z = loc.getZ() + Math.sin(angle) * 2;
                        Location blockLoc = new Location(p.getWorld(), x, loc.getY(), z);
                        FallingBlock fallingBlock = p.getWorld().spawnFallingBlock(blockLoc, Material.MAGMA_BLOCK, (byte) 0);
                    }
                }
            }
        }
    }
}

