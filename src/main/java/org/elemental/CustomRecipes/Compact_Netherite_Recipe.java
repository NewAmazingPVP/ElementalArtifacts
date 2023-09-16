package org.elemental.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

import static org.elemental.ElementalArtifacts.elementalArtifacts;

public class Compact_Netherite_Recipe {


    public static void registerCustomRecipes() {
        ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);


        ItemMeta SI = compact.getItemMeta();
        SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot");
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        compact.setItemMeta(SI);

        ShapedRecipe shulkerRecipe = new ShapedRecipe(new NamespacedKey(elementalArtifacts, "shulker_recipe"), compact);
        shulkerRecipe.shape("DDD", "DDD", "DDD");
        shulkerRecipe.setIngredient('D', Material.NETHERITE_INGOT,2);
        Bukkit.addRecipe(shulkerRecipe);

    }
}