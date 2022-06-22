package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz Yalcin
 * 
 * www.patika.dev
 * 
 * Write a program in Java that takes the length of the perpendicular sides from the user and calculates the hypotenuse.
 * 
 * Write a program that calculates the area of the triangle whose three side lengths you get from the user.
 */

public class FundWork3 {
    public static void main(String[] args) {
        
        int a, b;
        double c, u, area;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        a = keyboard.nextInt();

        System.out.print("Enter the second side: ");
        b = keyboard.nextInt();
        keyboard.close();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hypotenuse is: " + c);

        u = (a+b+c)/2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("\nThe environment of triangle is: " + u + "\nThe area of triangle: " + area);


        


    }
}
