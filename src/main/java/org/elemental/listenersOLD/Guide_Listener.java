package org.elemental.listenersOLD;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Crafting Recipes") && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 36, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Crafting Recipes");

                ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack Magic = new ItemStack(Material.STICK);
                ItemMeta WM = Magic.getItemMeta();
                WM.setDisplayName(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Magic");
                WM.addEnchant(Enchantment.DURABILITY, 1, false);
                WM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                Magic.setItemMeta(WM);

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
                AMI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                armor.setItemMeta(AMI);

                ItemStack back = new ItemStack(Material.ARROW);
                ItemMeta BM = back.getItemMeta();
                BM.setDisplayName(ChatColor.RED + "Back");
                back.setItemMeta(BM);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);

                ItemStack Weapons = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta WWM = Weapons.getItemMeta();
                WWM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Weapons");
                WWM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                Weapons.setItemMeta(WWM);


                Guide.setItem(0, G1);
                Guide.setItem(1, G1);
                Guide.setItem(2, G1);
                Guide.setItem(3, G1);
                Guide.setItem(4, G1);
                Guide.setItem(5, G1);
                Guide.setItem(6, G1);
                Guide.setItem(7, G1);
                Guide.setItem(8, G1);
                Guide.setItem(9, Magic);
                Guide.setItem(10, G1);
                Guide.setItem(11, mat);
                Guide.setItem(12, G1);
                Guide.setItem(13, armor);
                Guide.setItem(14, G1);
                Guide.setItem(15, mis);
                Guide.setItem(16, G1);
                Guide.setItem(17, Weapons);
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

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Class") && event.getCurrentItem().getType() == Material.END_CRYSTAL) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.AQUA + "" + ChatColor.BOLD + "Class");

                ItemStack G2 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M2 = G2.getItemMeta();
                M2.setDisplayName(" ");
                G2.setItemMeta(M2);

                ItemStack Mage = new ItemStack(Material.AMETHYST_CLUSTER);
                ItemMeta MageM = Mage.getItemMeta();
                MageM.setDisplayName(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Mage");
                Mage.setItemMeta(MageM);

                ItemStack Swordsman = new ItemStack(Material.GOLDEN_SWORD);
                ItemMeta SwordsmanM = Swordsman.getItemMeta();
                SwordsmanM.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Swordsman");
                SwordsmanM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                Swordsman.setItemMeta(SwordsmanM);

                ItemStack Armorer = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemMeta ArmorerM = Armorer.getItemMeta();
                ArmorerM.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Armorer");
                ArmorerM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                Armorer.setItemMeta(ArmorerM);

                ItemStack Archer = new ItemStack(Material.BOW);
                ItemMeta ArcherM = Archer.getItemMeta();
                ArcherM.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Archer");
                Archer.setItemMeta(ArcherM);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);

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
                Guide.setItem(18, Back);
                Guide.setItem(19, G2);
                Guide.setItem(20, G2);
                Guide.setItem(21, G2);
                Guide.setItem(22, G2);
                Guide.setItem(23, G2);
                Guide.setItem(24, G2);
                Guide.setItem(25, G2);
                Guide.setItem(26, close);


                player.openInventory(Guide);


            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Skill Points") && event.getCurrentItem().getType() == Material.BEACON) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Skill Points");

                ItemStack G2 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M2 = G2.getItemMeta();
                M2.setDisplayName(" ");
                G2.setItemMeta(M2);

                ItemStack Speed = new ItemStack(Material.SUGAR);
                ItemMeta SpeedM = Speed.getItemMeta();
                SpeedM.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Speed");
                List<String> SPEEDL = new ArrayList<>();
                SPEEDL.add(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "+0.1 Speed Per Level");
                SpeedM.setLore(SPEEDL);
                Speed.setItemMeta(SpeedM);

                ItemStack STR = new ItemStack(Material.REDSTONE);
                ItemMeta STRM = STR.getItemMeta();
                STRM.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Damage");
                List<String> STRL = new ArrayList<>();
                STRL.add(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "+0.01 Damage Per Level");
                STRM.setLore(STRL);
                STR.setItemMeta(STRM);

                ItemStack DEF = new ItemStack(Material.GLOWSTONE_DUST);
                ItemMeta DEFM = DEF.getItemMeta();
                DEFM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Defence");
                List<String> DEFL = new ArrayList<>();
                DEFL.add(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "+0.05 Defence Per Level");
                DEFM.setLore(DEFL);
                DEF.setItemMeta(DEFM);

                ItemStack not = new ItemStack(Material.GUNPOWDER);
                ItemMeta notM = not.getItemMeta();
                notM.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Not Coming Soon");
                List<String> notL = new ArrayList<>();
                notL.add(ChatColor.GRAY + "" + ChatColor.BOLD + "...");
                notM.setLore(notL);
                not.setItemMeta(notM);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);


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
                Guide.setItem(10, not);
                Guide.setItem(11, G2);
                Guide.setItem(12, DEF);
                Guide.setItem(13, G2);
                Guide.setItem(14, STR);
                Guide.setItem(15, G2);
                Guide.setItem(16, Speed);
                Guide.setItem(17, G2);
                Guide.setItem(18, Back);
                Guide.setItem(19, G2);
                Guide.setItem(20, G2);
                Guide.setItem(21, G2);
                Guide.setItem(22, G2);
                Guide.setItem(23, G2);
                Guide.setItem(24, G2);
                Guide.setItem(25, G2);
                Guide.setItem(26, close);


                player.openInventory(Guide);


            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Info") && event.getCurrentItem().getType() == Material.PAPER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.BLUE + "" + ChatColor.BOLD + "Info");

                ItemStack Credits = new ItemStack(Material.DIAMOND);
                ItemMeta CreditsM = Credits.getItemMeta();
                CreditsM.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Credits");
                CreditsM.addEnchant(Enchantment.DURABILITY, 1, false);
                CreditsM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                List<String> lore = new ArrayList<>();
                lore.add(ChatColor.DARK_PURPLE + "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "=========================");
                lore.add(" ");
                lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Comet99   " + ChatColor.AQUA + "[Developer]   [Game Design]");
                lore.add(" ");
                lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "NewAmazingPVP   " + ChatColor.AQUA + "[Developer]   [Game Design]");
                lore.add(" ");
                lore.add(ChatColor.DARK_PURPLE + "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "=========================");
                CreditsM.setLore(lore);
                Credits.setItemMeta(CreditsM);


                ItemStack HowToPlay = new ItemStack(Material.BOOK);
                ItemMeta HowToPlayM = HowToPlay.getItemMeta();
                HowToPlayM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "How To Play");
                HowToPlayM.addEnchant(Enchantment.DURABILITY, 1, false);
                HowToPlayM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                List<String> HowToPlaylore = new ArrayList<>();
                HowToPlaylore.add(ChatColor.DARK_PURPLE + "If u see this then Comet99 was too lazy to change this text -_-");
                HowToPlayM.setLore(HowToPlaylore);
                HowToPlay.setItemMeta(HowToPlayM);

                ItemStack G3 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M3 = G3.getItemMeta();
                M3.setDisplayName(" ");
                G3.setItemMeta(M3);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);

                Guide.setItem(0, G3);
                Guide.setItem(1, G3);
                Guide.setItem(2, G3);
                Guide.setItem(3, G3);
                Guide.setItem(4, G3);
                Guide.setItem(5, G3);
                Guide.setItem(6, G3);
                Guide.setItem(7, G3);
                Guide.setItem(8, G3);
                Guide.setItem(9, G3);
                Guide.setItem(10, G3);
                Guide.setItem(11, Credits);
                Guide.setItem(12, G3);
                Guide.setItem(13, G3);
                Guide.setItem(14, G3);
                Guide.setItem(15, HowToPlay);
                Guide.setItem(16, G3);
                Guide.setItem(17, G3);
                Guide.setItem(18, Back);
                Guide.setItem(19, G3);
                Guide.setItem(20, G3);
                Guide.setItem(21, G3);
                Guide.setItem(22, G3);
                Guide.setItem(23, G3);
                Guide.setItem(24, G3);
                Guide.setItem(25, G3);
                Guide.setItem(26, close);


                player.openInventory(Guide);

            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Close") && event.getCurrentItem().getType() == Material.BARRIER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                player.closeInventory();

            }
            event.setCancelled(true);
        }
    }
}