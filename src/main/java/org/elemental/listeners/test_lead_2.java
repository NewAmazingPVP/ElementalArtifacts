package org.elemental.listeners;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class test_lead_2 implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        // Check if the player right-clicked with a compass
        if (item != null && item.getType() == Material.COMPASS) {
            // Create a lead item
            ItemStack lead = new ItemStack(Material.LEAD);
            ItemMeta leadMeta = lead.getItemMeta();
            leadMeta.setDisplayName("Lead"); // Customize the lead's name if desired
            lead.setItemMeta(leadMeta);

            // Put the lead around the player's neck
            EntityEquipment equipment = player.getEquipment();
            equipment.setHelmet(lead);

            // Prevent the compass from being used
            event.setCancelled(true);
        }
    }
}
