package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Write a program in Java to find whether the year the user entered is a leap year or not.
 * 
 * A leap year is a year with 366 days instead of 365 in the Gregorian calendar. 
 * This extra day (leap day) is obtained by adding February 29 to February, which is normally 28 days.
 */
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = keyboard.nextInt();
        keyboard.close();

        if((year >= 0) && (year % 4 == 0)){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.print(year + " is leap year.");
                }else{
                    System.out.print(year + " is not leap year.");
                }
            }else{
                System.out.print(year + " is leap year.");
            }
        }else{
            System.out.print(year + " is not leap year.");
        }
    }
}
