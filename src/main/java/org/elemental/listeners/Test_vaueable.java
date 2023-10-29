package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.net.http.WebSocket;

public class Test_vaueable implements Listener {

    int test;

    @EventHandler
    public void test(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block block = event.getClickedBlock();
            if (block.getType() == Material.CHEST) {

                test +=1;

                player.sendMessage(ChatColor.GOLD + "Test " + test);

            }
        }
    }
}
