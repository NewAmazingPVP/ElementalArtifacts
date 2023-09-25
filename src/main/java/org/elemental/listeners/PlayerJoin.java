package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
        player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "--------------------------------------------");
        player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Use /eaguide to get the guide!");
        player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Use /bookofitems to get the book of items!");
        player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "--------------------------------------------");
    }
}