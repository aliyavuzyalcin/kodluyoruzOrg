package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A program that calculates combinations is written.
 */
public class Combination {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number for N: ");
        int number = keyboard.nextInt();
        System.out.print("Enter a number for R: ");
        int round = keyboard.nextInt();
        int subt = number - round;
        int combination, result1 = 1, result2 = 1, result3 = 1;
        
        //Factoriel for N
        if(number <= 0){
            result1 = 1;
        }else{
            for (int i = 1; i <= number; i++) {
                result1 = result1 * i;
            }
        }
        //Factoriel for R
        if(round <= 0){
            result2 = 1;
        }else{
            for (int i = 1; i <= round; i++) {
                result2 = result2 * i;
            }
        }
        //Factoriel for SUBT
        if(subt <= 0){
            result3 = 1;
        }else{
            for (int i = 1; i <= subt; i++) {
                result3 = result3 * i;
            }
        }
        combination = ((result1 / result2) * subt);
        System.out.print("The result of C(n,r) is: " + combination);
        keyboard.close();
    }
}
