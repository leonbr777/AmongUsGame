package org.devdhsclub.AmongUsGame.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.devdhsclub.AmongUsGame.AmongUs;

public class GameCommand implements CommandExecutor {
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if (cmd.getName().equalsIgnoreCase("amongus")){
            if (!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED + "Player-only command!");
                return true;
            }
            Player p = (Player) sender;
            switch (args.length){
                case 0:
                    AmongUs.instance.gameCreateGUI.gui();
                    p.openInventory(AmongUs.instance.gameCreateGUI.getFirstPageInv());
                    return true;
                default:
                    break;
            }
            // Open GUI
            // Insert command logic here
        }
        
        return false;
    }
}
