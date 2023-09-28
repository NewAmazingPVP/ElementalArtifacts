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
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click");
        SOPL.add(ChatColor.GREEN + "Spawn a sonic wave that will");
        SOPL.add(ChatColor.GREEN + "damage any mob in its range!" + ChatColor.RED + " 3❤");
        SOPL.add(ChatColor.BLUE + "+2 damage if you have full lapis armor on!");
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Shift Right Click");
        SOPL.add(ChatColor.GREEN + "Warp 5 blocks where you are looking!");
        SOPL.add(ChatColor.BLUE + "+1 range if you have full lapis armor on!");
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Left Click");
        SOPL.add(ChatColor.GREEN + "Shoots a beam 6 blocks out that deals damage!" + ChatColor.RED + " 1❤");
        SOPL.add(ChatColor.BLUE + "+.5 damage if you have lapis armor on!");
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Shift Left Click");
        SOPL.add(ChatColor.RED + "I need ideas...");
        SOPL.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "-------------------------------------");
        SOPM.setLore(SOPL);
        SOPM.addEnchant(Enchantment.DURABILITY, 1, false);
        SOPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        StickOfPower.setItemMeta(SOPM);

        player.getInventory().addItem(StickOfPower);
        return true;
    }
}