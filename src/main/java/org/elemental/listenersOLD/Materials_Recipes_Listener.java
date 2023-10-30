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

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack fearmongerperl = new ItemStack(Material.ENDER_PEARL);
                ItemMeta FMPM = fearmongerperl.getItemMeta();
                FMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]");
                List<String> FML = new ArrayList<>();
                FML.add(ChatColor.DARK_PURPLE + "Obtained from killing Enderman!");
                FMPM.setLore(FML);
                FMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                FMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                fearmongerperl.setItemMeta(FMPM);

                ItemStack OreMixture = new ItemStack(Material.BONE_MEAL);
                ItemMeta OFMPM = OreMixture.getItemMeta();
                OFMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]");
                List<String> OML = new ArrayList<>();
                OML.add(ChatColor.DARK_PURPLE + "A mixture of a lot of ores.");
                OFMPM.setLore(OML);
                OFMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                OFMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                OreMixture.setItemMeta(OFMPM);

                ItemStack Mixedeye = new ItemStack(Material.ENDER_EYE);
                ItemMeta MEYEM = Mixedeye.getItemMeta();
                MEYEM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]");
                List<String> MEM = new ArrayList<>();
                MEM.add(ChatColor.DARK_PURPLE + "Crafted from the Fear Mongerer Eye.");
                MEYEM.setLore(MEM);
                MEYEM.addEnchant(Enchantment.DURABILITY, 1, false);
                MEYEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                Mixedeye.setItemMeta(MEYEM);

                ItemStack Emerald = new ItemStack(Material.EMERALD);
                Emerald.setAmount(20);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
                Guide.setItem(37, G1);
                Guide.setItem(38, G1);
                Guide.setItem(39, G1);
                Guide.setItem(40, G1);
                Guide.setItem(41, G1);
                Guide.setItem(42, G1);
                Guide.setItem(43, G1);
                Guide.setItem(44, G1);

                Guide.setItem(11, Emerald);
                Guide.setItem(12, OreMixture);
                Guide.setItem(13, Emerald);
                Guide.setItem(20, OreMixture);
                Guide.setItem(21, fearmongerperl);
                Guide.setItem(22, OreMixture);
                Guide.setItem(29, Emerald);
                Guide.setItem(30, OreMixture);
                Guide.setItem(31, Emerald);

                Guide.setItem(24, Mixedeye);


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.NETHERITE_INGOT) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta SI = compact.getItemMeta();
                SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot" + ChatColor.DARK_AQUA + " [Item]");
                SI.addEnchant(Enchantment.DURABILITY, 1, false);
                SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                compact.setItemMeta(SI);

                ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT);
                netherite.setAmount(2);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
                Guide.setItem(37, G1);
                Guide.setItem(38, G1);
                Guide.setItem(39, G1);
                Guide.setItem(40, G1);
                Guide.setItem(41, G1);
                Guide.setItem(42, G1);
                Guide.setItem(43, G1);
                Guide.setItem(44, G1);

                Guide.setItem(11, netherite);
                Guide.setItem(12, netherite);
                Guide.setItem(13, netherite);
                Guide.setItem(20, netherite);
                Guide.setItem(21, netherite);
                Guide.setItem(22, netherite);
                Guide.setItem(29, netherite);
                Guide.setItem(30, netherite);
                Guide.setItem(31, netherite);

                Guide.setItem(24, compact);

                player.openInventory(Guide);

            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.NETHERITE_BLOCK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta SI = compact.getItemMeta();
                SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot" + ChatColor.DARK_AQUA + " [Item]");
                SI.addEnchant(Enchantment.DURABILITY, 1, false);
                SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                compact.setItemMeta(SI);

                ItemStack compact2 = new ItemStack(Material.NETHERITE_BLOCK);
                ItemMeta SI2 = compact2.getItemMeta();
                SI2.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block" + ChatColor.DARK_AQUA + " [Item]");
                SI2.addEnchant(Enchantment.DURABILITY, 1, false);
                SI2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                compact2.setItemMeta(SI2);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
                Guide.setItem(37, G1);
                Guide.setItem(38, G1);
                Guide.setItem(39, G1);
                Guide.setItem(40, G1);
                Guide.setItem(41, G1);
                Guide.setItem(42, G1);
                Guide.setItem(43, G1);
                Guide.setItem(44, G1);

                Guide.setItem(11, compact);
                Guide.setItem(12, compact);
                Guide.setItem(13, compact);
                Guide.setItem(20, compact);
                Guide.setItem(21, compact);
                Guide.setItem(22, compact);
                Guide.setItem(29, compact);
                Guide.setItem(30, compact);
                Guide.setItem(31, compact);

                Guide.setItem(24, compact2);


                player.openInventory(Guide);
            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bottle Of Light" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.EXPERIENCE_BOTTLE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
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
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.BONE_MEAL) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
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
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Corrupted Handle" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.STICK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
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
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Infused Lapis" + ChatColor.DARK_AQUA + " [Item]") && event.getCurrentItem().getType() == Material.LAPIS_LAZULI) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 45, ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe");

                ItemStack G1 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

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
                Guide.setItem(36, Back);
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

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Back") && event.getCurrentItem().getType() == Material.ARROW) {
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
            event.setCancelled(true);
        }
    }
}
