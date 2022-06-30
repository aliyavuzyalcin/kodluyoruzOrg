package Workshops;

import java.util.Scanner;

public class PowerOfTwo{
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        for (int i = 0; i < number; i++) {
            int result = (int) Math.pow(2, i);

            if(result == 1 || result % 2 == 0){
                System.out.print(result + " , ");
            }
        }
        
       
        keyboard.close();
    }
}