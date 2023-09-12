package org.elemental.CustomRecipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ReaperAxe_Recipe {

    public final class ElementalArtifacts extends JavaPlugin implements Listener {
        @Override
        public void onEnable() {
                ItemStack shulker = new ItemStack(Material.SHULKER_BOX);
                ShapedRecipe shulkerRecipe = new ShapedRecipe(new NamespacedKey(this, "shulker_recipe"), shulker);
                shulkerRecipe.shape("DDD", "DCD", "DDD");
                shulkerRecipe.setIngredient('C', Material.CHEST);
                shulkerRecipe.setIngredient('D', Material.DIAMOND);
                Bukkit.addRecipe(shulkerRecipe);
            }
        }
    }