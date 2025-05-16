package com.gamingroom;

/**
 * This is the main starting point of the app.
 * I'm using this class to test if my GameService singleton is working correctly.
 * 
 * @author julliane.pamfilo@snhu.edu
 */
public class ProgramDriver {

    /**
     * This is the one-and-only main() method that runs when I start the app.
     * 
     * @param args Any command-line arguments (not used here)
     */
    public static void main(String[] args) {

        // I call getInstance() instead of using new — this proves the Singleton pattern works
        GameService service = GameService.getInstance();

        System.out.println("\nAbout to test initializing game data...\n");

        // I'm adding a couple of games — this should work normally
        Game game1 = service.addGame("Game #1");
        System.out.println("Added: " + game1);

        Game game2 = service.addGame("Game #2");
        System.out.println("Added: " + game2);

        // This next part uses another class to confirm we're still using the same GameService instance
        SingletonTester tester = new SingletonTester();
        tester.testSingleton();
    }
}

