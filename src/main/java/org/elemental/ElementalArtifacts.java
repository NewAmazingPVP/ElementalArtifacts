package org.elemental;

import org.bukkit.event.Listener;
import org.elemental.CustomRecipes.Compact_Netherite_Recipe;
import org.elemental.command.Temp_give_axe;
import org.elemental.command.Temp_give_portcrafttable;
import org.elemental.command.Temp_givedoublesword;
import org.elemental.listeners.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.listeners.*;
import org.elemental.command.Artifacts;
import org.elemental.utility.AutoUpload;

import static org.elemental.CustomRecipes.Compact_Netherite_Recipe.registerCustomRecipes;

public final class ElementalArtifacts extends JavaPlugin implements Listener {
    public static ElementalArtifacts elementalArtifacts;


    @Override
    public void onEnable() {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        elementalArtifacts = this;
        getCommand("giveportcraft").setExecutor(new Temp_give_portcrafttable());
        getCommand("EAGuide").setExecutor(new Artifacts());
        getCommand("giveaxe").setExecutor(new Temp_give_axe());
        getCommand("givedoublesword").setExecutor(new Temp_givedoublesword());
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new Reaper_axe(), this);
        getServer().getPluginManager().registerEvents(new Guide(), this);
        getServer().getPluginManager().registerEvents(new Guide_Listener(), this);
        getServer().getPluginManager().registerEvents(new Info_Listener(), this);
        getServer().getPluginManager().registerEvents(new ClassMenu_Listener(), this);
        getServer().getPluginManager().registerEvents(new SkillMenu_listener(), this);
        getServer().getPluginManager().registerEvents(new CraftingMenu_1_Listener(), this);
        getServer().getPluginManager().registerEvents(new PortCraftTable(), this);
        getServer().getPluginManager().registerEvents(new doubleedged_sword(), this);
        getServer().getPluginManager().registerEvents(new Crafting_Table_Sound(), this);
        registerCustomRecipes();
        AutoUpload.startReleaseChecker();
    }

}