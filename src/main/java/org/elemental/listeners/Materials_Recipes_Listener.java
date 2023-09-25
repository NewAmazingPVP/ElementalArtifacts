package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Materials_Recipes_Listener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Materials Recipes")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.ENDER_EYE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.CYAN_STAINED_GLASS_PANE);
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
                Guide.setItem(10, G1);
                Guide.setItem(14, G1);
                Guide.setItem(15, G1);
                Guide.setItem(16, G1);
                Guide.setItem(17, G1);
                Guide.setItem(18, G1);
                Guide.setItem(19, G1);
                Guide.setItem(23, G1);
                Guide.setItem(25, G1);
                Guide.setItem(26, G1);
                Guide.setItem(27, G1);
                Guide.setItem(28, G1);
                Guide.setItem(32, G1);
                Guide.setItem(33, G1);
                Guide.setItem(34, G1);
                Guide.setItem(35, G1);
                Guide.setItem(36, G1);
                Guide.setItem(37, G1);
                Guide.setItem(38, G1);
                Guide.setItem(39, G1);
                Guide.setItem(40, G1);
                Guide.setItem(41, G1);
                Guide.setItem(42, G1);
                Guide.setItem(43, G1);
                Guide.setItem(44, G1);


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.NETHERITE_INGOT) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);

            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.NETHERITE_BLOCK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.ENDER_PEARL) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.BONE_MEAL) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Corrupted Handle" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.STICK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Infused Lapis" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.LAPIS_LAZULI) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");


                player.openInventory(Guide);
            }
            event.setCancelled(true);
        }
    }
}
