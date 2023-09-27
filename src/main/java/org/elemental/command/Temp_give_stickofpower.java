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

public class Temp_give_stickofpower implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack StickOfPower  = new ItemStack(Material.STICK);
        ItemMeta SOPM = StickOfPower.getItemMeta();
        SOPM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Montu's Staff" + ChatColor.DARK_AQUA + " [Wand]");
        List<String> SOPL = new ArrayList<>();
        SOPL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click");
        SOPL.add(ChatColor.GREEN + "Spawn a sonic wave that will");
        SOPL.add(ChatColor.GREEN + "damage any mob in its range" + ChatColor.RED + " (3♥)");
        SOPL.add(ChatColor.BLUE + "+2 damage if you have full lapis armor on!");
        SOPM.setLore(SOPL);
        SOPM.addEnchant(Enchantment.DURABILITY, 1, false);
        SOPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        StickOfPower.setItemMeta(SOPM);

        player.getInventory().addItem(StickOfPower);
        return true;
    }
}