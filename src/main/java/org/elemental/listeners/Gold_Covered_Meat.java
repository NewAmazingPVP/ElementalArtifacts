package org.elemental.listeners;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.entity.Player;

public class Gold_Covered_Meat implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().name().contains("RIGHT")) {  // Check if right-click
            Player player = event.getPlayer();
            ItemStack item = event.getItem();
            if (item != null && item.getType() != Material.COOKED_MUTTON) {
                ItemMeta meta = item.getItemMeta();
                if (meta != null && meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Covered Meat" + ChatColor.DARK_AQUA + " [Food]")) {
                    ItemStack[] inventory = player.getInventory().getContents();
                    if (player.getInventory().getItemInMainHand().getType() == Material.COOKED_MUTTON) {
                        if (player.getInventory().getItemInMainHand().getAmount() > 1) {
                            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                        } else {
                            player.getInventory().setItemInMainHand(null);

                        }
                        player.sendMessage(ChatColor.GREEN + "lololololol");
                    }
                }
            }
        }
    }
}