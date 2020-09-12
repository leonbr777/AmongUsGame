package org.devdhsclub.AmongUsGame.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.devdhsclub.AmongUsGame.AmongUs;

// tubez
public class Utilities { // This is to keep common methods inside the class so the code is not messy
    
    public String colorize(String message) { // Takes the input string and returns it colored
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    
    public String colorizeFromConfig(String path) {
        return colorize(AmongUs.instance.getConfig().get(path).toString());
    }

    public void colorizeToPlayer(Player player, String message) { // Takes the input message and sends it directly to the player
        player.sendMessage(colorize(message));
    }
    
    
}
