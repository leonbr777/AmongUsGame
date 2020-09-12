package org.devdhsclub.AmongUsGame.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryInteractEvent;

public class InventoryInteract implements Listener {
    
    @EventHandler
    public void invInteract (InventoryInteractEvent e){
        if (!(e.getWhoClicked() instanceof Player)){
            return;
        }
        // Insert Inventory-Interact logic here
        return;
    }
    
}
