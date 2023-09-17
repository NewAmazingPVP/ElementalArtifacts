package org.elemental.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class lucky_gem implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();

        // Check if the player right-clicked
        if (event.getAction().name().contains("RIGHT_CLICK")) {
            // Check if the item has the desired name
            if (item.getType() == Material.EMERALD && item.hasItemMeta() &&
                    item.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Lucky Gem" + ChatColor.DARK_AQUA + " [Item]")) {

                // Randomly give rewards based on chances
                double random = Math.random();
                if (random <= 0.05) {
                    // Give full diamond armor
                    player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                    player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                    player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                    player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
                    player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "+ Diamond Set");
                    player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));


                } else if (random <= 0.15) {
                    // Give a diamond block
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "+ Diamond Block");
                    player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

                } else if (random <= 0.25) {
                    // Give a god potion
                    player.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
                    player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
                    player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "+ God Apple");
                    player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

                } else {
                    // Give leather armor

                    ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
                    ItemMeta BSI = boots.getItemMeta();
                    BSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Boots" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> BL = new ArrayList<>();
                    BL.add(ChatColor.RED + "It can only come off if you Die!");
                    BSI.setLore(BL);
                    BSI.addEnchant(Enchantment.BINDING_CURSE, 1, false);
                    BSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    BSI.setUnbreakable(true);
                    BSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    boots.setItemMeta(BSI);

                    ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta CBSI = chest.getItemMeta();
                    CBSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Chestplate" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> CL = new ArrayList<>();
                    CL.add(ChatColor.RED + "It can only come off if you Die!");
                    CBSI.setLore(CL);
                    CBSI.addEnchant(Enchantment.BINDING_CURSE, 1, false);
                    CBSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    CBSI.setUnbreakable(true);
                    CBSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    chest.setItemMeta(CBSI);

                    ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemMeta LCBSI = legs.getItemMeta();
                    LCBSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Leggings" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> LL = new ArrayList<>();
                    LL.add(ChatColor.RED + "It can only come off if you Die!");
                    LCBSI.setLore(LL);
                    LCBSI.addEnchant(Enchantment.BINDING_CURSE, 1, false);
                    LCBSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    LCBSI.setUnbreakable(true);
                    LCBSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    legs.setItemMeta(LCBSI);

                    ItemStack helm = new ItemStack(Material.CARVED_PUMPKIN);
                    ItemMeta HLCBSI = helm.getItemMeta();
                    HLCBSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Helmet" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> HLL = new ArrayList<>();
                    HLL.add(ChatColor.RED + "It can only come off if you Die!");
                    HLCBSI.setLore(HLL);
                    HLCBSI.addEnchant(Enchantment.BINDING_CURSE, 1, false);
                    HLCBSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    HLCBSI.setUnbreakable(true);
                    HLCBSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    helm.setItemMeta(HLCBSI);



                    player.getInventory().setHelmet(new ItemStack(helm));
                    player.getInventory().setChestplate(new ItemStack(chest));
                    player.getInventory().setLeggings(new ItemStack(legs));
                    player.getInventory().setBoots(new ItemStack(boots));
                    player.playSound(player.getLocation(), Sound.ENTITY_CAT_AMBIENT, 1.0f, 0.0f);
                    player.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "+ Binding Armor");
                    player.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "L          =D");
                    player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

                }
            }
        }
    }
}