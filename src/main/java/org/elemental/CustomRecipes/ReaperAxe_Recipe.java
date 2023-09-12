package org.elemental.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ReaperAxe_Recipe {

    public final class ElementalArtifacts extends JavaPlugin implements Listener {
        @Override
        public void onEnable() {
            String deathMessage = ChatColor.DARK_RED + "" + ChatColor.BOLD + " this works yay!";
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(deathMessage);
            }
        }
    }
}