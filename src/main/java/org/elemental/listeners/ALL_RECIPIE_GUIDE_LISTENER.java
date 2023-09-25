package org.elemental.listeners;

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

public class ALL_RECIPIE_GUIDE_LISTENER implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Recipe")) {


            if (event.getCurrentItem() == null) {
                return;
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


