package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Use the "For Loop" program that calculates exponential numbers with the values entered by the user.
 */
public class PowCalculation {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number for N: ");
        int number = keyboard.nextInt();
        System.out.print("Enter a number for R: ");
        int round = keyboard.nextInt();
        int result = 1;
        
        for (int i = 1; i <= round; i++) {
            result *= number;
        }
        System.out.print(result);
        
        keyboard.close();
    }
}
