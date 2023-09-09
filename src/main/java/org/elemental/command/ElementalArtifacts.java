package org.elemental.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ElementalArtifacts extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin initialization code
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("givebook")) {
            if (args.length == 1) {
                Player player = Bukkit.getPlayer(args[0]);
                if (player != null) {
                    ItemStack book = createEnchantedBook();
                    player.getInventory().addItem(book);
                    player.sendMessage("You have received the Elemental Artifacts Recipe Book.");
                    return true;
                } else {
                    sender.sendMessage("Player not found.");
                    return false;
                }
            } else {
                sender.sendMessage("Usage: /givebook <player>");
                return false;
            }
        }
        return false;
    }

    private ItemStack createEnchantedBook() {
        ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = book.getItemMeta();
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        meta.setDisplayName("Elemental Artifacts Recipe Book");
        book.setItemMeta(meta);
        return book;
    }
}
