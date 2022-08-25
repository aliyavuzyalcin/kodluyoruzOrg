package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A program that takes the base and exponent values from the user and calculates the power of the base number using the "Recursive" method.
 * 
 * Test Values:
 * a:2 b:0 Result: 1
 * a:2 b:3 Result: 8
 * a:5 b:3 Result: 125
 */
public class RecursivePow {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the base number: ");
        a = keyboard.nextInt();
        System.out.print("Enter the power: ");
        b = keyboard.nextInt();
        int result = recursivePow(a, b);
        System.out.println("Result: " + result);
        keyboard.close();
    }

    /**
     * 
     * @param a is the base number.
     * @param b is the exponent number.
     * @return Returns itself multiplied with the base number which is <b>a</b> till the end of recursion.
     */
    public static int recursivePow(int a, int b) {
        if (a == 0) {
            return 0;
        }

        if (a != 0 && b == 0) {
            return 1;
        }

        return recursivePow(a, b - 1) * a;
    }
}
