package org.devdhsclub.AmongUsGame;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.devdhsclub.AmongUsGame.commands.GameCommand;
import org.devdhsclub.AmongUsGame.events.BadKill;
import org.devdhsclub.AmongUsGame.events.GoodDeath;
import org.devdhsclub.AmongUsGame.events.PlayerJoin;
import org.devdhsclub.AmongUsGame.events.PlayerQuit;
import org.devdhsclub.AmongUsGame.gui.GameCreateGUI;
import org.devdhsclub.AmongUsGame.managers.GameManager;

import java.util.HashMap;
import java.util.Objects;

public class AmongUs extends JavaPlugin {
    
    private PluginManager pm;
    private ConsoleCommandSender sender;
    public HashMap<String, GameManager> games;
    public GameCreateGUI gameCreateGUI;
    public static AmongUs instance;
    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
    
    public void getCommands(){
        // Get all commands in this method
        Objects.requireNonNull(this.getCommand("amongus")).setExecutor(new GameCommand());
    }
    
    public void registerEvents(){
        // Register all events in this method
        pm.registerEvents(new PlayerJoin(), this);
        pm.registerEvents(new PlayerQuit(), this);
        pm.registerEvents(new GoodDeath(), this);
        pm.registerEvents(new BadKill(), this);
    }
    
    public void initialize(){
        // Initialize all variables in this method
        pm = Bukkit.getServer().getPluginManager();
        sender = Bukkit.getServer().getConsoleSender();
        games = new HashMap<>();
        gameCreateGUI = new GameCreateGUI();
        instance = this;
    }
    
    @Override
    public void onEnable() {
        // Startup logic
        loadConfig();
        initialize();
        getCommands();
        registerEvents();
        sender.sendMessage(ChatColor.DARK_AQUA + getPlugin(this.getClass()).toString() + " has been enabled!");
    }
    
    @Override
    public void onDisable() {
        // Shutdown logic
        saveConfig();
        sender.sendMessage(ChatColor.DARK_PURPLE + getPlugin(this.getClass()).toString() + " has been disabled!");
    }
    
}
