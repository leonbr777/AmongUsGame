package org.devdhsclub.AmongUsGame;

import org.bukkit.plugin.java.JavaPlugin;

public class AmongUs extends JavaPlugin {
    
    @Override
    public void onEnable() {
        // Startup logic
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
    
    @Override
    public void onDisable() {
        // Shutdown logic
        saveConfig();
    }
    
}
