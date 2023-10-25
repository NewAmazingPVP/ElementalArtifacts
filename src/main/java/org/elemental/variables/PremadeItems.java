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
