package org.devdhsclub.AmongUsGame.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import sun.awt.OSInfo;

import java.util.Arrays;
import java.util.List;

public class GameCreateGUI {

    private Inventory firstPageInv;
    
    public Inventory getFirstPageInv() { return firstPageInv; }
    
    public void gui(){
    
        firstPageInv = Bukkit.createInventory(null, 54, "Create game");
        
        ItemStack borderItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack decreaseItem = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack increaseItem = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemStack settingIncrementItem = new ItemStack(Material.YELLOW_CONCRETE);
        ItemStack settingToggleItem = new ItemStack(Material.RED_CONCRETE);
        ItemStack pageItem = new ItemStack(Material.BOOK);
        
        List<ItemStack> items = Arrays.asList(borderItem, decreaseItem, increaseItem); // A list of all the items that do not need lore.
        
        for (ItemStack item : items){ // This loop removes all lore/text from the item.
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(" ");
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
            meta.addItemFlags(ItemFlag.HIDE_DYE);
            meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
            item.setItemMeta(meta);
        }
        
        // Border slots
        for (int i = 0; i < 54; i++){
            firstPageInv.setItem(i, borderItem);
        }
        
        // Decrement slots (Red-Stained Glass Pane)
        firstPageInv.setItem(3, decreaseItem);
        for (int i = 9; i < 54; i+=18){
            firstPageInv.setItem(i, decreaseItem);
        }
        for (int i = 15; i < 54; i+=18){
            firstPageInv.setItem(i, decreaseItem);
        }
        
        // Increase slots (Lime-Stained Glass Pane)
        firstPageInv.setItem(5, increaseItem);
        firstPageInv.setItem(11, increaseItem);
        firstPageInv.setItem(17, increaseItem);
        firstPageInv.setItem(29, increaseItem);
        firstPageInv.setItem(35, increaseItem);
        firstPageInv.setItem(47, increaseItem);
        firstPageInv.setItem(53, increaseItem);
        
        // Settings-increaseItem slots (Yellow Concrete)
        for (int i = 10; i <= 46; i+=18){
            firstPageInv.setItem(i, settingIncrementItem);
        }
        for (int i = 16; i <= 52; i+=18){
            firstPageInv.setItem(i, settingIncrementItem);
        }
        
        // Settings-toggle slots (Red Concrete)
        firstPageInv.setItem(13, settingToggleItem);
        firstPageInv.setItem(31, settingToggleItem);
        firstPageInv.setItem(49, settingToggleItem);
        
        // Next Page slots (Book)
        firstPageInv.setItem(4, pageItem);
    }

}
