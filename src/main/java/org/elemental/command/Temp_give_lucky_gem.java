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

public class Temp_give_lucky_gem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack LuvkyGem = new ItemStack(Material.EMERALD);
        ItemMeta LGM = LuvkyGem.getItemMeta();
        LGM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Lucky Gem" + ChatColor.DARK_AQUA + " [Item]");
        List<String> LGL = new ArrayList<>();
        LGL.add(ChatColor.DARK_GREEN + "5% Chance of obtaining a full diamond set!");
        LGL.add(ChatColor.DARK_GREEN + "10% Chance of obtaining a diamond block!");
        LGL.add(ChatColor.DARK_GREEN + "10% Chance of obtaining a god apple!");
        LGL.add(ChatColor.DARK_RED + "75% Chance of being forced to use binding armor!");
        LGL.add(ChatColor.DARK_RED + "This will reset any armor you have on! (Take armor off)");
        LGM.setLore(LGL);
        LuvkyGem.setItemMeta(LGM);

        player.getInventory().addItem(LuvkyGem);
        return true;
    }
}