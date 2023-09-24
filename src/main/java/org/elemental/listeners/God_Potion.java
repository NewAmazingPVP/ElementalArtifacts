package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.elemental.ElementalArtifacts;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import org.bukkit.scheduler.BukkitRunnable;


public class God_Potion implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        // Check if the player is holding an item named "fuck_me"
        if (item != null && item.getType() == Material.HONEY_BOTTLE && item.getItemMeta().hasDisplayName()
                && item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "God Potion" + ChatColor.DARK_AQUA + " [Potion]")) {
            event.setCancelled(true);
            // Clear the item from the player's hand
            player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

            // Apply speed 2 and strength 2 potion effects for 10 minutes
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 60 * 10, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 60 * 10, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 60 * 10, 2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 60 * 10, 5));
            player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 20 * 60 * 10, 1));


            player.playSound(player.getLocation(), "minecraft:entity.wither.spawn", 1.0f, 1.0f);
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.RED, 3));
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.ORANGE, 3));
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.YELLOW, 3));
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.GREEN, 3));
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.BLUE, 3));
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.PURPLE, 3));
            player.getWorld().strikeLightningEffect(event.getPlayer().getLocation());

        }
    }
}
