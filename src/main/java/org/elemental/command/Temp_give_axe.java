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
        SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Beheading Axe" + ChatColor.DARK_AQUA + " [Sword]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.RED + "Use this to show your power and execute people");
        DEFL.add(ChatColor.RED + "to keep there heads or something idk...");
        DEFL.add(ChatColor.DARK_RED + "lol.....");
        SI.setLore(DEFL);
        SI.setUnbreakable(true);
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teamsel.setItemMeta(SI);

        player.getInventory().addItem(teamsel);
        return true;
    }
}