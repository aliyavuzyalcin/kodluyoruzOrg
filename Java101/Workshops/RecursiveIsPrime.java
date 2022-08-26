package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program that finds whether the number received from the user is a "Prime" number using the "Recursive" method.
 */
public class RecursiveIsPrime {
    public static void main(String[] args) {
        
        //Gets the number from user.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        //Pass the number into the method <b>isPrime</b>
        //If it is true, then is A PRIME NUMBER
        //If it is false, then is NOT A PRIME NUMBER
        if (isPrime(number,2) == true) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
        keyboard.close();
    }
    /**
     * 
     * @param number takes the value which user typed.
     * @param counter helps to move forward in the way of doing recursive method.
     * @return true, if the number is prime, 
     *          false, if the number is not prime.
     */
    public static boolean isPrime(int number, int counter) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % counter == 0) {
            return false;
        }
        if (counter * counter > number) {
            return true;
        }
        return isPrime(number, counter + 1);

    }

}
