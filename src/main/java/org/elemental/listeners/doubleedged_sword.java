package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class doubleedged_sword implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Double-Edged Sword" + ChatColor.DARK_AQUA + " [Sword]")) {
                // Check if the entity hit is an instance of an entity
                if (event.getEntity() instanceof Entity) {
                    // Apply 5 damage to the hit entity
                    event.setCancelled(true);
                    player.playSound(player.getLocation(), "minecraft:block.glass.break", 1.0f, 1.0f);
                    player.damage(5);
                }
            }
        }
    }
}