package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A program was written that prints the powers of 4 and 5 up to the entered number on the screen.
 * 
 */
public class PowerOfFourAndFive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        for (int i = 0; i <= number; i++) {
            int resultFour = (int) Math.pow(4, i);
            int resultFive = (int) Math.pow(5, i);
            
            if((resultFour == 1 && resultFive == 1) || (resultFour % 4 == 0 && resultFive % 5 == 0)){
                System.out.print(resultFour + " || " + resultFive + " -- ");
            }
        }       
        keyboard.close();
    }
}
