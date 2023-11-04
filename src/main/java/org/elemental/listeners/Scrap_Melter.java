package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import static org.elemental.variables.PremadeItems.starDust;

public class Scrap_Melter implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block block = event.getClickedBlock();
            if (block.getType() == Material.BLAST_FURNACE) {
                event.setCancelled(true);
                ItemStack itemInHand = player.getInventory().getItemInMainHand();
                if (itemInHand != null && itemInHand.getType() == Material.RAW_COPPER && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Low Level Scrap")) {

                    if (itemInHand.getAmount() > 1) {
                        itemInHand.setAmount(itemInHand.getAmount() - 1);
                        player.getInventory().setItemInMainHand(itemInHand);
                    } else {
                        player.getInventory().setItemInMainHand(null);

                        ItemStack testiron = new ItemStack(Material.COPPER_INGOT);

                        player.getInventory().addItem(testiron);

                    }
                }
            }
        }
    }
}

