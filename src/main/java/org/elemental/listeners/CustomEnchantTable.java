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
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK){
            Block block = event.getClickedBlock();
            if(block.getType() == Material.ENCHANTING_TABLE){
                event.setCancelled(true);
                player.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 2.0f, 2.0f);
                Inventory alter = Bukkit.createInventory(player, 54, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Ability Altar");

                ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack high = new ItemStack(Material.GOLD_BLOCK);
                ItemMeta HCU = high.getItemMeta();
                HCU.addEnchant(Enchantment.DURABILITY, 1, false);
                HCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                HCU.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "------ God Roll ------");
                List<String> HCL = new ArrayList<>();
                HCL.add(" ");
                HCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + "" + ChatColor.GOLD + "" + ChatColor.BOLD + " 100,000" + ChatColor.DARK_RED + " and a" + ChatColor.AQUA + "" + ChatColor.BOLD + " Energy Chip");
                HCL.add(" ");
                HCL.add(ChatColor.GREEN + "Has a chance to give T4-5 abilities");
                HCL.add(ChatColor.GREEN + "and a chance to give" + ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + " Mythic Abilities");
                HCL.add(" ");
                HCU.setLore(HCL);
                high.setItemMeta(HCU);

                ItemStack mid = new ItemStack(Material.GOLD_INGOT);
                ItemMeta MCU = mid.getItemMeta();
                MCU.addEnchant(Enchantment.DURABILITY, 1, false);
                MCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                MCU.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "------ Rare Roll ------");
                List<String> MCL = new ArrayList<>();
                MCL.add(" ");
                MCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + "" + ChatColor.GOLD + "" + ChatColor.BOLD + " 50,000");
                MCL.add(" ");
                MCL.add(ChatColor.GREEN + "Has a chance to give T3-5 abilities");
                MCL.add(" ");
                MCU.setLore(MCL);
                mid.setItemMeta(MCU);

                ItemStack low = new ItemStack(Material.GOLD_NUGGET);
                ItemMeta LCU = low.getItemMeta();
                LCU.addEnchant(Enchantment.DURABILITY, 1, false);
                LCU.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                LCU.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "------ Normal Roll ------");
                List<String> LCL = new ArrayList<>();
                LCL.add(" ");
                LCL.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Cost:" + "" + ChatColor.GOLD + "" + ChatColor.BOLD + " 1,000");
                LCL.add(" ");
                LCL.add(ChatColor.GREEN + "Has a chance to give T1-2 abilities");
                LCL.add(" ");
                LCU.setLore(LCL);
                low.setItemMeta(LCU);

                alter.setItem(0, high);
                alter.setItem(1, mid);
                alter.setItem(2, low);
                alter.setItem(3, G1);
                alter.setItem(4, G1);
                alter.setItem(5, G1);
                alter.setItem(6, G1);
                alter.setItem(7, G1);
                alter.setItem(8, G1);





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



