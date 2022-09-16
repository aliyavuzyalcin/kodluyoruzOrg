package Arrays.ArrayRecap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         Write a program that finds the closest smallest number of elements in
 *         the array, and that finds the closest greatest number of elements in
 *         the array.
 */
public class NearestValue {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number;

        int[] array = { 15, 12, 788, 1, -1, -778, 2, 0 };
        System.out.println("The array: " + Arrays.toString(array)); // printed the array on the screen

        Arrays.sort(array); // sorted the array in order to navigate through the elements of the array one by one..
                            
        System.out.println("The sorted array: " + Arrays.toString(array));

        /*
         * Min and Max variables created in order to collect min and max value of the
         * array.
         */
        int max = array[0];
        int min = array[0];

        /*
         * Take a number from user so that we can look for the nearest values thru the
         * sorted array.
         */
        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        /*
         * For loop will help us to visit each elements of the sorted array.
         * 
         * it starts to visit each elements. If the element is smaller than the given
         * number then this smaller value will be new <b>min</b> value.
         * Then it will continue to visit the other elements.
         * If the element is greater than the given number and if it is the first one
         * greater than the given number then it will stop visiting the others with
         * <b>break</b> operator.
         * Then this greater value will be new <b>max</b> value.
         * Lastly, it prints the min and the max values on the screen.
         */
        for (int row = 0; row < array.length; row++) {
            if (array[row] < number) {
                min = array[row];
            }
            if (array[row] > number) {
                max = array[row];
                break;
            }
        }
        System.out.println(
                "The nearest smaller number than input: " + min + "\nThe nearest greater number than input: " + max);
        keyboard.close();
    }
}
