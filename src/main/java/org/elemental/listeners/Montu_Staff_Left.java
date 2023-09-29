package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Montu_Staff_Left implements Listener {
    private HashMap<UUID, Long> cooldowns = new HashMap<>();

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getInventory().getItemInMainHand();

        if (!player.isSneaking()) {
            // check if the player is in cooldown
            if (cooldowns.containsKey(player.getUniqueId())) {
                long cooldownEnd = cooldowns.get(player.getUniqueId());
                if (System.currentTimeMillis() < cooldownEnd) {
                    // player is still in cooldown
                    player.sendMessage(ChatColor.RED + "Please slow down.");
                    return;
                }
            }

            if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
                if (itemInHand != null && itemInHand.hasItemMeta() && itemInHand.getItemMeta().hasDisplayName()) {
                    String name = itemInHand.getItemMeta().getDisplayName();
                    if (name.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]")) {
                        // 1000 milliseconds = 1 second
                        long cooldownEnd = System.currentTimeMillis() + 1000;
                        cooldowns.put(player.getUniqueId(), cooldownEnd);

                        player.sendMessage("Left");
                        player.playSound(player.getLocation(), Sound.BLOCK_BEACON_POWER_SELECT, 1.0f, 2.0f);
                        player.playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 1.0f, 2.0f);
                        Location location = player.getEyeLocation().add(0, 0.2, 0);
                        Vector direction = player.getLocation().getDirection();
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
                        for (int i = 0; i < 15; i++) {
                            try {
                                Thread.sleep(30); // Sleep for 200 milliseconds (0.2 seconds)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            location.add(direction);
                            for (Player player2 : Bukkit.getOnlinePlayers()) {
                                player2.getWorld().spawnParticle(Particle.REDSTONE, location, 0, new Particle.DustOptions(Color.PURPLE, 2.0F));
                                player2.getWorld().spawnParticle(Particle.REDSTONE, location, 0, new Particle.DustOptions(Color.BLACK, 3.0F));
                            }
                        }
                    }
                }
            }
        }
    }
}







