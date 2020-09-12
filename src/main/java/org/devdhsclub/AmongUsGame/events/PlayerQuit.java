package org.devdhsclub.AmongUsGame.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    
    @EventHandler
    public void PlayerQuit (PlayerQuitEvent e){
        Player p = e.getPlayer();
        // insert Player Quit logic here
    }
    
}

















