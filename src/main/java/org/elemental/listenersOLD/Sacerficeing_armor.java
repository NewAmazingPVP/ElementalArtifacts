package org.elemental.listenersOLD;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Sacerficeing_armor implements Listener {

    @EventHandler
    public void onItemHeld(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        ItemStack heldItem = player.getInventory().getItem(event.getNewSlot());

        if (heldItem != null) {
            Material itemType = heldItem.getType();

            if (itemType == Material.LEATHER_CHESTPLATE || itemType == Material.LEATHER_LEGGINGS || itemType == Material.LEATHER_BOOTS) {
                if (heldItem.hasItemMeta() && heldItem.getItemMeta().hasDisplayName()) {
                    String displayName = heldItem.getItemMeta().getDisplayName();

                    if (displayName.equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Chestplate" + ChatColor.DARK_AQUA + " [Armor]") || displayName.equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Leggings" + ChatColor.DARK_AQUA + " [Armor]") || displayName.equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Boots" + ChatColor.DARK_AQUA + " [Armor]")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2, 2));
                    }
                }
            }
        }
    }
}