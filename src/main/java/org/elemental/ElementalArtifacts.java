package org.elemental;

import org.bukkit.event.Listener;
import org.elemental.command.Temp_give_axe;
import org.elemental.listener.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.listeners.Guide_Listener;
import org.elemental.listeners.Guide;
import org.elemental.listeners.Info_Listener;
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
        getServer().getPluginManager().registerEvents(new Guide(), this);
        getServer().getPluginManager().registerEvents(new Guide_Listener(), this);
        getServer().getPluginManager().registerEvents(new Info_Listener(), this);
        AutoUpload.startReleaseChecker();
    }

}