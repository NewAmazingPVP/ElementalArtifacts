package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomEnchantTable implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK){
            Block block = event.getClickedBlock();
            if(block.getType() == Material.ENCHANTING_TABLE){
                event.setCancelled(true);
                player.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 2.0f, 2.0f);
                Inventory alter = Bukkit.createInventory(player, 63, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Ability Altar");

                ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                player.openInventory(alter);
            }
        }
    }
}


