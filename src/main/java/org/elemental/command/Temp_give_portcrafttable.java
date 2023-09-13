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

public class Temp_give_portcrafttable implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack teamsel = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta SI = teamsel.getItemMeta();
        SI.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Portable Crafting Table" + ChatColor.DARK_AQUA + " [Item]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GOLD + " To open!");
        SI.setLore(DEFL);
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        teamsel.setItemMeta(SI);

        player.getInventory().addItem(teamsel);
        return true;
    }
}