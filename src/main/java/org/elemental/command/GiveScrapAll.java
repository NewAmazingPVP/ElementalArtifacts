package org.elemental.command;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.elemental.variables.PremadeItems.*;

public class GiveScrapAll implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;

        player.getInventory().addItem(low_level_scrap());


        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 2.0f, 0.0f);
        return true;

    }
}
