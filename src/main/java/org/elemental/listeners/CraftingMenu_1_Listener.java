package org.elemental.listeners;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CraftingMenu_1_Listener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Crafting Recipes")) {


            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Close") && event.getCurrentItem().getType() == Material.BARRIER) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                player.closeInventory();

            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Back") && event.getCurrentItem().getType() == Material.ARROW) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Guide = Bukkit.createInventory(player, 27, ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide");


                ItemStack G1 = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);


                ItemStack Class = new ItemStack(Material.END_CRYSTAL);
                ItemMeta Mclass = Class.getItemMeta();
                Mclass.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Class");
                Class.setItemMeta(Mclass);

                ItemStack R1 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta MR1 = R1.getItemMeta();
                MR1.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Crafting Recipes");
                R1.setItemMeta(MR1);

                ItemStack Info = new ItemStack(Material.PAPER);
                ItemMeta Minfo = Info.getItemMeta();
                Minfo.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Info");
                Minfo.addEnchant(Enchantment.DURABILITY, 1, false);
                Minfo.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                Info.setItemMeta(Minfo);

                ItemStack Skill = new ItemStack(Material.BEACON);
                ItemMeta MS = Skill.getItemMeta();
                MS.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Skill Points");
                Skill.setItemMeta(MS);

                ItemStack close = new ItemStack(Material.BARRIER);
                ItemMeta CM = close.getItemMeta();
                CM.setDisplayName(ChatColor.RED + "Close");
                close.setItemMeta(CM);


                Guide.setItem(0, G1);
                Guide.setItem(1, G1);
                Guide.setItem(2, G1);
                Guide.setItem(3, G1);
                Guide.setItem(4, G1);
                Guide.setItem(5, G1);
                Guide.setItem(6, G1);
                Guide.setItem(7, G1);
                Guide.setItem(8, Info);
                Guide.setItem(9, G1);
                Guide.setItem(10, G1);
                Guide.setItem(11, Class);
                Guide.setItem(12, G1);
                Guide.setItem(13, R1);
                Guide.setItem(14, G1);
                Guide.setItem(15, Skill);
                Guide.setItem(16, G1);
                Guide.setItem(17, G1);
                Guide.setItem(18, G1);
                Guide.setItem(19, G1);
                Guide.setItem(20, G1);
                Guide.setItem(21, G1);
                Guide.setItem(22, G1);
                Guide.setItem(23, G1);
                Guide.setItem(24, G1);
                Guide.setItem(25, G1);
                Guide.setItem(26, close);


                player.openInventory(Guide);


            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Armor") && event.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Armor = Bukkit.createInventory(player, 36, ChatColor.GREEN + "" + ChatColor.BOLD + "Armor Recipes");



                player.openInventory(Armor);

            }
            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Magic") && event.getCurrentItem().getType() == Material.STICK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Magic = Bukkit.createInventory(player, 36, ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Magic Recipes");



                player.openInventory(Magic);

            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Materials") && event.getCurrentItem().getType() == Material.NETHERITE_INGOT) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Materials = Bukkit.createInventory(player, 36, ChatColor.GOLD + "" + ChatColor.BOLD + "Materials Recipes");

                ItemStack Mixedeye = new ItemStack(Material.ENDER_EYE);
                ItemMeta MEYEM = Mixedeye.getItemMeta();
                MEYEM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]");
                List<String> MEM = new ArrayList<>();
                MEM.add(ChatColor.DARK_PURPLE + "Crafted from the Fear Mongerer Eye.");
                MEYEM.setLore(MEM);
                MEYEM.addEnchant(Enchantment.DURABILITY, 1, false);
                MEYEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                Mixedeye.setItemMeta(MEYEM);

                ItemStack G1 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
                ItemMeta M1 = G1.getItemMeta();
                M1.setDisplayName(" ");
                G1.setItemMeta(M1);

                ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta SI = compact.getItemMeta();
                SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot" + ChatColor.DARK_AQUA + " [Item]");
                SI.addEnchant(Enchantment.DURABILITY, 1, false);
                SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                compact.setItemMeta(SI);

                ItemStack compact2 = new ItemStack(Material.NETHERITE_BLOCK);
                ItemMeta SI2 = compact2.getItemMeta();
                SI2.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block" + ChatColor.DARK_AQUA + " [Item]");
                SI2.addEnchant(Enchantment.DURABILITY, 1, false);
                SI2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                compact2.setItemMeta(SI2);

                ItemStack fearmongerperl = new ItemStack(Material.ENDER_PEARL);
                ItemMeta FMPM = fearmongerperl.getItemMeta();
                FMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]");
                List<String> FML = new ArrayList<>();
                FML.add(ChatColor.DARK_PURPLE + "Obtained from killing Enderman!");
                FMPM.setLore(FML);
                FMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                FMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                fearmongerperl.setItemMeta(FMPM);

                ItemStack OreMixture = new ItemStack(Material.BONE_MEAL);
                ItemMeta OFMPM = OreMixture.getItemMeta();
                OFMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]");
                List<String> OML = new ArrayList<>();
                OML.add(ChatColor.DARK_PURPLE + "A mixture of a lot of ores.");
                OFMPM.setLore(OML);
                OFMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                OFMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                OreMixture.setItemMeta(OFMPM);

                ItemStack corruptedHandle = new ItemStack(Material.STICK);
                ItemMeta CHM = corruptedHandle.getItemMeta();
                CHM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Corrupted Handle" + ChatColor.DARK_AQUA + " [Item]");
                List<String> CHL = new ArrayList<>();
                CHL.add(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "curruptedtextlololol");
                CHM.setLore(CHL);
                CHM.addEnchant(Enchantment.DURABILITY, 1, false);
                CHM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                corruptedHandle.setItemMeta(CHM);

                ItemStack infusedlapis = new ItemStack(Material.LAPIS_LAZULI);
                ItemMeta ILM = infusedlapis.getItemMeta();
                ILM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Infused Lapis" + ChatColor.DARK_AQUA + " [Item]");
                List<String> ILL = new ArrayList<>();
                ILL.add(ChatColor.DARK_PURPLE + "Used to craft magical things.");
                ILM.setLore(ILL);
                ILM.addEnchant(Enchantment.DURABILITY, 1, false);
                ILM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                infusedlapis.setItemMeta(ILM);

                ItemStack Back = new ItemStack(Material.ARROW);
                ItemMeta BackM = Back.getItemMeta();
                BackM.setDisplayName(ChatColor.RED + "Back");
                Back.setItemMeta(BackM);

                ItemStack BottleOfLight = new ItemStack(Material.EXPERIENCE_BOTTLE);
                ItemMeta BOLM = BottleOfLight.getItemMeta();
                BOLM.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bottle Of Light" + ChatColor.DARK_AQUA + " [Item]");
                List<String> BOLL = new ArrayList<>();
                BOLL.add(ChatColor.DARK_GREEN + "Full of light.");
                BOLM.setLore(BOLL);
                BOLM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                BottleOfLight.setItemMeta(BOLM);



                Materials.setItem(0, G1);
                Materials.setItem(1, G1);
                Materials.setItem(2, G1);
                Materials.setItem(3, G1);
                Materials.setItem(4, G1);
                Materials.setItem(5, G1);
                Materials.setItem(6, G1);
                Materials.setItem(7, G1);
                Materials.setItem(8, G1);
                Materials.setItem(9, G1);
                Materials.setItem(10, Mixedeye);
                Materials.setItem(11, compact);
                Materials.setItem(12, compact2);
                Materials.setItem(13, BottleOfLight);
                Materials.setItem(14, OreMixture);
                Materials.setItem(15, corruptedHandle);
                Materials.setItem(16, infusedlapis);


                Materials.setItem(17, G1);
                Materials.setItem(18, G1);
                Materials.setItem(19, G1);
                Materials.setItem(20, G1);
                Materials.setItem(21, G1);
                Materials.setItem(22, G1);
                Materials.setItem(23, G1);
                Materials.setItem(24, G1);
                Materials.setItem(25, G1);
                Materials.setItem(26, G1);
                Materials.setItem(27, Back);
                Materials.setItem(28, G1);
                Materials.setItem(29, G1);
                Materials.setItem(30, G1);
                Materials.setItem(31, G1);
                Materials.setItem(32, G1);
                Materials.setItem(33, G1);
                Materials.setItem(34, G1);
                Materials.setItem(35, G1);

                player.openInventory(Materials);
            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "" + ChatColor.BOLD + "Miscellaneous") && event.getCurrentItem().getType() == Material.CLOCK) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Miscellaneous = Bukkit.createInventory(player, 36, ChatColor.AQUA + "" + ChatColor.BOLD + "Miscellaneous Recipes");


                player.openInventory(Miscellaneous);
            }

            if (event.getCurrentItem().getDisplayName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "Weapons") && event.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                Player player = (Player) event.getView().getPlayer();
                player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                Inventory Weapons = Bukkit.createInventory(player, 36, ChatColor.RED + "" + ChatColor.BOLD + "Weapons Recipes");


                player.openInventory(Weapons);
            }
            event.setCancelled(true);

        }
    }
}

