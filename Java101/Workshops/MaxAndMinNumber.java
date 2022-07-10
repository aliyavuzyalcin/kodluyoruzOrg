package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Find the max and min value of given numbers and print it on screen.
 */
public class MaxAndMinNumber {
    public static void main(String[] args) {

        /*
         * Since the value of the lowest variable is started with 0, the result will be 0. Even if the entered variable is greater than zero but lower than the other given numbers.
         * But if the entered value is lower than 0, then result will be the given number.
         */
        Scanner keyboard = new Scanner(System.in);
        int amount, greatest = 0, lowest = 0, number;
        System.out.print("How many numbers will you enter: ");
        amount = keyboard.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.print("Enter a number: ");
            number = keyboard.nextInt();
            if (number > greatest) {
                greatest = number;
            } else if (number < lowest) {
                lowest = number;
            }
        }
        System.out.println("The greatest is : " + greatest + "\nThe lowest is: " + lowest);
        keyboard.close();
    }
}
