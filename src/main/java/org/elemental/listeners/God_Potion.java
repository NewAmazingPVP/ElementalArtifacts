package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class God_Potion implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        // Check if the player is holding an item named "1111111111111111"
        if (item != null && item.getType() == Material.PLAYER_HEAD && item.getItemMeta().hasDisplayName()
                && item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "God Potion" + ChatColor.DARK_AQUA + " [Potion]")) {

            // Clear the item from the player's hand
            player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

            // Apply speed 2 and strength 2 potion effects for 10 minutes
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 60 * 10, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 60 * 10, 1));
            player.playSound(player.getLocation(), "minecraft:entity.elder_guardian.curse", 1.0f, 0.0f);
        }
    }
}
