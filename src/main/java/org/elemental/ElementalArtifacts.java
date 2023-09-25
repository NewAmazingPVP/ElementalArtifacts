package org.elemental;

import org.bukkit.event.Listener;
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
        getCommand("givefearmongerpearl").setExecutor(new Temp_give_fearmongerpearl());
        getCommand("givegodpotion").setExecutor(new Temp_give_god_potion());
        getCommand("giveluckygem").setExecutor(new Temp_give_lucky_gem());
        getCommand("setprisoner").setExecutor(new Test_Jail_Player());
        getCommand("givegoldcoveredmeat").setExecutor(new Temp_give_goldcoveredmeat());
        getCommand("netherite_leather").setExecutor(new Netherite_Leather_XD());
        getCommand("givesacerficeingarmor").setExecutor(new Temp_give_sacerficeing_armor());
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
        getServer().getPluginManager().registerEvents(new Anti_Item_Thrower_Listener(), this);
        getServer().getPluginManager().registerEvents(new God_Potion(), this);
        getServer().getPluginManager().registerEvents(new Clear_Ghoast_Items(), this);
        getServer().getPluginManager().registerEvents(new lucky_gem(), this);
        getServer().getPluginManager().registerEvents(new Materials_Recipes_Listener(), this);
        getServer().getPluginManager().registerEvents(new Gold_Covered_Meat(), this);
        getServer().getPluginManager().registerEvents(new Sacerficeing_armor(), this);
        getServer().getPluginManager().registerEvents(new ALL_RECIPIE_GUIDE_LISTENER(), this);
        registerCustomRecipes();
        registerCustom();
        registerCustomRecipesdouble();
        AutoUpload.startReleaseChecker();
    }

}