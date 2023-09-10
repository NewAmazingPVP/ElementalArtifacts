package org.elemental;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.elemental.listener.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.listeners.Reaper_axe;
import org.elemental.command.Artifacts;

public final class ElementalArtifacts extends JavaPlugin implements Listener {
    public static ElementalArtifacts elementalArtifacts;

    @Override
    public void onEnable() {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        elementalArtifacts = this;
        getCommand("EA").setExecutor(new Artifacts());
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new Reaper_axe(), this);

    }

    @Override
    public void onDisable() {
        Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "Elemental Artifacts Has Stopped!");
        // Plugin shutdown logic
    }
}