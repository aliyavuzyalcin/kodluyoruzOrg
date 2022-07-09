package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program that finds the harmonic series of a number entered in Java.
 */
public class HarmonicSerie {
    public static void main(String[] args) {
        
        double number, sum = 0, result, sub = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = keyboard.nextDouble();                                         //Get number from user.

        for (double i = 1; i <= number; i++) {                                  //From 1 to the given number.
            sub = 1/i;                                                          //1 will be divided by each of the value of i.
            sum = sum + sub;                                                    //Calculate the sum.
        }

        result = sum;                                                           //Assign the value of sum to the variable result.
        System.out.println("The result of Harmonic serie is: " + result);       //Print the result.
        keyboard.close();                                                       //close the keyboard so that prevent from any leak.
        
    }
}
