package org.elemental.variables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PremadeItems {
    public static ItemStack PlasmaPic_1() {

        ItemStack pick = new ItemStack(Material.WOODEN_PICKAXE);
        ItemMeta SI = pick.getItemMeta();
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SI.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Plasma Block Pickaxe" + ChatColor.LIGHT_PURPLE + " T1");
        SI.setUnbreakable(true);
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.LIGHT_PURPLE + "Use this to break" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + " Plasma Blocks!");
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

    public static ItemStack plasmascrap() {

        ItemStack plasmascrap = new ItemStack(Material.LAPIS_LAZULI);
        ItemMeta SI = plasmascrap.getItemMeta();
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SI.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Plasma scrap" + ChatColor.BLUE + "" + ChatColor.BOLD + " [Uncommon]");
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.DARK_GREEN + "Use this to craft and charge up some items!");
        SI.setLore(BL);
        plasmascrap.setItemMeta(SI);

        return plasmascrap;
    }

    public static ItemStack plasmaenergy(){

        ItemStack plasmaenergy = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta SI = plasmaenergy.getItemMeta();
        SI.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Plasma energy" + ChatColor.DARK_BLUE + "" + ChatColor.BOLD + " [Rare]");
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.DARK_GREEN + "Used to craft.");
        SI.setLore(BL);
        plasmaenergy.setItemMeta(SI);

        return plasmaenergy;
    }

    public static ItemStack starDustChisel_1(){

        ItemStack starDustChisel_1 = new ItemStack(Material.ARROW);
        ItemMeta SI = starDustChisel_1.getItemMeta();
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SI.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Star Dust Chisel" + ChatColor.LIGHT_PURPLE + " T1");
        SI.setUnbreakable(true);
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.LIGHT_PURPLE + "Use this to break" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + " Star Dust!");
        SI.setLore(BL);
        SI.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        starDustChisel_1.setItemMeta(SI);

        return starDustChisel_1;
    }

    public static ItemStack starDust(){

        ItemStack starDust = new ItemStack(Material.NETHER_STAR);
        ItemMeta SI = starDust.getItemMeta();
        SI.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Star Dust" + ChatColor.DARK_BLUE + "" + ChatColor.BOLD + " [Rare]");
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.DARK_GREEN + "Used to craft things and level up.");
        SI.setLore(BL);
        starDust.setItemMeta(SI);

        return starDust;
    }
}

