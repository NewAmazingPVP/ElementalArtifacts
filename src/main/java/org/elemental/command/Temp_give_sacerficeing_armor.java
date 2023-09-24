package org.elemental.command;


import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class Temp_give_sacerficeing_armor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack SacrificingVictimChest = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta SVCM = (LeatherArmorMeta) SacrificingVictimChest.getItemMeta();
        SVCM.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Chestplate" + ChatColor.DARK_AQUA + " [Armor]");
        List<String> SVCL = new ArrayList<>();
        SVCL.add(ChatColor.RED + "If you have this on then you are being sacrificed!");
        SVCM.setLore(SVCL);
        SVCM.setUnbreakable(true);
        SVCM.addItemFlags(ItemFlag.HIDE_DYE);
        SVCM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        SVCM.setColor(Color.fromRGB(0, 0, 255));
        SacrificingVictimChest.setItemMeta(SVCM);

        ItemStack SacrificingVictimLegs = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta SVLM = (LeatherArmorMeta) SacrificingVictimLegs.getItemMeta();
        SVLM.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Leggings" + ChatColor.DARK_AQUA + " [Armor]");
        List<String> SVLL = new ArrayList<>();
        SVLL.add(ChatColor.RED + "If you have this on then you are being sacrificed!");
        SVLM.setLore(SVLL);
        SVLM.setUnbreakable(true);
        SVLM.addItemFlags(ItemFlag.HIDE_DYE);
        SVLM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        SVLM.setColor(Color.fromRGB(0, 0, 255));
        SacrificingVictimLegs.setItemMeta(SVLM);

        ItemStack SacrificingVictimBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta SVBM = (LeatherArmorMeta) SacrificingVictimBoots.getItemMeta();
        SVBM.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Sacrificing Victim Boots" + ChatColor.DARK_AQUA + " [Armor]");
        List<String> SVBL = new ArrayList<>();
        SVBL.add(ChatColor.RED + "If you have this on then you are being sacrificed!");
        SVBM.setLore(SVBL);
        SVBM.setUnbreakable(true);
        SVBM.addItemFlags(ItemFlag.HIDE_DYE);
        SVBM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        SVBM.setColor(Color.fromRGB(0, 0, 255));
        SacrificingVictimBoots.setItemMeta(SVBM);

        player.getInventory().addItem(SacrificingVictimChest);
        player.getInventory().addItem(SacrificingVictimLegs);
        player.getInventory().addItem(SacrificingVictimBoots);
        return true;
    }
}