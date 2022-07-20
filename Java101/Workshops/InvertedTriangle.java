package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program in Java that takes the number of digits from the user and 
 * draws an inverted triangle to the screen with asterisks (*) using loops.
 */
public class InvertedTriangle {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        //Take number from user to draw inverted triangle
        System.out.print("Enter a number to draw inverted triangle: ");
        int number = keyboard.nextInt();                                    

        //Outer for loop stands for all rows in the range of given number (number)
        for(int i = 0; i < number; i++){                

            //First loop leaves spaces as much as the amount of i (For example; if i = 1, then there will be 1 space in that line)
            for(int j = 0; j < i; j++){                 
                System.out.print(" ");
            }

            /*It will put "*". It will be odd number and will be in the amount of twofolda and minus one the given number.
             * After one loop, it will decrease that odd number by two.
             */
            for(int j = 1; j <= ((2 * number - 1) - (2 * i)); j++){        
                System.out.print("*");                                  
            }
            //Then, it will skip a line. 
            System.out.println();
        }
        keyboard.close();
    }
}
