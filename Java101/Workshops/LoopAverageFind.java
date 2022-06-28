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
        int average = 0;
        for (int i = 0; i <= number; i++) {
            if((i % 3 == 0) && (i % 4 == 0)){
                average = average + i;
            }
        }
        
        System.out.print("Average is : " + average);
        keyboard.close();
    }
}
