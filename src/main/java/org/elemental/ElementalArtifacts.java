package org.elemental;

import org.bukkit.event.Listener;
import org.elemental.CustomRecipes.Compact_Netherite_Recipe;
import org.elemental.command.*;
import org.elemental.listeners.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.listeners.*;
import org.elemental.utility.AutoUpload;

import static org.elemental.CustomRecipes.Compact_Netherite_Block_Recipe.registerCustom;
import static org.elemental.CustomRecipes.Compact_Netherite_Recipe.registerCustomRecipes;
import static org.elemental.CustomRecipes.DoubleSword_Recipe.registerCustomRecipesdouble;

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
        getCommand("givewarpsword").setExecutor(new Temp_give_WarpSword());
        getCommand("bookofitems").setExecutor(new Book_Of_Items_Give());
        getCommand("givebindingarmor").setExecutor(new Temp_give_bindingarmor());
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
        getServer().getPluginManager().registerEvents(new Anti_Block_Place_Listener(), this);
        getServer().getPluginManager().registerEvents(new WarpSword(), this);
        getServer().getPluginManager().registerEvents(new Book_Of_Items(), this);
        getServer().getPluginManager().registerEvents(new Book_Of_Items_Listener(), this);
        registerCustomRecipes();
        registerCustom();
        registerCustomRecipesdouble();
        AutoUpload.startReleaseChecker();
    }

}