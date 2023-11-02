package org.elemental.Full_Set_Bonus_Armor;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StarDustMineArmor implements Listener {

    @EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
        Player player = event.getPlayer();
        if (event.isSneaking()) {
            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack leggings = player.getInventory().getLeggings();
            ItemStack boots = player.getInventory().getBoots();

            ItemMeta meta = chestplate.getItemMeta();
            ItemMeta meta2 = leggings.getItemMeta();
            ItemMeta meta3 = boots.getItemMeta();
            if (chestplate != null && chestplate.getType().equals(Material.LEATHER_CHESTPLATE)) {
                if (meta != null && meta.getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Star Dust Mines Chestplate")) {
                    if (leggings != null && leggings.getType().equals(Material.LEATHER_LEGGINGS)) {
                        if (meta2 != null && meta2.getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Star Dust Mines Leggings")) {
                            if (boots != null && boots.getType().equals(Material.LEATHER_BOOTS)) {
                                if (meta3 != null && meta3.getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Star Dust Mines Boots")) {
                                    player.sendMessage("test");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
