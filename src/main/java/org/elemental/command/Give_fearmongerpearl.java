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

public class Give_fearmongerpearl implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack fearmongerperl = new ItemStack(Material.ENDER_PEARL);
        ItemMeta FMPM = fearmongerperl.getItemMeta();
        FMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]");
        List<String> FML = new ArrayList<>();
        FML.add(ChatColor.DARK_PURPLE + "Obtained from killing the Fear Mongerer!");
        FMPM.setLore(FML);
        FMPM.addEnchant(Enchantment.DURABILITY, 1, false);
        FMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fearmongerperl.setItemMeta(FMPM);

        player.getInventory().addItem(fearmongerperl);
        return true;
    }
}