package org.devdhsclub.AmongUsGame.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameCommand implements CommandExecutor {
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if (cmd.getName().equalsIgnoreCase("au")){
            if (!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED + "Player-only command!");
                return true;
            }
            Player p = (Player) sender;
            // Insert command logic here
        }
        
        return false;
    }
}
