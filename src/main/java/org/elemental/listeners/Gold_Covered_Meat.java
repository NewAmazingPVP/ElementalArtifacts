package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Gold_Covered_Meat implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (item.getType() == Material.COOKED_MUTTON && item.hasItemMeta() && item.getItemMeta().hasDisplayName()
                    && item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Covered Meat" + ChatColor.DARK_AQUA + " [Food]")) {
                player.sendMessage("testmain");
                if (item.getAmount() > 1) {
                    item.setAmount(item.getAmount() - 1);
                    player.getInventory().setItemInMainHand(item);
                } else {
                    player.getInventory().setItemInMainHand(null);
                }
            }
        }
                ItemStack mainHandItem = player.getInventory().getItemInMainHand();
                ItemStack offHandItem = player.getInventory().getItemInOffHand();

                if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    if (offHandItem.getType() == Material.COOKED_MUTTON && offHandItem.hasItemMeta() && offHandItem.getItemMeta().hasDisplayName()
                            && offHandItem.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Covered Meat" + ChatColor.DARK_AQUA + " [Food]")) {
                        player.sendMessage("testoff");
                        if (offHandItem.getAmount() > 1) {
                            offHandItem.setAmount(offHandItem.getAmount() - 1);
                            player.getInventory().setItemInOffHand(offHandItem);
                        } else {
                            player.getInventory().setItemInOffHand(null);
                        }
                    }
                }
            }
        }




