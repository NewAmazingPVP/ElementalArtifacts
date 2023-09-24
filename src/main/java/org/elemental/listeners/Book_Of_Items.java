package org.elemental.listeners;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
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
                    WDEFL.add(ChatColor.RED + "If there is a block within 15 blocks");
                    WDEFL.add(ChatColor.RED + "of where you want to teleport, it will fail!");
                    WDEFL.add(ChatColor.YELLOW + "5sec Cooldown!");
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
                    FML.add(ChatColor.DARK_PURPLE + "Obtained from killing the Fear Mongerer!" + ChatColor.DARK_RED + "ITEM NOT DONE");
                    FMPM.setLore(FML);
                    FMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                    FMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    fearmongerperl.setItemMeta(FMPM);

                    ItemStack OreMixture = new ItemStack(Material.BONE_MEAL);
                    ItemMeta OFMPM = OreMixture.getItemMeta();
                    OFMPM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Ore Mixture" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> OML = new ArrayList<>();
                    OML.add(ChatColor.DARK_PURPLE + "A mixture of a lot of ores." + ChatColor.DARK_RED + "ITEM NOT DONE");
                    OFMPM.setLore(OML);
                    OFMPM.addEnchant(Enchantment.DURABILITY, 1, false);
                    OFMPM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    OreMixture.setItemMeta(OFMPM);

                    ItemStack Mixedeye = new ItemStack(Material.ENDER_EYE);
                    ItemMeta MEYEM = Mixedeye.getItemMeta();
                    MEYEM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Mixed Eye" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> MEM = new ArrayList<>();
                    MEM.add(ChatColor.DARK_PURPLE + "Crafted from the Fear Mongerer Eye." + ChatColor.DARK_RED + "ITEM NOT DONE");
                    MEYEM.setLore(MEM);
                    MEYEM.addEnchant(Enchantment.DURABILITY, 1, false);
                    MEYEM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    Mixedeye.setItemMeta(MEYEM);

                    ItemStack corruptedHandle = new ItemStack(Material.STICK);
                    ItemMeta CHM = corruptedHandle.getItemMeta();
                    CHM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Corrupted Handle" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> CHL = new ArrayList<>();
                    CHL.add(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "curruptedtextlololol" + ChatColor.DARK_RED + "ITEM NOT DONE");
                    CHM.setLore(CHL);
                    CHM.addEnchant(Enchantment.DURABILITY, 1, false);
                    CHM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    corruptedHandle.setItemMeta(CHM);

                    ItemStack infusedlapis = new ItemStack(Material.LAPIS_LAZULI);
                    ItemMeta ILM = infusedlapis.getItemMeta();
                    ILM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Infused Lapis" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> ILL = new ArrayList<>();
                    ILL.add(ChatColor.DARK_PURPLE + "Used to craft magical things." + ChatColor.DARK_RED + "ITEM NOT DONE");
                    ILM.setLore(ILL);
                    ILM.addEnchant(Enchantment.DURABILITY, 1, false);
                    ILM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    infusedlapis.setItemMeta(ILM);

                    ItemStack GodPot = new ItemStack(Material.HONEY_BOTTLE);
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
                    GodPot.setItemMeta(GPM);


                    ItemStack LuvkyGem = new ItemStack(Material.EMERALD);
                    ItemMeta LGM = LuvkyGem.getItemMeta();
                    LGM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Lucky Gem" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> LGL = new ArrayList<>();
                    LGL.add(ChatColor.DARK_GREEN + "5% Chance of obtaining a full diamond set!");
                    LGL.add(ChatColor.DARK_GREEN + "10% Chance of obtaining a diamond block!");
                    LGL.add(ChatColor.DARK_GREEN + "10% Chance of obtaining a god apple!");
                    LGL.add(ChatColor.DARK_RED + "75% Chance of being forced to use binding armor!");
                    LGL.add(ChatColor.DARK_RED + "This will reset any armor you have on! (Take armor off)");
                    LGM.setLore(LGL);
                    LuvkyGem.setItemMeta(LGM);

                    ItemStack LowLevelLightSword = new ItemStack(Material.WOODEN_SWORD);
                    ItemMeta LLLS = LowLevelLightSword.getItemMeta();
                    LLLS.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Low Level Light Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> LLLL = new ArrayList<>();
                    LLLL.add(ChatColor.DARK_RED + "Level 1/5");
                    LLLL.add(ChatColor.DARK_GREEN + "Can be leveled up!");
                    LLLS.setLore(LLLL);
                    LLLS.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    LowLevelLightSword.setItemMeta(LLLS);

                    ItemStack WeakLevelLightSword = new ItemStack(Material.IRON_SWORD);
                    ItemMeta WLLS = WeakLevelLightSword.getItemMeta();
                    WLLS.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Weak Level Light Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> WLLL = new ArrayList<>();
                    WLLL.add(ChatColor.RED + "Level 2/5");
                    WLLL.add(ChatColor.DARK_GREEN + "Can be leveled up!");
                    WLLL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GREEN + " Heal 1HP");
                    WLLL.add(ChatColor.RED + "30sec Cooldown");
                    WLLS.setLore(WLLL);
                    WLLS.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    WeakLevelLightSword.setItemMeta(WLLS);

                    ItemStack StrongerLevelLightSword = new ItemStack(Material.GOLDEN_SWORD);
                    ItemMeta SLLS = StrongerLevelLightSword.getItemMeta();
                    SLLS.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Stronger Level Light Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> SLLL = new ArrayList<>();
                    SLLL.add(ChatColor.YELLOW + "Level 3/5");
                    SLLL.add(ChatColor.DARK_GREEN + "Can be leveled up!");
                    SLLL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GREEN + " Heal 5HP");
                    SLLL.add(ChatColor.RED + "30sec Cooldown");
                    SLLS.setLore(SLLL);
                    SLLS.setUnbreakable(true);
                    SLLS.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    StrongerLevelLightSword.setItemMeta(SLLS);

                    ItemStack StrongLevelLightSword = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta SSLLS = StrongerLevelLightSword.getItemMeta();
                    SSLLS.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Strong Level Light Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> SSLLL = new ArrayList<>();
                    SSLLL.add(ChatColor.GREEN + "Level 4/5");
                    SSLLL.add(ChatColor.DARK_GREEN + "Can be leveled up!");
                    SSLLL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GREEN + " Heal 10HP");
                    SSLLL.add(ChatColor.RED + "20sec Cooldown");
                    SSLLS.setLore(SSLLL);
                    SSLLS.setUnbreakable(true);
                    SSLLS.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    StrongLevelLightSword.setItemMeta(SSLLS);

                    ItemStack EliteLevelLightSword = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta ELLS = EliteLevelLightSword.getItemMeta();
                    ELLS.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Elite Level Light Sword" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> ELLL = new ArrayList<>();
                    ELLL.add(ChatColor.DARK_GREEN + "Level 5/5");
                    ELLL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "MAX LEVEL!");
                    ELLL.add(ChatColor.YELLOW + "" + ChatColor.BOLD + "Right Click" + ChatColor.GREEN + " Heal 10HP");
                    ELLL.add(ChatColor.GREEN + " Deal 5 damage to all things around you in a 10 block radius!");
                    ELLL.add(ChatColor.RED + "20sec Cooldown");
                    ELLS.setLore(ELLL);
                    ELLS.setUnbreakable(true);
                    ELLS.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    EliteLevelLightSword.setItemMeta(ELLS);

                    ItemStack LapisArmor = new ItemStack(Material.LEATHER_CHESTPLATE);
                    LeatherArmorMeta LAM = (LeatherArmorMeta) LapisArmor.getItemMeta();
                    LAM.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Lapis Armor" + ChatColor.DARK_AQUA + " [Armor]");
                    List<String> LAL = new ArrayList<>();
                    LAL.add(ChatColor.DARK_GREEN + "Gives jump boost!");
                    LAM.setLore(LAL);
                    LAM.setUnbreakable(true);
                    LAM.addItemFlags(ItemFlag.HIDE_DYE);
                    LAM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    LAM.setColor(Color.fromRGB(0, 0, 255));
                    LapisArmor.setItemMeta(LAM);

                    ItemStack BottleOfLight = new ItemStack(Material.EXPERIENCE_BOTTLE);
                    ItemMeta BOLM = BottleOfLight.getItemMeta();
                    BOLM.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bottle Of Light" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> BOLL = new ArrayList<>();
                    BOLL.add(ChatColor.DARK_GREEN + "Full of light.");
                    BOLM.setLore(BOLL);
                    BOLM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    BottleOfLight.setItemMeta(BOLM);

                    ItemStack ReaperSoul = new ItemStack(Material.CHARCOAL);
                    ItemMeta RSM = ReaperSoul.getItemMeta();
                    RSM.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Reaper Soul" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> RSL = new ArrayList<>();
                    RSL.add(ChatColor.DARK_RED + "Obtained by sacrificing 4 people!");
                    RSM.setLore(RSL);
                    RSM.addEnchant(Enchantment.DURABILITY, 1, false);
                    RSM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    ReaperSoul.setItemMeta(RSM);

                    ItemStack goldcoveredmeat = new ItemStack(Material.COOKED_MUTTON);
                    ItemMeta GCMM = goldcoveredmeat.getItemMeta();
                    GCMM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Covered Meat" + ChatColor.DARK_AQUA + " [Food]");
                    List<String> GCML = new ArrayList<>();
                    GCML.add(ChatColor.GOLD + "Can be eaten instantly!");
                    GCMM.setLore(GCML);
                    GCMM.addEnchant(Enchantment.DURABILITY, 1, false);
                    GCMM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    goldcoveredmeat.setItemMeta(GCMM);

                    ItemStack SacrificingAxe = new ItemStack(Material.DIAMOND_AXE);
                    ItemMeta SAM = SacrificingAxe.getItemMeta();
                    SAM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sacrificing Axe" + ChatColor.DARK_AQUA + " [Sword]");
                    List<String> SALLL = new ArrayList<>();
                    SALLL.add(ChatColor.DARK_RED + "Obtained by sacrificing 4 people into lava!");
                    SALLL.add(ChatColor.RED + "1- Get sacrificing armor to use");
                    SALLL.add(ChatColor.RED + "2- Get sacrificing victim armor on everyone you are scaerficeing");
                    SALLL.add(ChatColor.RED + "(Armor costs a lot and will be deleted!)");
                    SALLL.add(ChatColor.RED + "3- Use the sacrificing axe anf go f**king Aztec on them, and behead them!");
                    SALLL.add(ChatColor.DARK_GREEN + "After this you will get the Reaper Soul");
                    SALLL.add(ChatColor.DARK_GREEN + "Yes... this is hard to get but it will give a OP item");
                    SAM.setLore(SALLL);
                    SAM.setUnbreakable(true);
                    SAM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    SacrificingAxe.setItemMeta(SAM);


                    ItemStack MoreToCome = new ItemStack(Material.GRAY_DYE);
                    ItemMeta MTC = MoreToCome.getItemMeta();
                    MTC.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + ">>> More To Come <<<");
                    MoreToCome.setItemMeta(MTC);

                    ItemStack sextoy = new ItemStack(Material.END_ROD);
                    ItemMeta STM = sextoy.getItemMeta();
                    STM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sex Toy" + ChatColor.DARK_AQUA + " [Item]");
                    List<String> STL = new ArrayList<>();
                    STL.add(ChatColor.GOLD + ";]");
                    STM.setLore(STL);
                    STM.addEnchant(Enchantment.DURABILITY, 1, false);
                    STM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    sextoy.setItemMeta(STM);


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
                    Guide.setItem(28, GodPot);
                    Guide.setItem(29, LuvkyGem);
                    Guide.setItem(30, LowLevelLightSword);
                    Guide.setItem(31, WeakLevelLightSword);
                    Guide.setItem(32, StrongerLevelLightSword);
                    Guide.setItem(33, StrongLevelLightSword);
                    Guide.setItem(34, EliteLevelLightSword);
                    Guide.setItem(37, LapisArmor);
                    Guide.setItem(38, BottleOfLight);
                    Guide.setItem(39, ReaperSoul);
                    Guide.setItem(40, goldcoveredmeat);
                    Guide.setItem(41, SacrificingAxe);
                    Guide.setItem(42, MoreToCome);


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
