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
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (item != null && item.getType() == Material.STICK && item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                Location playerLocation = player.getLocation();
                World world = player.getWorld();
                player.sendMessage("test");
                // Spawn falling blocks in a wave around the player
                for (int i = 0; i < 10; i++) {
                    double x = playerLocation.getX() + Math.cos(i) * 2;
                    double y = playerLocation.getY() + 2;
                    double z = playerLocation.getZ() + Math.sin(i) * 2;

                    FallingBlock fallingBlock = world.spawnFallingBlock(new Location(world, x, y, z), Material.MAGMA_BLOCK.createBlockData());
                    fallingBlock.setDropItem(false);
                }
            }
        }
    }
}