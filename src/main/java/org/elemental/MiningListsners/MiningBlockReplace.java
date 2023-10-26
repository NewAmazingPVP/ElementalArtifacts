package org.elemental.MiningListsners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.scheduler.BukkitRunnable;

import static org.elemental.ElementalArtifacts.elementalArtifacts;

public class MiningBlockReplace implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.STONE) {
            event.setCancelled(true); // cancel the event to prevent the block from being broken
            new BukkitRunnable() {
                @Override
                public void run() {
                    block.setType(Material.STONE); // regenerate the block
                }
            }.runTaskLater(elementalArtifacts, 200); // run the task after 100 seconds
        }
    }
}

