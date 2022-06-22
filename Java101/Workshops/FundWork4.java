package Workshops;

import java.util.Scanner;
/**
 * @author Ali Yavuz Yalcin
 * 
 * Write a program that prints the taximeter amount on the screen according to the distance traveled (KM).
 * Taximeter costs 2.20 TL per km.
 * The minimum amount to be paid is 20 TL. 20 TL will be charged for fees below 20 TL.
 * Taximeter opening fee is 10 TL.
 */
public class FundWork4 {
    public static void main(String[] args) {

        double distance, perKM = 2.20, openingFee = 10, price;
        boolean priceCheck;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the distance in KM: ");
        distance = keyboard.nextDouble();
        keyboard.close();

        double fee = (distance* perKM) + openingFee;
        priceCheck = (fee > 0) && (fee <= 20);

        price = priceCheck? 20 : fee;

        System.out.println("Total distance in KM: " + distance + "\nPrice per KM: " + perKM + "\nOpening Fee: " + openingFee + "\nFee: " + fee + "\nTotal Price: " + price);

    }
}
