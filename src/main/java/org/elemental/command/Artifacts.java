package org.elemental.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;

public class Artifacts implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            ItemStack book = new ItemStack(Material.BOOK);
            BookMeta bookMeta = (BookMeta) book.getItemMeta();
            bookMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "[Elemental Artifacts Guide]");
            book.setItemMeta(bookMeta);
            player.getInventory().addItem(book);
            return true;
        }
        return false;
    }
}