package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Reaper_axe implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player killer = victim.getKiller();

        if (killer != null && killer.getItemInHand().getType() == Material.NETHERITE_AXE && killer.getItemInHand().hasItemMeta()) {
            if (killer.getItemInHand().getItemMeta().getDisplayName().equals("Beheading Axe")) {
                ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
                SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
                skullMeta.setOwningPlayer(victim);
                skull.setItemMeta(skullMeta);

                event.getDrops().add(skull);

            }
        }
        String deathMessage = victim.getName() + ChatColor.DARK_RED + "" + ChatColor.BOLD + " Was Beheaded!";
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(deathMessage);
        }
    }
}