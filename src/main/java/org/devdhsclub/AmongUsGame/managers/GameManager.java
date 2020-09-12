package org.devdhsclub.AmongUsGame.managers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.devdhsclub.AmongUsGame.AmongUs;
import org.devdhsclub.AmongUsGame.runnables.DiscussionTimer;
import org.devdhsclub.AmongUsGame.runnables.SabotageTimer;
import org.devdhsclub.AmongUsGame.runnables.VotingTimer;
import org.devdhsclub.AmongUsGame.utils.Checkers;

/*/       ||     Made by Liam    ||      /*/

public class GameManager {
    
    private AmongUs plugin; // Make an instance of the main class to inherent its methods, variables, etc.
    private GameState gameState; // Each game has a game state.
    private Checkers checkers;
    private DiscussionTimer discussionTimer;
    private VotingTimer votingTimer;
    private SabotageTimer sabotageTimer;
    
    private int maxCrewmates;
    private int maxImposters;
    private int maxPlayers;
    private int killCooldown; // Integer for now
    private int emergencyMeetingCount; // The amount of emergency meetings that each player can use.
    private int emergencyMeetingCooldown;
    private int discussionTime;
    private int votingTime;
    private int playerSpeed;
    
    

    public AmongUs getPlugin() { return plugin; }
    

    
    public GameManager (AmongUs plugin, int maxCrewmates, int maxImposters){
        this.plugin = plugin;
        this.gameState = GameState.LOBBY;// By default (on initialization) it is the LOBBY gamestate.
        this.maxPlayers = maxCrewmates + maxImposters;
        this.discussionTimer = new DiscussionTimer(this);
        this.votingTimer = new VotingTimer(this);
        this.sabotageTimer = new SabotageTimer();
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
    
    // Getters & Setters

    public void setPlugin(AmongUs plugin) {this.plugin = plugin;}

    public int getMaxCrewmates() { return maxCrewmates; }
    public void setMaxCrewmates(int maxCrewmates) { this.maxCrewmates = maxCrewmates; }

    public int getMaxImposters() { return maxImposters; }
    public void setMaxImposters(int maxImposters) { this.maxImposters = maxImposters; }

    public int getKillCooldown() { return killCooldown; }
    public void setKillCooldown(int killCooldown) { this.killCooldown = killCooldown; }

    public int getEmergencyMeetingCount() { return emergencyMeetingCount; }
    public void setEmergencyMeetingCount(int emergencyMeetingCount) { this.emergencyMeetingCount = emergencyMeetingCount; }

    public int getEmergencyMeetingCooldown() { return emergencyMeetingCooldown; }

    public void setEmergencyMeetingCooldown(int emergencyMeetingCooldown) { this.emergencyMeetingCooldown = emergencyMeetingCooldown; }

    public int getMaxPlayers() { return maxPlayers; }
    public void setMaxPlayers(int maxPlayers) { this.maxPlayers = maxPlayers; }
    
    public int getDiscussionTime() { return discussionTime; }
    public void setDiscussionTime(int discussionTime) { this.discussionTime = discussionTime; }
    
    public int getVotingTime() { return votingTime; }
    public void setVotingTime(int votingTime) { this.votingTime = votingTime; }
    
    public int getPlayerSpeed() { return playerSpeed; }
    public void setPlayerSpeed(int playerSpeed) { this.playerSpeed = playerSpeed; }
    
    public Checkers getCheckers() { return checkers; }
    public void setCheckers(Checkers checkers) { this.checkers = checkers; }
}






