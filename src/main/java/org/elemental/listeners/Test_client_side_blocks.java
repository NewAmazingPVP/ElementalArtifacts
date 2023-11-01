package org.elemental.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.UUID;

public class Test_client_side_blocks implements Listener {

    private Player lastPlayer = null;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.hasBlock() && event.getClickedBlock().getType() == Material.DEEPSLATE) {
            lastPlayer = event.getPlayer();
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlock().getType() == Material.DIAMOND_BLOCK) {
            if (event.getPlayer() != lastPlayer) {
                event.setCancelled(true);
            }
        }
    }
}