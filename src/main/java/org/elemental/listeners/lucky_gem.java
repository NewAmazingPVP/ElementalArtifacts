package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import static org.bukkit.Bukkit.getServer;

public class lucky_gem implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        /*getServer().getPluginManager().registerEvents((Listener) this, (Plugin) this);*/
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        // Check if the player right-clicked
        if (event.getAction().name().contains("RIGHT_CLICK")) {
            // Check if the item has the desired name
            if (item.getType() == Material.EMERALD && item.hasItemMeta() &&
                    item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Lucky Gem" + ChatColor.DARK_AQUA + " [Item]")) {

                // Randomly give rewards based on chances
                double random = Math.random();
                if (random <= 0.05) {
                    // Give full diamond armor
                    player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                    player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                    player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                    player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
                    /*String titleText = ChatColor.AQUA + "" + ChatColor.BOLD + "+ Diamond Set";
                    int fadeIn = 10;
                    int stay = 40;
                    int fadeOut = 10;*/

                } else if (random <= 0.15) {
                    // Give a diamond block
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    /*String titleText = ChatColor.AQUA + "" + ChatColor.BOLD + "+ Diamond Block";
                    int fadeIn = 10;
                    int stay = 40;
                    int fadeOut = 10;*/
                } else if (random <= 0.25) {
                    // Give a god potion
                    player.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    /*String titleText = ChatColor.GOLD + "" + ChatColor.BOLD + "+ God Apple";
                    int fadeIn = 10;
                    int stay = 40;
                    int fadeOut = 10;*/
                } else {
                    // Give leather armor
                    player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
                    player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                    player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                    player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
                    player.playSound(player.getLocation(), Sound.ENTITY_CAT_AMBIENT, 1.0f, 0.0f);
                    /*String titleText = ChatColor.DARK_RED + "" + ChatColor.BOLD + "+ Binding Armor";
                    String subtitleText = ChatColor.DARK_RED + "L              =D";
                    int fadeIn = 10;
                    int stay = 40;
                    int fadeOut = 10;*/
                }
            }
        }
    }
}