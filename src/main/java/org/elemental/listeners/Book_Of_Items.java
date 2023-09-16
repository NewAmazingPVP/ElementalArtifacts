package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Book_Of_Items implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = event.getItem();
            if (item != null && item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                if (meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Book Of Items")) {
                    Player p = event.getPlayer();
                    player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                    player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.ORANGE, 3));
                    Inventory Guide = Bukkit.createInventory(p, 54, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Item Menu");


                    ItemStack G1 = new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE);
                    ItemMeta M1 = G1.getItemMeta();
                    M1.setDisplayName(" ");
                    G1.setItemMeta(M1);



                    Guide.setItem(0, G1);
                    Guide.setItem(1, G1);
                    Guide.setItem(2, G1);
                    Guide.setItem(3, G1);
                    Guide.setItem(4, G1);
                    Guide.setItem(5, G1);
                    Guide.setItem(6, G1);
                    Guide.setItem(7, G1);
                    Guide.setItem(8, G1);
                    Guide.setItem(9, G1);
                    Guide.setItem(18, G1);
                    Guide.setItem(27, G1);
                    Guide.setItem(36, G1);
                    Guide.setItem(17, G1);
                    Guide.setItem(26, G1);
                    Guide.setItem(0, G1);
                    Guide.setItem(35, G1);
                    Guide.setItem(45, G1);
                    Guide.setItem(46, G1);
                    Guide.setItem(47, G1);
                    Guide.setItem(48, G1);
                    Guide.setItem(49, G1);
                    Guide.setItem(50, G1);
                    Guide.setItem(51, G1);
                    Guide.setItem(52, G1);
                    Guide.setItem(53, G1);


                    p.openInventory(Guide);
                }
            }
        }
    }
}