package Workshops;

import java.util.Scanner;

/**
 * 
 * @author Ali Yavuz Yal��n
 *
 *         Write the program that takes the exam scores of Mathematics, Physics,
 *         Chemistry, Turkish, History, Music courses from the user and
 *         calculates the averages and prints them on the screen.
 *         In the same program, by using conditional expressions, if the average
 *         of the user is greater than 60, the screen should write "Passed the
 *         Class", if it is less, "Failed in the Class".
 *         Note: If and Else will not be used...
 */
public class FundWork1 {

	public static void main(String[] args) {

		int math, physics, turkish, history, music, average;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your Mathematic grade: ");
		math = keyboard.nextInt();

		System.out.print("Enter your Physics grade: ");
		physics = keyboard.nextInt();

		System.out.print("Enter your Turkish grade: ");
		turkish = keyboard.nextInt();

		System.out.print("Enter your History grade: ");
		history = keyboard.nextInt();

		System.out.print("Enter your Music grade: ");
		music = keyboard.nextInt();

		keyboard.close();

		average = (math + physics + turkish + history + music) / 5;
		String result = (average >= 60) ? "Passed" : "Failed";

		System.out.print("Your average is : " + average + "\nYour result : " + result);
	}

}
