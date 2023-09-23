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
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class Temp_give_goldcoveredmeat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack goldcoveredmeat = new ItemStack(Material.COOKED_MUTTON);
        ItemMeta GCMM = goldcoveredmeat.getItemMeta();
        GCMM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Covered Meat" + ChatColor.DARK_AQUA + " [Food]");
        List<String> GCML = new ArrayList<>();
        GCML.add(ChatColor.GOLD + "Can be eaten instantly!");
        GCMM.setLore(GCML);
        GCMM.addEnchant(Enchantment.DURABILITY, 1, false);
        GCMM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        goldcoveredmeat.setItemMeta(GCMM);

        player.getInventory().addItem(goldcoveredmeat);
        return true;
    }
}