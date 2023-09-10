package org.elemental.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ElementalArtifactsGuide_1 implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = event.getItem();
            if (item != null && item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                if (meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide")) {
                    Player p = event.getPlayer();
                    player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                    Inventory Guide = Bukkit.createInventory(p, 27, ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide");




                    ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                    ItemMeta M1 = G1.getItemMeta();
                    M1.setDisplayName("");
                    G1.setItemMeta(M1);
                    Guide.setItem(0, G1);



                    p.openInventory(Guide);
                }
            }
        }
    }
}