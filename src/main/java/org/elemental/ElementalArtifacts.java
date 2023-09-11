package org.elemental;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.elemental.command.Temp_give_axe;
import org.elemental.listener.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.listeners.EAGuideclicklistener;
import org.elemental.listeners.ElementalArtifactsGuide_1;
import org.elemental.listeners.Reaper_axe;
import org.elemental.command.Artifacts;
import org.elemental.utility.AutoUpload;

public final class ElementalArtifacts extends JavaPlugin implements Listener {
    public static ElementalArtifacts elementalArtifacts;

    @Override
    public void onEnable() {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        elementalArtifacts = this;
        getCommand("givebook").setExecutor(new Artifacts());
        getCommand("giveaxe").setExecutor(new Temp_give_axe());
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new Reaper_axe(), this);
        getServer().getPluginManager().registerEvents(new ElementalArtifactsGuide_1(), this);
        getServer().getPluginManager().registerEvents(new EAGuideclicklistener(), this);
        AutoUpload.startReleaseChecker();
    }

}