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

public class SkillMenu_listener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Skill Points")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.BARRIER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                player.closeInventory();

            }
            if (event.getCurrentItem().getType() == Material.ARROW) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide");


                ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);


                ItemStack Class = new ItemStack(Material.END_CRYSTAL);
                ItemMeta Mclass = Class.getItemMeta();
                Mclass.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Class");
                Class.setItemMeta(Mclass);

                ItemStack R1 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta MR1 = R1.getItemMeta();
                MR1.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Crafting Recipes");
                R1.setItemMeta(MR1);

                ItemStack Info = new ItemStack(Material.PAPER);
                ItemMeta Minfo = Info.getItemMeta();
                Minfo.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Info");
                Minfo.addEnchant(Enchantment.DURABILITY, 1, false);
                Minfo.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                Info.setItemMeta(Minfo);

                ItemStack Skill = new ItemStack(Material.BEACON);
                ItemMeta MS = Skill.getItemMeta();
                MS.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Skill Points");
                Skill.setItemMeta(MS);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);


                Guide.setItem(0, G1);
                Guide.setItem(1, G1);
                Guide.setItem(2, G1);
                Guide.setItem(3, G1);
                Guide.setItem(4, G1);
                Guide.setItem(5, G1);
                Guide.setItem(6, G1);
                Guide.setItem(7, G1);
                Guide.setItem(8, Info);
                Guide.setItem(9, G1);
                Guide.setItem(10, G1);
                Guide.setItem(11, Class);
                Guide.setItem(12, G1);
                Guide.setItem(13, R1);
                Guide.setItem(14, G1);
                Guide.setItem(15, Skill);
                Guide.setItem(16, G1);
                Guide.setItem(17, G1);
                Guide.setItem(18, G1);
                Guide.setItem(19, G1);
                Guide.setItem(20, G1);
                Guide.setItem(21, G1);
                Guide.setItem(22, G1);
                Guide.setItem(23, G1);
                Guide.setItem(24, G1);
                Guide.setItem(25, G1);
                Guide.setItem(26, close);


                player.openInventory(Guide);



            }
            event.setCancelled(true);
        }
    }
}