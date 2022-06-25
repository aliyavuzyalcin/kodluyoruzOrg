package Workshops;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program that sorts the 3 entered numbers "from largest to smallest".
 */
public class NumberSorting {
    public static void main(String[] args) {

        double x, y, z;
       	Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = keyboard.nextDouble();
        System.out.print("Enter the second number:");
        y = keyboard.nextDouble();
        System.out.print("Enter the third number:");
        z = keyboard.nextDouble();

        if(x > y && x > z){
            if(y > z){
                System.out.println(x + " > " + y + " > " + z);
            }else {
                System.out.println(x + " > " + z + " > " + y);
            }
        }else if(y > x && y > z){
            if(x > z){
                System.out.println(y + " > " + x + " > " + z);
            }else{
                System.out.println(y + " > " + z + " > " + x);
            }
        }else if(z > x && z > y){
            if(x > y){
                System.out.println(z + " > " + x + " > " + y);
            }else {
                System.out.println(z + " > " + y + " > " + x);
            }
        }else{
            System.out.println(x + " = " + y + " = " + z);
        }
        keyboard.close();		
    }
}