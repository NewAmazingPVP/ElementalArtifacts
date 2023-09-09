package org.elemental;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElementalArtifacts extends JavaPlugin {
    public static ElementalArtifacts elementalArtifacts;

    @Override
    public void onEnable() {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        elementalArtifacts = this;

    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "Elemental Artifacts Has Stopped!");
        // Plugin shutdown logic
    }
}