package org.elemental;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.elemental.MiningListsners.Loot_Block_Mine;
import org.elemental.command.GivePlasmaBlockPick_1;
import org.elemental.listeners.*;

import org.bukkit.plugin.java.JavaPlugin;
import org.elemental.utility.AutoUpload;

import java.util.ArrayList;
import java.util.List;

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
        getServer().getPluginManager().registerEvents(new AntiGuiOpen(), this);
        getServer().getPluginManager().registerEvents(new Loot_Block_Mine(), this);
        //-------------------------Item functions -----------------------
        public static ItemStack PlasmaPic_1 () {
            ItemStack pick = new ItemStack(Material.WOODEN_PICKAXE);
            ItemMeta SI = pick.getItemMeta();
            SI.addEnchant(Enchantment.DURABILITY, 1, false);
            SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            SI.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe" + ChatColor.LIGHT_PURPLE + " T1");
            SI.setUnbreakable(true);
            SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            List<String> BL = new ArrayList<>();
            BL.add(ChatColor.LIGHT_PURPLE + "Use this to break" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + " Plasma Blocks");
            BL.add(" ");
            BL.add(ChatColor.RED + "Pickaxe is so old that it will");
            BL.add(ChatColor.RED + "slow your mining when you use it!");
            BL.add(" ");
            BL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GREEN + " To view T2 recipe!");
            SI.setLore(BL);
            SI.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            pick.setItemMeta(SI);

            return pick;
        }
    }
}
    