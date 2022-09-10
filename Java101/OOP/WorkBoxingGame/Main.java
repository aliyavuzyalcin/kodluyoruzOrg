package OOP.WorkBoxingGame;


/**
 * @author Ali Yavuz YALCIN
 * 
 * This is the program that simulates a boxing match.
 * Integrate the system that calculates who will start the fight first with 50% probability in the project.
 */
public class Main {
    public static void main(String[] args) {
        double randomNumber;
        randomNumber = Math.random() * 100;
        int damage1 = (int) randomNumber;
        randomNumber = Math.random() * 100;
        int health1 = (int) randomNumber;
        randomNumber = Math.random() * 100;
        int dodge1 = (int) randomNumber;
        randomNumber = Math.random() * 100;
        int damage2 = (int) randomNumber;
        randomNumber = Math.random() * 100;
        int health2 = (int) randomNumber;
        randomNumber = Math.random() * 100;
        int dodge2 = (int) randomNumber;

       
        Fighter f1 = new Fighter("Marc", damage1, health1, 90, dodge1);
        Fighter f2 = new Fighter("Alex", damage2, health2, 100, dodge2);
        Match match = new Match(f1, f2, 90, 100);


        System.out.println("|=======================================|");
        System.out.println(" \\                                     /");
        System.out.println("  \\                                   /");
        System.out.println("   \\                                 /");
        System.out.println("    \\                               /");
        System.out.println("     |-----------------------------|");
        System.out.println("     |    WELCOME TO BOXING GAME   |");
        System.out.println("     |-----------------------------|");
        System.out.println("     |-----------------------------|");
        System.out.println("     |       MADE BY YAVUZ!        |");
        System.out.println("     |-----------------------------|");
        System.out.println("     |-----------------------------|");
        System.out.println("|========================================|");


        match.run();
    }
}
