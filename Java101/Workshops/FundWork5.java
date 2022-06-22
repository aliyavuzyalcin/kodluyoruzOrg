package Workshops;

import java.util.Scanner;

public class FundWork5 {
    public static void main(String[] args) {
        
        double r, pi = 3.14, angle, perimeter, area, pieArea;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        r = keyboard.nextDouble();

        perimeter = 2*pi*r;
        area = pi*r*r;
        System.out.print("\nEnter Central Angle: ");
        angle= keyboard.nextDouble();
        keyboard.close();

        pieArea = (area * angle) / 360;    

        System.out.println("The perimeter of the circle: " + perimeter + "\nThe area of the circle: " + area + "\nThe area of the pie: " + pieArea);
    }
}
