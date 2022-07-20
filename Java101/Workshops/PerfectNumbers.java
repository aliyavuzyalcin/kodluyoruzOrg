package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A number whose positive integer factors (divisors without a remainder) are equal to itself, 
 * excluding the number itself, is called a perfect number.
 * 
 * It finds whether or not a number entered from the keyboard is a perfect number, and if the number is a perfect number, "it is a perfect number."
 * if not, "it's not a perfect number." Write the program that writes the expressions to the screen in Java language.
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, counter = 0, result = 0, sub = 0;

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        for (int i = 1; i < number; i++) {
            result = number % i;
            if(result == 0){
                counter++;
                sub = sub + i;
            }
        }

        if(sub ==  number){
            System.out.println(number + " is perfect number.");
        }else{
            System.out.println(number + " is NOT perfect number.");
        }
        keyboard.close();
    }
}
