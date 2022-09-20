package Workshops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         A "Number Guessing Game" where the user guesses a number randomly
 *         chosen by the program from 0-100.
 * 
 *         The life is randomly given by computer.
 *         guessed variable keeps the guess user make and then add them into
 *         guessList array.
 *         Guess variable keeps the value user passed.
 */
public class NumberGuessGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        int guess = 0, guessed = 0, randomNumber, life, startingLife;

        life = random.nextInt(5, 10);
        startingLife = life;
        randomNumber = random.nextInt(0, 100);

        int[] guessList = new int[life];

        System.out.println("\n--- WELCOM TO THE NUMBER GUESSING GAME ---");

        while (life > 0) {
            System.out.print("\nWrite your guess: ");
            guess = keyboard.nextInt();

            if (guess == randomNumber) {
                System.out.println("\nCongrats!");
                break;
            } else if ((guess >= 0 && guess <= 100)) {

                if (guess != randomNumber) {
                    life--;
                    System.out.println("\nWrong!" + "\nRemaining Life: " + life);
                }

                if (life != 0) {

                    if (guess < randomNumber) {
                        System.out.println("The number is greater!");
                    } else {
                        System.out.println("The number is smaller!");
                    }
                }
            }
            guessList[guessed] = guess;
            guessed++;
        }
        if (life > 0) {

            System.out.println();
            System.out.println("=============");
            System.out.println("YOU WON!");
            System.out.println("=============");
            System.out.println("Starting Life: " + startingLife);
            System.out.println("Remaining Life: " + life);
            System.out.println("=============");
            System.out.println("The hidden number: " + randomNumber);
            System.out.println("=============");
            System.out.println("Your guesses were: " + Arrays.toString(guessList));

        } else {

            System.out.println();
            System.out.println("=============");
            System.out.println("YOU LOST!");
            System.out.println("=============");
            System.out.println("Starting Life: " + startingLife);
            System.out.println("Remaining Life: " + life);
            System.out.println("=============");
            System.out.println("The hidden number: " + randomNumber);
            System.out.println("=============");
            System.out.println("Your guesses were: " + Arrays.toString(guessList));
        }
        keyboard.close();
    }
}
