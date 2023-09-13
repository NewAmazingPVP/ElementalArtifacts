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

public class Temp_givedoublesword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack teamsel = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta SI = teamsel.getItemMeta();
        SI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Double-Edged Sword" + ChatColor.DARK_AQUA + " [Sword]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.RED + "Just don't use this...");
        SI.setLore(DEFL);
        SI.setUnbreakable(true);
        teamsel.setItemMeta(SI);

        player.getInventory().addItem(teamsel);
        return true;
    }
}