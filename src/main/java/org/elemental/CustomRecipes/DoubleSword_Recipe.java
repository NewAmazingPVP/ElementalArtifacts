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

public class DoubleSword_Recipe {


    public static void registerCustomRecipesdouble() {
        ItemStack stick = new ItemStack(Material.STICK);
        ItemStack air = new ItemStack(Material.AIR);
        ItemStack Oakplank = new ItemStack(Material.OAK_PLANKS);

        ItemStack teamsel = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta SSI = teamsel.getItemMeta();
        SSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Double-Edged Sword" + ChatColor.DARK_AQUA + " [Sword]");
        List<String> DEFL = new ArrayList<>();
        DEFL.add(ChatColor.RED + "Just don't use this...");
        SSI.setLore(DEFL);
        SSI.setUnbreakable(true);
        SSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        teamsel.setItemMeta(SSI);


        ShapedRecipe AshulkerRecipe = new ShapedRecipe(new NamespacedKey(elementalArtifacts, "111shulker_recipe"), teamsel);
        AshulkerRecipe.shape("XSX", "XWX", "XWX");
        AshulkerRecipe.setIngredient('S', Material.STICK);
        AshulkerRecipe.setIngredient('W', Material.OAK_PLANKS);
        AshulkerRecipe.setIngredient('X', Material.AIR);
        Bukkit.addRecipe(AshulkerRecipe);

    }
}