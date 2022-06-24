package Workshops;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * A simple program calculates the grade average.
 */
public class GradeAverage {
    public static void main(String[] args) {

        int math, turkish, physics, chemistry, music, average, passGrade = 55;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your Math grade:");
        math = keyboard.nextInt();
        System.out.print("Enter your Turkish grade:");
        turkish = keyboard.nextInt();
        System.out.print("Enter your Physics grade:");
        physics = keyboard.nextInt();
        System.out.print("Enter your Chemistry grade:");
        chemistry = keyboard.nextInt();
        System.out.print("Enter your Music grade:");
        music = keyboard.nextInt();
        keyboard.close();

        if(((math >=0 && math <=100) && (turkish >=0 && turkish <=100)&&(physics >=0 && physics <=100)&&(chemistry >=0 && chemistry <=100)&&(music >=0 && music <=100))){
            average = (math + turkish + physics + chemistry + music) / 5;
            if(average >= passGrade){
                System.out.println("Congrats! You pass the class. Your average: " + average);
            }else{
                System.out.println("Sorry! You couldn't pass the class. Your average: " + average);
            }
        }else{
            System.out.println("Please type valid grade!");
        }
    }
}
