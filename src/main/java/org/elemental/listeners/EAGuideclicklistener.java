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
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class EAGuideclicklistener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Crafting Recipes");

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
                MM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "materials");
                mat.setItemMeta(MM);

                ItemStack mis = new ItemStack(Material.CLOCK);
                ItemMeta MI = mis.getItemMeta();
                MI.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "miscellaneous");
                mis.setItemMeta(MI);

                ItemStack armor = new ItemStack(Material.DIRT);
                ItemMeta AMI = armor.getItemMeta();
                AMI.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Armor");
                armor.setItemMeta(AMI);

                LeatherArmorMeta armorMeta = (LeatherArmorMeta) armor.getItemMeta();
                armorMeta.setColor(Color.fromRGB(128, 0, 0)); // Set the color to dark red
                armorMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Armor");
                armor.setItemMeta(armorMeta);


                Guide.setItem(0, weapons);










                player.openInventory(Guide);

            }
            event.setCancelled(true);
        }

    }
}