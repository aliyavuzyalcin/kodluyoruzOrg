package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program that finds the GCD and LCM values of the two given numbers.
 */
public class GcdAndLcm {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("First enter the smaller number: ");
        int number1 = keyboard.nextInt();
        System.out.print("Secondly enter the bigger number: ");
        int number2 = keyboard.nextInt();
        int temp = 0;
        
        int k = 1;
        while(k <= number2){
            if((number1 % k == 0) && (number2 % k == 0)){
                temp = k;
            }
            k++;
        }
        /*same op with for loop */
        /* 
        for (int i = 1; i <= number2; i++) {
            if((number1 % i == 0) && (number2 % i == 0)){
                temp = i;
            }
        }*/
        int leastCommonMultiple = (number1 * number2) / temp;
        System.out.println("The Greatest common divisor of " + number1 + " and " + number2 + " is: " + temp);
        System.out.println("The Least Common Multiple is: " + leastCommonMultiple);
        keyboard.close();
    }
}
