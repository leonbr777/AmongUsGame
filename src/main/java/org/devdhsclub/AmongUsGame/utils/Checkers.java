package org.devdhsclub.AmongUsGame.utils;

/*

This class contains methods that check to see if certain things are happening.
Very useful for other classes to use, such as

*/

import org.devdhsclub.AmongUsGame.managers.GameManager;

public class Checkers {

    public GameManager gameManager;
    
    public Checkers (GameManager gameManager){
        this.gameManager = gameManager;
    }

    public boolean gameHasSpace(int maxPlayers){ // Checks if the game is full
        return maxPlayers < gameManager.getMaxPlayers();
    }
    
    
    
}
