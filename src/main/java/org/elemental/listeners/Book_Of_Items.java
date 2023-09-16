package org.elemental.listeners;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book_Of_Items implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = event.getItem();
            if (item != null && item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                if (meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Book Of Items")) {
                    Player p = event.getPlayer();
                    player.playSound(player.getLocation(), "minecraft:block.enchantment_table.use", 1.0f, 2.0f);
                    player.getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 10, 0.6, 0.6, 0.6, new Particle.DustOptions(Color.ORANGE, 3));
                    Inventory Guide = Bukkit.createInventory(p, 54, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Item Menu");


                    ItemStack G1 = new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE);
                    ItemMeta M1 = G1.getItemMeta();
                    M1.setDisplayName(" ");
                    G1.setItemMeta(M1);

                    ItemStack guide = new ItemStack(Material.BOOK);
                    ItemMeta GI = guide.getItemMeta();
                    GI.addEnchant(Enchantment.DURABILITY, 1, false);
                    GI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    GI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Elemental Artifacts Guide");
                    guide.setItemMeta(GI);

                    ItemStack Items = new ItemStack(Material.BOOK);
                    ItemMeta II = Items.getItemMeta();
                    II.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Book Of Items");
                    List<String> IEFL = new ArrayList<>();
                    IEFL.add(ChatColor.DARK_RED + "This Is A Admin Item!");
                    II.setLore(IEFL);
                    II.addEnchant(Enchantment.DURABILITY, 1, false);
                    II.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    Items.setItemMeta(II);

                    ItemStack Behead = new ItemStack(Material.NETHERITE_AXE);
                    ItemMeta BSI = Behead.getItemMeta();
                    BSI.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Beheading Axe" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> BDEFL = new ArrayList<>();
                    BDEFL.add(ChatColor.RED + "Use this to show your power and execute people");
                    BDEFL.add(ChatColor.RED + "to keep there heads or something idk...");
                    BDEFL.add(ChatColor.DARK_RED + "lol.....");
                    BSI.setLore(BDEFL);
                    BSI.setUnbreakable(true);
                    BSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    Behead.setItemMeta(BSI);

                    ItemStack port = new ItemStack(Material.CRAFTING_TABLE);
                    ItemMeta PSI = port.getItemMeta();
                    PSI.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Portable Crafting Table" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> PDEFL = new ArrayList<>();
                    PDEFL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GOLD + " To open!");
                    PSI.setLore(PDEFL);
                    PSI.addEnchant(Enchantment.DURABILITY, 1, false);
                    PSI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    PSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    port.setItemMeta(PSI);

                    ItemStack warp = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta WSI = warp.getItemMeta();
                    WSI.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Warp Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> WDEFL = new ArrayList<>();
                    WDEFL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GOLD + " To Warp 15 Blocks!");
                    WDEFL.add(ChatColor.RED + "If there is a block within 15 blocks of where you want to teleport, it will fail!");
                    WSI.setLore(WDEFL);
                    WSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    WSI.setUnbreakable(true);
                    warp.setItemMeta(WSI);

                    ItemStack dsword = new ItemStack(Material.WOODEN_SWORD);
                    ItemMeta DSI = dsword.getItemMeta();
                    DSI.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Double-Edged Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> DDEFL = new ArrayList<>();
                    DDEFL.add(ChatColor.RED + "Just don't use this...");
                    DSI.setLore(DDEFL);
                    DSI.setUnbreakable(true);
                    DSI.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    dsword.setItemMeta(DSI);

                    ItemStack compact = new ItemStack(Material.NETHERITE_INGOT);
                    ItemMeta SI = compact.getItemMeta();
                    SI.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Ingot");
                    SI.addEnchant(Enchantment.DURABILITY, 1, false);
                    SI.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    compact.setItemMeta(SI);

                    ItemStack compact2 = new ItemStack(Material.NETHERITE_BLOCK);
                    ItemMeta SI2 = compact2.getItemMeta();
                    SI2.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Compact Netherite Block");
                    SI2.addEnchant(Enchantment.DURABILITY, 1, false);
                    SI2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    compact2.setItemMeta(SI2);

                    ItemStack bindingchest = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta BIM = bindingchest.getItemMeta();
                    BIM.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Binding Armor Set" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> BAL = new ArrayList<>();
                    BAL.add(ChatColor.RED + "It can only come off if you Die!");
                    BIM.setLore(BAL);
                    BIM.addEnchant(Enchantment.BINDING_CURSE, 1, false);
                    BIM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    BIM.setUnbreakable(true);
                    BIM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    bindingchest.setItemMeta(BIM);

                    ItemStack fearmongerperl = new ItemStack(Material.ENDER_PEARL);
                    ItemMeta FMPM = fearmongerperl.getItemMeta();
                    FMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Fear Mongerer Pearl" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> FML = new ArrayList<>();
                    FML.add(ChatColor.DARK_PURPLE + "Obtained from killing the Fear Mongerer!");
                    FMPM.setLore(FML);
                    FMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                    FMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    fearmongerperl.setItemMeta(FMPM);

                    ItemStack OreMixture = new ItemStack(Material.PLAYER_HEAD);
                    ItemMeta OFMPM = OreMixture.getItemMeta();
                    OFMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> OML = new ArrayList<>();
                    OML.add(ChatColor.DARK_PURPLE + "A mixture of a lot of ores.");
                    OFMPM.setLore(OML);
                    OFMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                    OFMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    OreMixture.setItemMeta(OFMPM);

                    ItemStack Mixedeye = new ItemStack(Material.ENDER_EYE);
                    ItemMeta MEYEM = Mixedeye.getItemMeta();
                    MEYEM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> MEM = new ArrayList<>();
                    MEM.add(ChatColor.DARK_PURPLE + "Crafted from the Fear Mongerer Eye.");
                    MEYEM.setLore(MEM);
                    MEYEM.addEnchant(Enchantment.DURABILITY, 1, false);
                    MEYEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    Mixedeye.setItemMeta(MEYEM);

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

                    Guide.setItem(0, G1);
                    Guide.setItem(1, G1);
                    Guide.setItem(2, G1);
                    Guide.setItem(3, G1);
                    Guide.setItem(4, G1);
                    Guide.setItem(5, G1);
                    Guide.setItem(6, G1);
                    Guide.setItem(7, G1);
                    Guide.setItem(8, G1);
                    Guide.setItem(9, G1);

                    Guide.setItem(10, guide);
                    Guide.setItem(11, Items);
                    Guide.setItem(12, Behead);
                    Guide.setItem(13, port);
                    Guide.setItem(14, warp);
                    Guide.setItem(15, dsword);
                    Guide.setItem(16, compact);
                    Guide.setItem(19, compact2);
                    Guide.setItem(20, bindingchest);
                    Guide.setItem(21, fearmongerperl);
                    Guide.setItem(22, OreMixture);
                    Guide.setItem(23, Mixedeye);
                    Guide.setItem(24, corruptedHandle);
                    Guide.setItem(25, infusedlapis);

                    Guide.setItem(18, G1);
                    Guide.setItem(27, G1);
                    Guide.setItem(36, G1);
                    Guide.setItem(17, G1);
                    Guide.setItem(26, G1);
                    Guide.setItem(0, G1);
                    Guide.setItem(35, G1);
                    Guide.setItem(44, G1);
                    Guide.setItem(45, G1);
                    Guide.setItem(46, G1);
                    Guide.setItem(47, G1);
                    Guide.setItem(48, G1);
                    Guide.setItem(49, G1);
                    Guide.setItem(50, G1);
                    Guide.setItem(51, G1);
                    Guide.setItem(52, G1);
                    Guide.setItem(53, G1);


                    p.openInventory(Guide);
                }
            }
        }
    }
}