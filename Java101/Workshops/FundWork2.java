package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz Yalcin
 * 
 * Write a program that calculates the VAT value and the VAT amount of the money value received from the user with Java and prints it on the screen. 
 * 
 * (Note: Take the VAT amount as 18%)
 * Price without VAT = 10;
 * Price with VAT = 11.8;
 * VAT amount = 1.8;
 * 
 *  \-- If the amount entered is between 0 and 1000 TL, the VAT rate is 18%, if the amount is greater than 1000 TL, 
 *     write the program that calculates the VAT amount as 8%.--/
 * 
 */
public class FundWork2 {
    public static void main(String[] args) {
        double vat = 0.18;
        double price;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Enter the Price: ");
        price = keyboard.nextDouble();
        keyboard.close();
        double vatPrice = price * vat;
        double totalPrice = price + vatPrice;

        System.out.println("\nPrice without VAT: " + price + "\nVAT: " + vat + "\nTotal Price: " + totalPrice);

    }
}
