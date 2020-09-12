package org.devdhsclub.AmongUsGame.runnables;

import org.bukkit.scheduler.BukkitRunnable;
import org.devdhsclub.AmongUsGame.managers.GameManager;

public class DiscussionTimer extends BukkitRunnable {
    
    private final GameManager gameManager;
    private int count;
    
    public int getCount() { return count; }
    
    public DiscussionTimer (GameManager gameManager){
        this.gameManager = gameManager;
        this.count = this.gameManager.getDiscussionTime();
    }
    
    @Override
    public void run() {
        if (count <= 0){
            this.cancel();
            count = gameManager.getDiscussionTime();
        }
        count--;
    }
}
