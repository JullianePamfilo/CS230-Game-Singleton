package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine.
 * 
 * This class uses the Singleton Pattern to ensure that only one instance
 * of GameService exists in memory at any time. It also uses the Iterator Pattern
 * to search for games within the list efficiently.
 * 
 * @author julliane.pamfilo@snhu.edu
 */
public class GameService {

    // A list to store all active game instances
    private List<Game> games = new ArrayList<Game>();

    // Keeps track of the next ID to assign to a game
    private long nextGameId = 1;

    // The one and only instance of GameService (singleton)
    private static GameService instance = null;

    /**
     * Private constructor.
     * Prevents external classes from creating new instances directly.
     */
    private GameService() {
        // Initialization happens once when the singleton is created
    }

    /**
     * Singleton Pattern:
     * Returns the single instance of GameService.
     * If none exists, it creates and returns it.
     * 
     * @return The one and only instance of GameService
     */
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * When I want to add a game, I first check if a game with the same name already exists.
     * I'm using Java’s Iterator here to loop through the list of games.
     * If I find one with the same name, I just return that one instead of creating a new one.
     */
    public Game addGame(String name) {
        Game game = null;

        // Iterator Pattern: loop through the list of games
        Iterator<Game> it = games.iterator();
        while (it.hasNext()) {
            Game g = it.next();
            if (g.getName().equalsIgnoreCase(name)) {
                game = g;
                break;
            }
        }

        // If I didn’t find an existing game, I create a new one and add it to the list
        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        return game;
    }

    /**
     * This method is mostly for testing. It just returns the game at a specific index.
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * This method helps me find a game by its ID.
     * I loop through the list using an Iterator and return the matching game if I find it.
     */
    public Game getGame(long id) {
        Iterator<Game> it = games.iterator();
        while (it.hasNext()) {
            Game g = it.next();
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    /**
     * This one is similar, but looks for a game by its name.
     * Again, I use the Iterator to loop through the list and return the matching one.
     */
    public Game getGame(String name) {
        Iterator<Game> it = games.iterator();
        while (it.hasNext()) {
            Game g = it.next();
            if (g.getName().equalsIgnoreCase(name)) {
                return g;
            }
        }
        return null;
    }

    /**
     * This just tells me how many games are currently in the list.
     */
    public int getGameCount() {
        return games.size();
    }
}