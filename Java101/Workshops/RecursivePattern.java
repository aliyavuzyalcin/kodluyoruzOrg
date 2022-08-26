package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Subtract 5 from the entered number up to where the entered number is 0 or negative.
 * Print the last value to the screen during each subtraction. 
 * Add 5 again after the number is negative or 0. 
 * Again, print the last value of the number on the screen in each addition operation.
 * 
 * N: 16
 * Output : 16 11 6 1 -4 1 6 11 16
 * 
 * N: 10
 * Output : 10 5 0 5 10
 * 
 * N: 25
 * Output : 25 20 15 10 5 0 5 10 15 20 25
 *
 * N: 5
 * Output : 5 0 5
 * 
 */
public class RecursivePattern {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type an N number: ");
        int n = keyboard.nextInt();
        pattern(n);
        keyboard.close();
    }

    public static void pattern(int n) {
        
        if(n > 0){
            System.out.print(n + " ");
            pattern(n - 5);
        }
        System.out.print(n + " ");
    }
    
}
