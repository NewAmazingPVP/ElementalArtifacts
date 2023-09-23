package org.elemental.command;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Netherite_Leather_XD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by players.");
            return true;
        }

        Player player = (Player) sender;

        // Create the leather armor item
        ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);

        // Set the attributes of the armor to match Netherite armor
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 20.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        ItemMeta armorMeta = armor.getItemMeta();
        armorMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        armor.setItemMeta(armorMeta);

        // Give the armor to the player
        player.getInventory().addItem(armor);

        sender.sendMessage("You have received leather armor with the stats of Netherite armor.");
        return true;
    }
}
