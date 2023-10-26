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
            if (block.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK) {
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        block.setType(Material.DEAD_BUBBLE_CORAL_BLOCK);
                    }
                }.runTaskLater(elementalArtifacts, 200); // 20 ticks = 1 second
            }
        }
    }

