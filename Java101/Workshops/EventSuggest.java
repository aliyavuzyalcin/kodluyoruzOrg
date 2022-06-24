package Workshops;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Suggesting Events Based on Air Temperature.
 */
public class EventSuggest {
    public static void main(String[] args) {
        
        double heat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the heat:");
        heat = keyboard.nextDouble();

        if(heat < 5){
            System.out.println("You can go to ski.");
            
        }else if (heat >=5 && heat < 25){
            if(heat < 15){
                System.out.println("You can go to the cinema.");
            }else{
                System.out.println("You can go to picnic.");
            }
        }else{
            System.out.println("You can go to swim.");
        }

        keyboard.close();	
    }
}
