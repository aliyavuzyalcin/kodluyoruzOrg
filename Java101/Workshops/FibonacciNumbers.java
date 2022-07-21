package Workshops;

import java.util.Scanner;
/**
 * @author Ali Yavuz YALCIN
 * 
 * The Fibonacci sequence starts from 0 and goes on to infinity. 
 * Each digit is added up with the previous digit. 
 * The result obtained is written on the right side of the figure. 
 * The first ten numbers of the Fibonacci sequence are as follows:
 * 9 Element Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number1 = 0, number2 = 1, number3;

        System.out.print("Enter a number: ");
        int counter = keyboard.nextInt();

        System.out.print(number1 + " " + number2 + " ");
        for (int i = 2; i <= counter; i++) {
            number3 = number2 + number1;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
        keyboard.close();
    }
}
