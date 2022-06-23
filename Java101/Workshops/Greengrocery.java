package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Greengrocery calculation program.
 */
public class Greengrocery {
    public static void main(String[] args) {
       
        double pearPrice = 2.14, pearAmount, subTotal1, applePrice = 3.67, appleAmount, subTotal2, tomatoesPrice = 1.11, tomatoesAmount, subTotal3, bananaPrice = 0.95, bananaAmount, subTotal4,
        eggplantPrice = 5.00, eggplantAmount, subTotal5, totalPrice;

        Scanner keyboard =new Scanner(System.in);

        System.out.println("Enter Pear Amount:");
        pearAmount = keyboard.nextDouble();
        subTotal1 = pearAmount * pearPrice;

        System.out.println("Enter Apple Amount:");
        appleAmount = keyboard.nextDouble();
        subTotal2 = appleAmount*applePrice;

        System.out.println("Enter Tomatoes Amount:");
        tomatoesAmount = keyboard.nextDouble();
        subTotal3 = tomatoesAmount*tomatoesPrice;

        System.out.println("Enter Banana Amount:");
        bananaAmount = keyboard.nextDouble();
        subTotal4 = bananaAmount*bananaPrice;

        System.out.println("Enter Eggplant Amount:");
        eggplantAmount = keyboard.nextDouble();
        subTotal5 = eggplantAmount*eggplantPrice;

        totalPrice = subTotal1 + subTotal2 + subTotal3 + subTotal4 + subTotal5;

        System.out.println("Total Price: " + totalPrice);     

        keyboard.close();
    }
}