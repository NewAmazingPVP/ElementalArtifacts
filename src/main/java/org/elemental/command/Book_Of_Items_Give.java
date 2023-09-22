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

public class Book_Of_Items_Give implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack teamsel = new ItemStack(Material.BOOK);
        ItemMeta SI = teamsel.getItemMeta();
        SI.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Book Of Items");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.DARK_RED + "This Is A Admin Item!");
        SI.setLore(DEFL);
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        teamsel.setItemMeta(SI);


        player.getInventory().addItem(teamsel);
        player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 1.0f);
        return true;
    }
}