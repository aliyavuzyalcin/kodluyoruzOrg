package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program that calculates the average of numbers divisible by 3 and 4 from the numbers 0 through the number entered.
 */
public class LoopAverageFind {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        keyboard.close();
        int total = 0, average;
        int i, counter = 0;
        for (i = 1; i < number; i++) {
            if((i % 3 == 0) && (i % 4 == 0)){
                total = total + i;
                counter++;
                System.out.print(i + " - ");
            }
        }
        average = total / counter;
        System.out.print("Average is : " + average + "\nThe i: " + i + "\nTotal: " + total + "\nCounter: " + counter);
    }
}
