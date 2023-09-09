package org.elemental.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Test_Lead_players implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Entity clickedEntity = event.getRightClicked();
        if (clickedEntity instanceof Player) {
            Player clickedPlayer = (Player) clickedEntity;
            if (event.getPlayer().getItemInHand().getType() == Material.LEAD) {
                clickedPlayer.setPassenger(event.getPlayer());
            }
        }
    }

}

