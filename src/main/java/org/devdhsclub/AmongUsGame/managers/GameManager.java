package org.devdhsclub.AmongUsGame.managers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.devdhsclub.AmongUsGame.AmongUs;

                    /*/       ||     Made by Liam    ||      /*/

public class GameManager {
    
    private AmongUs plugin; // Make an instance of the main class to inherent its methods, variables, etc.
    private GameState gameState; // Each game has a game state.
    private int maxCrewmates;
    private int maxImposters;
    private int killCooldown; // Integer for now
    private int emergencyMeetingCount; // The amount of emergency meetings that each player can use.
    private int emergencyMeetingCooldown;
    
    
    public GameManager (AmongUs plugin, int maxCrewmates, int maxImposters){
        this.plugin = plugin;
        this.gameState = GameState.LOBBY;// By default (on initialization) it is the LOBBY gamestate.
        
    }
    
    public GameState getGameState() { return gameState; }
    
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
        switch (gameState){
            case LOBBY:
                Bukkit.broadcastMessage(ChatColor.GREEN + "Lobby!");
                // Insert lobby logic here
                break;
            case QUEUE:
                // No
                Bukkit.broadcastMessage(ChatColor.GREEN + "Queue!");
                // Insert queue logic here
                break;
            case STARTING:
                Bukkit.broadcastMessage(ChatColor.GREEN + "Starting!");
                // Insert starting logic here
                break;
            case ACTIVE:
                Bukkit.broadcastMessage(ChatColor.GREEN + "Active!");
                // Insert active logic here
                break;
            case MEETING:
                Bukkit.broadcastMessage(ChatColor.GREEN + "Meeting!");
                // Insert normal meeting logic here
                break;
            case EMERGENCY:
                Bukkit.broadcastMessage(ChatColor.GREEN + "Emergency Meeting!");
                // Insert emergency meeting logic here
                break;
            case GOODWIN:
                Bukkit.broadcastMessage(ChatColor.GREEN + "The Crewmates Win!");
                // Insert crewmates-win logic here
                break;
            case BADWIN:
                Bukkit.broadcastMessage(ChatColor.GREEN + "The Imposters Win!");
                // Insert imposter-win logic here
                break;
            default:
                break;
        }
    }
    
}
