package org.elemental.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;

public class Artifacts implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack book = createEnchantedBook();
            player.getInventory().addItem(book);
            return true;
        }
        return false;
    }

    private ItemStack createEnchantedBook() {
        ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = book.getItemMeta();
        meta.setDisplayName("Elemental Artifacts Recipe Book");
        book.setItemMeta(meta);
        book.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
        return book;
    }
}
