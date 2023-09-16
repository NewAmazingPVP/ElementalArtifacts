package org.elemental.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import static org.elemental.ElementalArtifacts.elementalArtifacts;

public class Compact_Netherite_Block_Recipe {


    public void registerCustomRecipes() {
        ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta SI = compact.getItemMeta();
        SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot");
        SI.addEnchant(Enchantment.DURABILITY, 1, false);
        SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        compact.setItemMeta(SI);


        NamespacedKey customRecipeKey = new NamespacedKey(elementalArtifacts, "shulkerRecipe2");
        ShapedRecipe shulkerRecipe2 = new ShapedRecipe(customRecipeKey, createCompactNetheriteBlock());
        shulkerRecipe2.shape("DDD", "DDD", "DDD");
        shulkerRecipe2.setIngredient('D', compact);
        Bukkit.addRecipe(shulkerRecipe2);
    }

    private ItemStack createCompactNetheriteBlock() {
        ItemStack compact2 = new ItemStack(Material.NETHERITE_BLOCK);
        ItemMeta SI2 = compact2.getItemMeta();
        SI2.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block");
        SI2.addEnchant(Enchantment.DURABILITY, 1, false);
        SI2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        compact2.setItemMeta(SI2);
        return compact2;
    }
}
