package com.gamingroom;

/**
 * This class is just here to help me test that my GameService singleton works.
 * I'm using this to prove that no matter where I access GameService from, it’s always the same instance.
 * 
 * @author julliane.pamfilo@snhu.edu
 */
public class SingletonTester {

    /**
     * This method checks if the same GameService instance is used here too.
     */
    public void testSingleton() {
        System.out.println("\nAbout to test the singleton instance again from SingletonTester...\n");

        // Getting the GameService again — should be the exact same instance
        GameService service = GameService.getInstance();

        // Try adding a game with a name we've already used
        Game game = service.addGame("Game #1"); // Should NOT create a new one

        // Print it out — should match the original Game #1
        System.out.println("Retrieved in SingletonTester: " + game);

        // Just to confirm: print the total number of games in memory
        System.out.println("Total games in memory: " + service.getGameCount());
    }
}

