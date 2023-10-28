package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class CustomCraftingTable implements Listener {

    @EventHandler
    public void playerinteract(PlayerInteractEvent event){

        Player player = event.getPlayer();

        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 99999999999.0f, 1.0f);

        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);
        player.playSound(player.getLocation(), Sound.BLOCK_SCULK_SHRIEKER_SHRIEK, 99999999999.0f, 1.0f);



    }
}
