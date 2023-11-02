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
            if (chestplate != null && chestplate.getType().equals(Material.LEATHER_CHESTPLATE)) {
                ItemMeta meta = chestplate.getItemMeta();
                if (meta != null && meta.getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Star Dust Mines Chestplate")) {
                    player.sendMessage("test");
                }
            }
        }
    }
}
