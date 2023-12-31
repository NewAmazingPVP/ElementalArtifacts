package org.elemental;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.Full_Set_Bonus_Armor.TestSetBonus;
import org.elemental.MiningListsners.Loot_Block_Mine;
import org.elemental.MiningListsners.MiningBlockReplace;
import org.elemental.MiningListsners.Star_Dust_Mine;
import org.elemental.command.*;
import org.elemental.listeners.AntiAnvilOpen;
import org.elemental.listeners.CustomEnchantTable;
import org.elemental.listeners.Scrap_Melter;
import org.elemental.utility.AutoUpload;

import static org.elemental.WorldParticles.TeleportParticles.test;


public final class ElementalArtifacts extends JavaPlugin implements Listener {
    public static ElementalArtifacts elementalArtifacts;


    @Override
    public void onEnable() {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        elementalArtifacts = this;
        /*getCommand("EAGuide").setExecutor(new Artifacts());
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
        getServer().getPluginManager().registerEvents(new Montu_Staff_Right(), this);
        getServer().getPluginManager().registerEvents(new Montu_Staff_Shift_Right(), this);
        getServer().getPluginManager().registerEvents(new Montu_Staff_Left(), this);
        getServer().getPluginManager().registerEvents(new Montu_Staff_Shift_Left(), this);
        getServer().getPluginManager().registerEvents(new Montu_Staff_OtherItemCode(), this);
        registerCustomRecipes();*/
        //------------------------- auto updater ------------------------
        AutoUpload.startReleaseChecker();
        //------------------------- MMO PLUGIN --------------------------
        getCommand("GivePlasmaPick_1").setExecutor(new GivePlasmaBlockPick_1());
        getCommand("GiveStarDustCH").setExecutor(new GiveStarDistMine_1());
        getCommand("GiveStarDustMineArmor").setExecutor(new GiveStarDustMineArmor());
        getCommand("Spawn_NPC_Mechanic").setExecutor(new Spawn_NPC_Mechanic());
        getCommand("GiveScrapAll").setExecutor(new GiveScrapAll());



        getServer().getPluginManager().registerEvents(new AntiAnvilOpen(), this);
        getServer().getPluginManager().registerEvents(new Loot_Block_Mine(), this);
        getServer().getPluginManager().registerEvents(new Star_Dust_Mine(), this);
        getServer().getPluginManager().registerEvents(new MiningBlockReplace(), this);
        getServer().getPluginManager().registerEvents(new CustomEnchantTable(), this);
        getServer().getPluginManager().registerEvents(new Scrap_Melter(), this);
        getServer().getPluginManager().registerEvents(new TestSetBonus(), this);



        //-------------------------Item functions -----------------------
        test();
        //-------------------------NPC and other entities ---------------
        Location npc1 = new Location(Bukkit.getWorld("world"), 324, 104, -35);
    }
}
    