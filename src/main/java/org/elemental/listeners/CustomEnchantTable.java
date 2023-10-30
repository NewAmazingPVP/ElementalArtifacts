package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CustomEnchantTable implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block block = event.getClickedBlock();
            if (block.getType() == Material.ENCHANTING_TABLE) {
                event.setCancelled(true);
                player.playSound(player.getLocation(), Sound.BLOCK_END_PORTAL_FRAME_FILL, 2.0f, 0.0f);
                Inventory alter = Bukkit.createInventory(player, 54, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Ability Altar");

                ItemStack G1 = new ItemStack(Material.PINK_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack G2 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M2 = G2.getItemMeta();
                M2.setDisplayName(" ");
                G2.setItemMeta(M2);

                ItemStack high = new ItemStack(Material.GOLD_BLOCK);
                ItemMeta HCU = high.getItemMeta();
                HCU.addEnchant(Enchantment.DURABILITY, 1, false);
                HCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                HCU.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "------ High Level Sacrifice ------");
                List<String> HCL = new ArrayList<>();
                HCL.add(" ");
                HCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + ChatColor.GOLD + ChatColor.BOLD + " 100,000" + ChatColor.DARK_RED + " and an" + ChatColor.AQUA + ChatColor.BOLD + " Energy Chip");
                HCL.add(" ");
                HCL.add(ChatColor.GREEN + "Has a chance to give" + ChatColor.DARK_PURPLE + ChatColor.BOLD + " T4-5" + ChatColor.GREEN + " abilities");
                HCL.add(ChatColor.GREEN + "and a chance to give" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + " Mythic Abilities");
                HCL.add(" ");
                HCU.setLore(HCL);
                high.setItemMeta(HCU);

                ItemStack mid = new ItemStack(Material.GOLD_INGOT);
                ItemMeta MCU = mid.getItemMeta();
                MCU.addEnchant(Enchantment.DURABILITY, 1, false);
                MCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                MCU.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "------ Rare Sacrifice ------");
                List<String> MCL = new ArrayList<>();
                MCL.add(" ");
                MCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + ChatColor.GOLD + ChatColor.BOLD + " 50,000");
                MCL.add(" ");
                MCL.add(ChatColor.GREEN + "Has a chance to give" + ChatColor.DARK_PURPLE + ChatColor.BOLD + " T3-5" + ChatColor.GREEN + " abilities");
                MCL.add(" ");
                MCU.setLore(MCL);
                mid.setItemMeta(MCU);

                ItemStack low = new ItemStack(Material.GOLD_NUGGET);
                ItemMeta LCU = low.getItemMeta();
                LCU.addEnchant(Enchantment.DURABILITY, 1, false);
                LCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                LCU.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "------ Normal Sacrifice ------");
                List<String> LCL = new ArrayList<>();
                LCL.add(" ");
                LCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + ChatColor.GOLD + ChatColor.BOLD + " 1,000");
                LCL.add(" ");
                LCL.add(ChatColor.GREEN + "Has a chance to give" + ChatColor.DARK_PURPLE + ChatColor.BOLD + " T1-2" + ChatColor.GREEN + " abilities");
                LCL.add(" ");
                LCU.setLore(LCL);
                low.setItemMeta(LCU);


                alter.setItem(0, G2);
                alter.setItem(1, G2);
                alter.setItem(2, G2);
                alter.setItem(3, G2);
                alter.setItem(4, G2);
                alter.setItem(5, G2);
                alter.setItem(6, G2);
                alter.setItem(7, G2);
                alter.setItem(8, G2);

                alter.setItem(9, G1);
                alter.setItem(10, G1);
                alter.setItem(11, high);
                alter.setItem(12, G1);
                alter.setItem(13, mid);
                alter.setItem(14, G1);
                alter.setItem(15, low);
                alter.setItem(16, G1);
                alter.setItem(17, G1);

                alter.setItem(18, G1);
                alter.setItem(19, G1);
                alter.setItem(20, G1);
                alter.setItem(21, G1);
                alter.setItem(22, G1);
                alter.setItem(23, G1);
                alter.setItem(24, G1);
                alter.setItem(25, G1);
                alter.setItem(26, G1);

                alter.setItem(27, G1);
                //alter.setItem(28, G1);
                alter.setItem(29, G1);
                //alter.setItem(30, G1);
                alter.setItem(31, G1);
                alter.setItem(32, G1);
                //alter.setItem(33, G1);
                alter.setItem(34, G1);
                alter.setItem(35, G1);

                alter.setItem(36, G1);
                alter.setItem(37, G1);
                alter.setItem(38, G1);
                alter.setItem(39, G1);
                alter.setItem(40, G1);
                alter.setItem(41, G1);
                alter.setItem(42, G1);
                alter.setItem(43, G1);
                alter.setItem(44, G1);

                alter.setItem(45, G2);
                alter.setItem(46, G2);
                alter.setItem(47, G2);
                alter.setItem(48, G2);
                alter.setItem(49, G2);
                alter.setItem(50, G2);
                alter.setItem(51, G2);
                alter.setItem(52, G2);
                alter.setItem(53, G2);


                player.openInventory(alter);
            }
        }
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Ability Altar")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            event.setCancelled(true);


        }
    }
}




