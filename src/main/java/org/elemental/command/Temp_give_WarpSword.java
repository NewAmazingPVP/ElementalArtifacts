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

public class Temp_give_WarpSword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack teamsel = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta SI = teamsel.getItemMeta();
        SI.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Warp Sword" + ChatColor.DARK_AQUA + " [Sword]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GOLD + " To Warp 5 Blocks!");
        SI.setLore(DEFL);
        SI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teamsel.setItemMeta(SI);

        player.getInventory().addItem(teamsel);
        return true;
    }
}