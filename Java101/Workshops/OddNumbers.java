package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A program that accepts inputs from the user until -1 is entered and adds even and multiples of 4 from the entered values and prints it on the screen.
 * AND
 * A program that calculates the sum of odd numbers in a given range.
 */
public class OddNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /*A program that accepts inputs from the user until -1 is entered and adds even and 
        multiples of 4 from the entered values and prints it on the screen. */
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        int total = 0;
        while (!(number == -1)) {
         for (int i = 0; i <= number; i++) {
         if (!(i % 2 == 0)) {
         total = total + i;
         System.out.print(i + " ");
         }
         }
         System.out.println("Total: " + total);
         total = 0;
         System.out.print("Enter a number: ");
         number = keyboard.nextInt();
        }
        System.out.print("Program is over!");
        
        /*A program that calculates the sum of odd numbers in a given range. */
        number = keyboard.nextInt();
        while (number != -1) {
            if ((number % 2 == 0) && (number % 4 == 0)) {
                total = number + total;
            }
            System.out.println("Total: " + total);
            System.out.print("Enter a number: ");
            number = keyboard.nextInt();
        }

        keyboard.close();

    }
}
