package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * An n-digit number is called an Armstrong number if the sum of the nth powers of the digits is equal to the number itself.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= keyboard.nextInt();
        int decimalPlaces = 0 ;
        int digitValue;
        int result = 0;
        int digitPow;
        int tempNumber = number;

        //Found the amount of decimal places
        while( tempNumber != 0){
            tempNumber = tempNumber / 10;
            decimalPlaces++;
        }
        /* Make tempNumber equal with number again to find each digit value and calculate its value of pow then add up the result with each digit.
        Lastly, move to the next decimal place. */
        tempNumber = number;
        while(tempNumber != 0){
            digitValue = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= decimalPlaces; i++) {
                digitPow = digitPow * digitValue;
            }
            result = result + digitPow;
            tempNumber = tempNumber / 10;
        }
        /*Check if result is equal to the given number at first. If so, then the number is an Armstrong Number. If not, then it is not an Armstrong number. */
        if(result == number){
            System.out.println(result + " is an Armstrong Number.");
        }else{
            System.out.println(result + " is not an Armstrong Number.");
        }

        keyboard.close();
    }
}
