package org.elemental.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Temp_give_axe implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack teamsel = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta SI = teamsel.getItemMeta();
        SI.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Beheading Axe" + ChatColor.DARK_AQUA + " [Sword]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.RED + "Use this to show your power and execute people");
        DEFL.add(ChatColor.RED + "to keep there heads or something idk...");
        DEFL.add(ChatColor.DARK_RED + "lol.....");
        SI.setLore(DEFL);
        SI.setUnbreakable(true);
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teamsel.setItemMeta(SI);

        player.getInventory().addItem(teamsel);


        ItemStack StickOfPower  = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta SOPM = StickOfPower.getItemMeta();
        SOPM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Emerald Sword" + ChatColor.GREEN+ " [Sword]");
        List<String> SOPL = new ArrayList<>();
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Turns players to emeralds on kill");
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.BLUE + "" + ChatColor.BOLD + "+1 Sharpness every 2 player kills");
        SOPM.setLore(SOPL);
        SOPM.addEnchant(Enchantment.DURABILITY, 1, false);
        SOPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        StickOfPower.setItemMeta(SOPM);

        player.getInventory().addItem(StickOfPower);
        return true;
    }
}