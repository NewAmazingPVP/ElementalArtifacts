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

public class Temp_give_bindingarmor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta BSI = boots.getItemMeta();
        BSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Boots" + ChatColor.DARK_AQUA + " [Armor]");
        List<String> BL = new ArrayList<>();
        BL.add(ChatColor.RED + "It can only come off if you Die!");
        BSI.setLore(BL);
        BSI.addEnchant(Enchantment.BINDING_CURSE, 1, false);
        BSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        BSI.setUnbreakable(true);
        BSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        boots.setItemMeta(BSI);

        player.getInventory().addItem(boots);
        return true;
    }
}