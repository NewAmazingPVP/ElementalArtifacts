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

public class Temp_give_god_potion implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack GodPot = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta GPM = GodPot.getItemMeta();
        GPM.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "God Potion" + ChatColor.DARK_AQUA + " [Potion]");
        List<String> GPL = new ArrayList<>();
        GPL.add(ChatColor.DARK_PURPLE + "Very OP potion" + ChatColor.BLUE + " [10min]");
        GPL.add(ChatColor.DARK_PURPLE + "+ Speed 2");
        GPL.add(ChatColor.DARK_PURPLE + "+ Strength 2");
        GPL.add(ChatColor.DARK_PURPLE + "+ Regeneration 3");
        GPL.add(ChatColor.DARK_PURPLE + "+ Absorption 5");
        GPL.add(ChatColor.DARK_PURPLE + "+ Resistance 1");
        GPM.setLore(GPL);
        GodPot.setItemMeta(GPM);

        player.getInventory().addItem(GodPot);
        return true;
    }
}