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

public class Guide_Listener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 36, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Crafting Recipes");

                ItemStack G1 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack weapons = new ItemStack(Material.STICK);
                ItemMeta WM = weapons.getItemMeta();
                WM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Weapons");
                WM.addEnchant(Enchantment.DURABILITY, 1, false);
                WM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                weapons.setItemMeta(WM);

                ItemStack mat = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta MM = mat.getItemMeta();
                MM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Materials");
                mat.setItemMeta(MM);

                ItemStack mis = new ItemStack(Material.CLOCK);
                ItemMeta MI = mis.getItemMeta();
                MI.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Miscellaneous");
                mis.setItemMeta(MI);

                ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta AMI = armor.getItemMeta();
                AMI.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Armor");
                armor.setItemMeta(AMI);

                ItemStack back = new ItemStack(Material.ARROW);
                ItemMeta BM = back.getItemMeta();
                BM.setDisplayName(ChatColor.RED + "Back");
                back.setItemMeta(BM);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Close");
                close.setItemMeta(CM);


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
                Guide.setItem(10, weapons);
                Guide.setItem(11, G1);
                Guide.setItem(12, mat);
                Guide.setItem(13, G1);
                Guide.setItem(14, armor);
                Guide.setItem(15, G1);
                Guide.setItem(16, mis);
                Guide.setItem(17, G1);
                Guide.setItem(18, G1);
                Guide.setItem(19, G1);
                Guide.setItem(20, G1);
                Guide.setItem(21, G1);
                Guide.setItem(22, G1);
                Guide.setItem(23, G1);
                Guide.setItem(24, G1);
                Guide.setItem(25, G1);
                Guide.setItem(26, G1);
                Guide.setItem(27, back);
                Guide.setItem(28, G1);
                Guide.setItem(29, G1);
                Guide.setItem(30, G1);
                Guide.setItem(31, G1);
                Guide.setItem(32, G1);
                Guide.setItem(33, G1);
                Guide.setItem(34, G1);
                Guide.setItem(35, close);


                player.openInventory(Guide);

            }

            if (event.getCurrentItem().getType() == Material.END_CRYSTAL) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.AQUA + "" + ChatColor.BOLD + "Class");

                ItemStack G2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
                ItemMeta M2 = G2.getItemMeta();
                M2.setDisplayName(" ");
                G2.setItemMeta(M2);

                ItemStack Mage = new ItemStack(Material.AMETHYST_CLUSTER);
                ItemMeta MageM = Mage.getItemMeta();
                MageM.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mage");
                Mage.setItemMeta(MageM);

                ItemStack Swordsman = new ItemStack(Material.GOLDEN_SWORD);
                ItemMeta SwordsmanM = Swordsman.getItemMeta();
                SwordsmanM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Swordsman");
                Swordsman.setItemMeta(SwordsmanM);

                ItemStack Armorer = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemMeta ArmorerM = Armorer.getItemMeta();
                ArmorerM.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Armorer");
                Armorer.setItemMeta(ArmorerM);

                ItemStack Archer = new ItemStack(Material.BOW);
                ItemMeta ArcherM = Archer.getItemMeta();
                ArcherM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Archer");
                Archer.setItemMeta(ArcherM);

                Guide.setItem(0, G2);
                Guide.setItem(1, G2);
                Guide.setItem(2, G2);
                Guide.setItem(3, G2);
                Guide.setItem(4, G2);
                Guide.setItem(5, G2);
                Guide.setItem(6, G2);
                Guide.setItem(7, G2);
                Guide.setItem(8, G2);
                Guide.setItem(9, G2);
                Guide.setItem(10, Mage);
                Guide.setItem(11, G2);
                Guide.setItem(12, Swordsman);
                Guide.setItem(13, G2);
                Guide.setItem(14, Armorer);
                Guide.setItem(15, G2);
                Guide.setItem(16, Archer);
                Guide.setItem(17, G2);
                Guide.setItem(18, G2);
                Guide.setItem(19, G2);
                Guide.setItem(20, G2);
                Guide.setItem(21, G2);
                Guide.setItem(22, G2);
                Guide.setItem(23, G2);
                Guide.setItem(24, G2);
                Guide.setItem(25, G2);
                Guide.setItem(26, G2);



                player.openInventory(Guide);


            }
            if (event.getCurrentItem().getType() == Material.BEACON) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Skill Points");

                player.openInventory(Guide);


            }
            if (event.getCurrentItem().getType() == Material.PAPER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.BLUE + "" + ChatColor.BOLD + "Info");

                ItemStack Credits = new ItemStack(Material.DIAMOND);
                ItemMeta CreditsM = Credits.getItemMeta();
                CreditsM.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Credits");
                CreditsM.addEnchant(Enchantment.DURABILITY, 1, false);
                CreditsM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                List<String> lore = new ArrayList<>();
                lore.add(ChatColor.DARK_PURPLE + "" + ChatColor.STRIKETHROUGH + "" + ChatColor.BOLD + "=========================");
                lore.add(" ");
                lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Comet99" + ChatColor.AQUA + "[Developer]   [Game Design]");
                lore.add(" ");
                lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "NewAmazingPVP" + ChatColor.AQUA + "[Developer]   [Game Design]");
                lore.add(" ");
                lore.add(ChatColor.DARK_PURPLE + "" + ChatColor.STRIKETHROUGH + "" + ChatColor.BOLD + "=========================");
                CreditsM.setLore(lore);
                Credits.setItemMeta(CreditsM);

                Guide.setItem(1, Credits);


                player.openInventory(Guide);

            }
            event.setCancelled(true);
        }
    }
}