package Workshops;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        year = keyboard.nextInt();
        keyboard.close();
        
        if(year % 12 == 0){
            System.out.print("Your Chinese Zodiac is: Monkey");
        }else if( year % 12 == 1){
            System.out.print("Your Chinese Zodiac is: Rooster");
        }else if(year % 12 == 2){
            System.out.print("Your Chinese Zodiac is: Dog");
        }else if(year % 12 == 3){
            System.out.print("Your Chinese Zodiac is: Pig");
        }else if(year % 12 == 4){
            System.out.print("Your Chinese Zodiac is: Mouse");
        }else if(year % 12 == 5){
            System.out.print("Your Chinese Zodiac is: Ox");
        }else if(year % 12 == 6){
            System.out.print("Your Chinese Zodiac is: Tiger");
        }else if(year % 12 == 7){
            System.out.print("Your Chinese Zodiac is: Rabbit");
        }else if(year % 12 == 8){
            System.out.print("Your Chinese Zodiac is: Dragon");
        }else if(year % 12 == 9){
            System.out.print("Your Chinese Zodiac is: Snake");
        }else if(year % 12 == 10){
            System.out.print("Your Chinese Zodiac is: Horse");
        }else if(year % 12 == 11){
            System.out.print("Your Chinese Zodiac is: Sheep");
        }else{
            System.out.print("Enter valid year!");
        }
    }
}
