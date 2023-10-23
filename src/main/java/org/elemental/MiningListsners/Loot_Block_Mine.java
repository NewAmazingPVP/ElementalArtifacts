package org.elemental.MiningListsners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class Loot_Block_Mine implements Listener {

    @EventHandler
    public void onPlayerMine(BlockBreakEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand != null && itemInHand.getType() == Material.WOODEN_PICKAXE && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe")) {
            event.setCancelled(true);
            if (event.getBlock().getType() == Material.AMETHYST_BLOCK) {
                player.playSound(player.getLocation(), Sound.BLOCK_BEACON_DEACTIVATE, 2.0f, 2.0f);
                player.sendMessage(ChatColor.DARK_AQUA + "[Plasma Block Broken]");
                if (Math.random() < 1.0) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    ItemStack plasmascrap = new ItemStack(Material.LAPIS_LAZULI);
                    ItemMeta SI = plasmascrap.getItemMeta();
                    SI.addEnchant(Enchantment.DURABILITY, 1, false);
                    SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    SI.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Plasma scrap" + ChatColor.BLUE + "" + ChatColor.BOLD + " [Uncommon]");
                    SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    List<String> BL = new ArrayList<>();
                    BL.add(ChatColor.DARK_GREEN + "Use this to craft and charge up some items!");
                    SI.setLore(BL);
                    plasmascrap.setItemMeta(SI);

                    player.getInventory().addItem(plasmascrap);

                }

                if (Math.random() < 0.05) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    ItemStack plasmaenergy = new ItemStack(Material.NETHER_STAR);
                    ItemMeta SI = plasmaenergy.getItemMeta();
                    SI.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Plasma energy" + ChatColor.DARK_BLUE + "" + ChatColor.BOLD + " [Rare]");
                    SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    List<String> BL = new ArrayList<>();
                    BL.add(ChatColor.DARK_GREEN + "Used to craft.");
                    SI.setLore(BL);
                    plasmaenergy.setItemMeta(SI);

                    player.getInventory().addItem(plasmaenergy);
                }
            }
        }
    }

    @EventHandler
    public void onPlayerMine(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand != null && itemInHand.getType() == Material.WOODEN_PICKAXE && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 70, 1));
        }
    }
}
