package org.elemental.MiningListsners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.elemental.variables.PremadeItems.*;

public class Star_Dust_Mine implements Listener {

    @EventHandler
    public void onPlayerMine(BlockBreakEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand != null && itemInHand.getType() == Material.ARROW && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Star Dust Chisel" + ChatColor.LIGHT_PURPLE + " T1")) {
            if (event.getBlock().getType() == Material.DEAD_BUBBLE_CORAL_BLOCK) {
                player.playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 2.0f, 1.0f);
                player.stopSound(Sound.BLOCK_STONE_BREAK);
                event.getBlock().getWorld().spawnParticle(Particle.CLOUD, event.getBlock().getLocation(), 10);
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 5));
                if (Math.random() < 1.0) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    player.getInventory().addItem(starDust());

                }

                if (Math.random() < 0.10) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    player.getInventory().addItem(starDust());
                }
            }
            if (event.getBlock().getType() != Material.DEAD_BUBBLE_CORAL_BLOCK) {
                event.setCancelled(true);
            }
        }
    }
}
