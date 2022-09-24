package MineSweeper;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MineSweeper map;
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("=====================");
            System.out.print("Choose level" + "\n1-Easy" + "\n2-Medium" + "\n3-Hard" + "\n(Press '-1' to leave the game): ");
            int input = keyboard.nextInt();
            if (input == 1) {
                map = new MineSweeper(3, 3);
                map.playGame();
            } else if (input == 2) {
                map = new MineSweeper(5, 5);
                map.playGame();
            } else if (input == 3) {
                map = new MineSweeper(10, 10); 
                map.playGame();
            } else if (input == -1) {
                System.out.println("Goodby!");
                isContinue = false;
                break;
            } else {
                System.out.println("Enter a valid number!");
                System.out.println();
            }

        }
        keyboard.close();
    }
}
