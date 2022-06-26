package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * Make a program that calculates air ticket prices according to distance and conditions with Java. 
 * Get Distance (KM), age and flight type (One Way, Round-Round) information from the user. 
 * Take the fare per distance as 0.10 TL / km. 
 * First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;
 * 
 * Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2). Otherwise, a warning should be given to the user as "You Have Entered Wrong Data".
 *      -If the person is younger than 12 years old, 50% discount is applied on the ticket price.
 *      -If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
 *      -If the person is over 65 years old, a 30% discount is applied on the ticket price.
 *      -If the person has chosen the "FlightType" round trip, 20% discount is applied on the ticket price.
 */
public class FlightTicketCalcu {
    public static void main(String[] args) {
        double distance, pricePerKM = 0.10, priceTotal =0, discountRoundTrip, discountedPrice, discountAge=0, price;
        int age, flightType;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the distance in KM:");   
        distance = keyboard.nextDouble();                   //Take the distance from user.
        System.out.print("Enter your age:");
        age = keyboard.nextInt();                           //Take the age from user.
        System.out.print("Enter the flight type (One way = 1 || Round Trip = 2: ");
        flightType  = keyboard.nextInt();                   //Take the type of flight (One way or Round-trip) from user.
        
        keyboard.close();
        
        if((distance >=0 && age >= 0) && (flightType ==1 || flightType == 2)){  //Distance and age must be positive number AND flight type can be "one way" OR "Round-Trip".
            price = distance * pricePerKM;                  //Calculated the price. Discounts have not included into price.

            if(age < 12){                           //Discounted price have been calculated if the age matches with discount conditions.
                discountAge = price * 0.50;
            }else if(age >= 12 && age <= 24){
                discountAge = price * 0.10;
            }else if(age >= 65){
                discountAge = price * 0.30;
            }

            if(flightType == 2){                                    //If user have picked Roun-trip fligt then new price has calculated. 
                discountedPrice = price - discountAge;
                discountRoundTrip = discountedPrice * 0.20;
                priceTotal = (discountedPrice - discountRoundTrip) * 2;
            }else {                                                 //If not, then take the price how it has already calculated.
                priceTotal = price - discountAge;
            }
            System.out.print("Total amount: " + priceTotal);        //Print the total amount.

        }else{
            System.out.print("Ups.. Something went wrong. Check your information again!");
        }
    }
}
