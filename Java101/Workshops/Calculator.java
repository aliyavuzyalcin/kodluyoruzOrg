package Workshops;

import java.util.Scanner;
/**
 * @author Ali Yavuz YALCIN
 * 
 * Calculator
 */
public class Calculator {
    public static void main(String[] args) {
        double number1,number2;
        int operation;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number:");
        number1 = keyboard.nextDouble();

        System.out.println("Enter second number");
        number2 = keyboard.nextDouble();

        System.out.println("What operation you want to do? Press 1 for addition, Press 2 for subtraction, Press 3 for multiplication, Press 4 for division, Press 5 for mod:");
        operation = keyboard.nextInt();
        keyboard.close();

        switch (operation) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;    
            case 5:
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Please insert a valid number!");
                break;
        }

    }
}
