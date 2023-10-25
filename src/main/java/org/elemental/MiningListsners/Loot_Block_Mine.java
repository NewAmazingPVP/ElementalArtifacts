package org.elemental.MiningListsners;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

import static org.elemental.variables.PremadeItems.plasmaenergy;
import static org.elemental.variables.PremadeItems.plasmascrap;

public class Loot_Block_Mine implements Listener {

    @EventHandler
    public void onPlayerMine(BlockBreakEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand != null && itemInHand.getType() == Material.WOODEN_PICKAXE && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe" + ChatColor.LIGHT_PURPLE + " T1")) {
            if (event.getBlock().getType() == Material.AMETHYST_BLOCK) {
                player.playSound(player.getLocation(), Sound.BLOCK_BEACON_DEACTIVATE, 2.0f, 2.0f);
                player.sendMessage(ChatColor.DARK_AQUA + "[Plasma Block Broken]");
                event.getBlock().getWorld().spawnParticle(Particle.SPELL_WITCH, event.getBlock().getLocation(), 10);
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 5));
                if (Math.random() < 1.0) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    player.getInventory().addItem(plasmascrap());

                }

                if (Math.random() < 0.05) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.AIR, 0));

                    player.getInventory().addItem(plasmaenergy());
                }
            }
            if (event.getBlock().getType() != Material.AMETHYST_BLOCK) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onPlayerMine(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand != null && itemInHand.getType() == Material.WOODEN_PICKAXE && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName() && itemInHand.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe" + ChatColor.LIGHT_PURPLE + " T1")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 70, 1));
        }
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = event.getItem();
            if (item != null && item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                if (meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe" + ChatColor.LIGHT_PURPLE + " T1")) {
                    Player p = event.getPlayer();
                    player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 2.0f, 1.0f);
                    Inventory Guide = Bukkit.createInventory(p, 45, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Plasma Block Pickaxe T2");

                    ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
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


                    p.openInventory(Guide);
                }
            }
        }
    }
}




