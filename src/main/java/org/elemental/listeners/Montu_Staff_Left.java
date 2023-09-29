package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Entity;


public class Montu_Staff_Left implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();


        if (!player.isSneaking()) {

            if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {

                if (itemInHand != null && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName()) {
                    String name = itemInHand.getItemMeta().getDisplayName();
                    if (name.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {

                        player.sendMessage("Left");
                        /*player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 2.0f);*/
                        player.playSound(player.getLocation(), Sound.BLOCK_BEACON_POWER_SELECT, 1.0f, 2.0f);
                        Location location = player.getEyeLocation().add(0, 0.2, 0);
                        Vector direction = player.getLocation().getDirection();
                        for (int i = 0; i < 15; i++) {
                            location.add(direction);
                            player.getWorld().spawnParticle(Particle.REDSTONE, location, 0, new Particle.DustOptions(Color.PURPLE, 1.0F));
                            player.getWorld().spawnParticle(Particle.REDSTONE, location, 0, new Particle.DustOptions(Color.BLACK, 2.0F));
                            Vector direction2 = player.getLocation().getDirection();
                            double range = 15;
                            for (Entity entity : player.getNearbyEntities(range, range, range)) {
                                Vector entityVector = entity.getLocation().subtract(player.getLocation()).toVector();
                                if (entityVector.normalize().equals(direction2.normalize())) {
                                    /*entity.setLastDamage(2);
                                    entity.setLastDamager(player);*/
                                    Event event2 = new EntityDamageByEntityEvent(entity, player, EntityDamageEvent.DamageCause.ENTITY_ATTACK, 2);
                                    Bukkit.getServer().getPluginManager().callEvent(event2);

                        }
                    }
                }
            }
        }
    }
}





