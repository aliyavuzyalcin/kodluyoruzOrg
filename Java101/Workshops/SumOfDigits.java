package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A Java program to find the sum of digits of given number.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int number, tempNumber, digitValue, digitNumber = 0, sum = 0, result = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");

        number = keyboard.nextInt();    // get number from user.
        //if number is not zero then;
        if(number != 0){
            tempNumber = number;            // Store the value of number in tempNumber. Because we don't want to change number's value.
            while(tempNumber != 0){
                tempNumber = tempNumber / 10;   // WHILE tempNumber is not zero, divide it with 10. And increase the value of digitNumber.
                digitNumber++;                  // So that we can know how many digits number has.
            }
    
            tempNumber = number;                // After finding the amount of digits, arrange the value of tempNumber again. Assign number to tempNumber. For same reason again.
            while(tempNumber != 0){
                digitValue = tempNumber % 10;   //WHILE tempNumber is not zero, find the value of each digits.
                sum = sum + digitValue;         //Then, calculate the sum by add up value of that current value.
                result = sum;                   //Then, assign the value of sum to the variable result.
                tempNumber = tempNumber / 10;   //Move to the next digit.
            }
            System.out.println("Sum of Digits: " + result);     //Print the result

        }else{
            System.out.println(result + " can't be zero. Try again!");  //Print the error.
        }
        keyboard.close();       //close the keyboard so that prevent from any leak. 
    }
}
