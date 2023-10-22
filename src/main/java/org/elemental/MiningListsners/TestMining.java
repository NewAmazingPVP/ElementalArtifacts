package org.elemental.MiningListsners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.net.http.WebSocket;

public class TestMining implements Listener {

    @EventHandler
    public void onPlayerMine(BlockBreakEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = event.getPlayer().getInventory().getItemInMainHand();
        if (itemInHand.getType() == Material.IRON_PICKAXE) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0f, 2.0f);
            ItemStack diamondtest = new ItemStack(Material.RAW_IRON);
            player.getInventory().addItem(diamondtest);
        }
        if (itemInHand.getType() == Material.DIAMOND_PICKAXE) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0f, 2.0f);
            ItemStack diamondtest = new ItemStack(Material.DIAMOND);
            player.getInventory().addItem(diamondtest);
        }
        if (itemInHand.getType() == Material.STICK) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0f, 2.0f);
            ItemStack diamondtest = new ItemStack(Material.DIRT);
            player.getInventory().addItem(diamondtest);
        }
    }
}