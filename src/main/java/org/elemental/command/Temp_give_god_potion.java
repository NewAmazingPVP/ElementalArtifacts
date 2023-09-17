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
        GPL.add(ChatColor.DARK_PURPLE + "+ Absorption 4");
        GPL.add(ChatColor.DARK_PURPLE + "+ Resistance 2");
        GPM.setLore(GPL);
        SkullMeta skullMeta = (SkullMeta) GPM;
        skullMeta.setOwner("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTAzMjdmYjM0MzE5Zjg5YWM1YWI0OGI0ZDc5MjUxZjEzZjA2N2ViZWE3ZGE1Zjg4Yjc1ZjQ3OWE3Mzg5OTI0ZSJ9fX0"); // Replace "MHF_CustomHead" with the desired custom head ID
        GodPot.setItemMeta(skullMeta);
        GodPot.setItemMeta(GPM);

        player.getInventory().addItem(GodPot);
        return true;
    }
}