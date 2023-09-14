package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class doubleedged_sword implements Listener {


    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            ItemStack item = player.getInventory().getItemInMainHand();
            if (item.getType() == Material.DIAMOND_SWORD && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
                    && item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Double-Edged Sword" + ChatColor.DARK_AQUA + " [Sword]")) {
                player.playSound(player.getLocation(), "minecraft:block.glass.break", 1.0f, 2.0f);
                event.setDamage(7);
            }
        }
    }
}