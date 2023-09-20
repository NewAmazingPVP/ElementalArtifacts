package org.elemental.command;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class Test_Jail_Player implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Usage: /set prisoner <player>");
            return true;
        }

        String playerName = args[0];
        Player player = Bukkit.getPlayerExact(playerName);
        if (player == null) {
            sender.sendMessage("Player not found.");
            return true;
        }

        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        if (scoreboardManager == null) {
            sender.sendMessage("Scoreboard manager not available.");
            return true;
        }

        Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
        Team team = scoreboard.getTeam("prisoner");
        if (team == null) {
            team = scoreboard.registerNewTeam("prisoner");
        }

        team.setColor(ChatColor.GOLD);
        team.setPrefix("[Prisoner] ");
        team.addEntry(player.getName());

        sender.sendMessage(ChatColor.GOLD + playerName + " is now a prisoner !.");
        return true;
    }
}