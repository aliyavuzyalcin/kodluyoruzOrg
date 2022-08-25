package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * We are making a calculator that performs the operations selected by the user.
 * Functions(methods) of the calculator:
 * 1- Addition
 * 2- Subtraction
 * 3- Multiplication
 * 4- Division process
 * 5- Exponent Calculation
 * 6- Factorial Calculation
 * 7- Mode Calculation
 * 8- Rectangle Area and Perimeter Calculation
 * 0- EXIT
 */
public class ProCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int select;
        String menu = "1- Addition"
                + "\n2- Subtraction"
                + "\n3- Multiplication"
                + "\n4- Division"
                + "\n5- Pow"
                + "\n6- Factoriel"
                + "\n7- Mod"
                + "\n8- Rectangle Area and Perimeter Calculation"
                + "\n0- Exit";

        System.out.println("\n***********************************************************************");
        System.out.println();
        System.out.println("WELCOME TO THE CALCULATOR!");
        System.out.println();
        System.out.println("***********************************************************************");

        do {
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = keyboard.nextInt();
            switch (select) {
                case 1:
                    add();
                    break;
                case 2:
                    subt();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCalculation();
                    break;
                case 0:
                    System.out.println("\n---------------------- Have a nice day! ----------------------\n");
                    break;
                default:
                    System.out.println("Wrong entry, try again!");
            }
        } while (select != 0);
        keyboard.close();

    }
    
    /**
     * It gets numbers from the user till user enters 0.
     * It gets in while loop and calculates the sum of the given numbers.
     * Prints the result on screen.
     */
    public static void add() {
        Scanner keyboard = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print("Enter " + i++ + ". number (to abort press 0): ");
            number = keyboard.nextInt();
            if (number == 0) {
                break;
            }
            result = result + number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }

    /**
     * It gets the number of the amount the user will enter.
     * It gets in for loop and calculates the subtract. 
     * When the value of i greater then the value of counter variable, it stops and exit the loop.
     * Prints the result on screen.
     */
    public static void subt() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of numbers you want to enter: ");
        int counter = keyboard.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter " + i + ". number: ");
            number = keyboard.nextInt();
            if (i == 1) {
                result = result + number;
                continue;
            }
            result = result - number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }

    /**
     * It gets numbers from the user till user enters 0.
     * It increases the value of i as the user enters new numbers.
     * It gets in the while loop and start to multiplying the given numbers.
     * It breaks if number is equal to 1 because 1 is neutral element.
     * It breaks if number is equal to 0 because 0 is zero element.
     * Then, it prints the result on the secreen.
     */
    public static void multiply() {
        Scanner keyboard = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print("Enter " + i++ + ". number (to abort press 1): ");
            number = keyboard.nextInt();

            if (number == 1) {
                break;
            }

            if (number == 0) {
                result = 0;
                break;
            }
            result = result * number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }

    /**
     * It gets the number of the amount the user will enter.
     * It increases the value of i as the user enters new numbers.
     * It calculates the division.
     * It breaks if number is equal to 1 because 1 is neutral element.
     * It breaks if number is equal to 0 because the result would be infinity.
     * Then, it prints the result on the secreen.
     */
    public static void div() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers you want to enter: ");
        int counter = keyboard.nextInt();
        double number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter " + i + ". number: ");
            number = keyboard.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divider can't be 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result = result / number;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }

    /**
     * Calculates the exponent of number given by the user.
     * Then, it prints the result on the secreen.
     */
    public static void pow() {
        Scanner keyboard = new Scanner(System.in);
        int result = 1;
        System.out.print("Enter the base number: ");
        int base = keyboard.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = keyboard.nextInt();
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
    /**
     * Calculates the factorial of the number entered by the user.
     * Then, it prints the result on the screen.
     */
    public static void fac() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }

    /**
     * Calculates the mode of two numbers entered by the user.
     * Then, it prints the result on the screen.
     */
    public static void mod() {
        Scanner keyboard = new Scanner(System.in);
        int a, b, result;
        while (true) {
            result = 0;
            System.out.print("Enter the first number (to abort press 0): ");
            a = keyboard.nextInt();
            if (a == 0) {
                break;
            }
            System.out.print("Enter the second number: ");
            b = keyboard.nextInt();
            result = a % b;
            System.out.println("Result: " +  result);
            System.out.println();
        }
    }
    /**
     * Calculates the area and perimeter of a rectangle whose length and width are given by the user.
     * Then prints the results on the screen.
     */
    public static void rectangleCalculation() {
        Scanner keyboard = new Scanner(System.in);
        int resultArea, resultPerimeter, a, b;
        while (true) {
            resultArea = 0;
            resultPerimeter = 0;
            System.out.print("Enter the Length (to abort press 0): ");
            a = keyboard.nextInt();
            if (a == 0) {
                break;
            }
            System.out.print("Enter the Width (to abort press 0): ");
            b = keyboard.nextInt();
            resultArea = a * b;
            resultPerimeter = 2 * (a + b);
            System.out.println("Area: " + resultArea + "\nPerimeter: " + resultPerimeter);
            System.out.println();
        }
    }
}