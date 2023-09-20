package org.elemental.listeners;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Test_Jail_Listener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.getScoreboard().getEntryTeam(player.getName()).getName().equalsIgnoreCase("prisoner")) {
            // Set the armor
            ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
            chestplateMeta.setColor(Color.ORANGE);
            chestplateMeta.setUnbreakable(true);
            chestplate.setItemMeta(chestplateMeta);

            ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
            leggingsMeta.setColor(Color.ORANGE);
            leggingsMeta.setUnbreakable(true);
            leggings.setItemMeta(leggingsMeta);

            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
            bootsMeta.setColor(Color.ORANGE);
            bootsMeta.setUnbreakable(true);
            boots.setItemMeta(bootsMeta);

            player.getInventory().setArmorContents(new ItemStack[]{null, chestplate, leggings, boots});
            player.getInventory().setHelmet(null);

            // Apply slowness effect
            PotionEffect slownessEffect = new PotionEffect(PotionEffectType.SLOW, 40, 1);
            player.addPotionEffect(slownessEffect);
        }
    }
}





