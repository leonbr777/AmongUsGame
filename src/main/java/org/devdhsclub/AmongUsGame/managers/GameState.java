package org.devdhsclub.AmongUsGame.managers;

                    /*/       ||     Made by Liam    ||      /*/

public enum GameState {
    
    // This class is used for us to be able to do certain actions based on what "state" the game is in. Ex.
    // If the game is in a meeting, teleport the players to the meeting room.
    
    LOBBY, QUEUE, STARTING, ACTIVE, SAB_O2, SAB_LIGHTS, MEETING, EMERGENCY, GOODWIN, BADWIN
    
    /*
    - The LOBBY gamestate is when no game is active, so basically the plugin is not being used. The players
    could be doing anything.
    
    - The QUEUE gamestate is similar to when you jump into a Bedwars game on Hypixel: its when you are waiting for
    players to join in order to start.
    
    - The STARTING gamestate is when enough people join in order to start, and it starts to count down on the
    scoreboard.
    
    - The ACTIVE gamestate is when the game has started, and is playing. Things we would do during this gamestate
    are 1) TP Players to the original starting room, 2) prevent players from breaking blocks, 3) enable players to
    actually complete tasks and register those tasks, 4) enable imposters to kill crewmates, and enable players to
    report dead bodies, which will transfer over to the MEETING gamestate.
    
    - The SAB_O2 gamestate is when an imposter sabotages the Oxygen, causing the alarm to go off, the oxygen depletion
    countdown to start, and the oxygen-saving task to be enabled (two players have to touch two different touchpads at
    different locations on the map simultaneously).
    
    - The SAB_LIGHTS gamestate is when an imposter sabotages the lights/electricity, which gives all crewmate players
    blindness. For now, the way we will simulate their visibility gradually decreasing is by using a runnable, and increasing
    the level of blindness every 5 ticks, for 3 seconds until they can barely see. Future idea: make it so that players
    are not given blindness, but cannot see any other players until they are within a very close range.
    
    - The MEETING gamestate is when a meeting starts due to a player reporting a body. Things that will occur during
    this gamestate: 1) Players are TP-ed to a designated meeting room, where they are unable to move, but will be
    able to interact with a custom GUI in which they will be able to place their vote for a player, or to skip the round.
    
    - The EMERGENCY gamestate is exactly like the MEETING gamestate, but is initiated when a player hits the emergency
    button. These are two separate gamestates because we might, in the future, want to change the behaviour of these
    events.
    
    - The GOODWIN gamestate is initiated when the crewmates win the game. (Might change name of gamestate later)
    
    - The BADWIN gamestate is initiated when the imposters win the game. (Might change name of gamestate later)
    
    */
    
}
