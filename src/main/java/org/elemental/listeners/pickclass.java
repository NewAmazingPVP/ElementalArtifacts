package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.player.PlayerInteractEvent;

/*public class pickclass {
    @EventHandler
    public void onPlayerInteract(InventoryOpenEvent event) {
        Player player = (Player) event.getPlayer();
        public void onPlayerInteract(PlayerInteractEvent event) {
            if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Player playerD = (Player) event.getPlayer();
                ItemStack heldItem = player.getInventory().getItemInMainHand();
                Player p = (Player) event.getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.note_block.bit", 1.0f, 2.0f);
                Inventory teamselect = Bukkit.createInventory(p, 27, ChatColor.DARK_AQUA + "[Select Team]");


                if (heldItem.getType() == Material.RECOVERY_COMPASS) {
    }
}/*

 */