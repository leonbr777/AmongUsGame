package org.devdhsclub.AmongUsGame.runnables;

import org.bukkit.scheduler.BukkitRunnable;
import org.devdhsclub.AmongUsGame.managers.GameManager;

public class VotingTimer extends BukkitRunnable {
    
    private final GameManager gameManager;
    private int count;
    
    public int getCount() { return count; }
    
    public VotingTimer (GameManager gameManager){
        this.gameManager = gameManager;
        this.count = this.gameManager.getDiscussionTime();
    }
    
    @Override
    public void run() {
        if (count <= 0){
            this.cancel();
            count = gameManager.getVotingTime();
        }
        count--;
    }
    
}

