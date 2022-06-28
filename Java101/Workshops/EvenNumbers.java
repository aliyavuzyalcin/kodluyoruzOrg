package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A program was written to find even numbers up to the number entered by the user with loops.
 */
public class EvenNumbers {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        
        //FOR LOOP SOLUTION
        for (int i = 0; i <= number; i++) {
            if(i % 2 == 0){
                System.out.print(i + " - ");
            }
        }

        //WHILE LOOP SOLUTION
        int k = 0;
        while(k <= number){
            if(k % 2 == 0){
                System.out.print(k + " - ");
            }
            k++;
        }

        //DO-WHILE LOOP SOLUTION
        int z = 0;
        do {
            if(z % 2 == 0){
                System.out.print(z + " - ");
            }            
            z++;
        } while (z <= number);

        keyboard.close();
    }
}
