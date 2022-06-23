package Workshops;

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        
        double weight, height, vki;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight = keyboard.nextDouble();

        System.out.println("Enter your height: ");
        height = keyboard.nextDouble();

        vki = weight / (height*height);

        System.out.println("Your VKI: " + vki);
        keyboard.close();

    }
}