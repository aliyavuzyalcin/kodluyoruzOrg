package Arrays.ArrayRecap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         Write a program that sorts the elements of the array from smallest to
 *         largest. Get the size of the array and the elements of the array from
 *         the user.
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length;

        System.out.print("Enter length value n: ");
        length = keyboard.nextInt();

        int[] array = new int[length];
        addElements(array);

        System.out.println("=================");
        System.out.println("Unsorted Array: \n");
        printArray(array);
        System.out.println("=================");

        sortArray(array);

        System.out.println("=================");
        System.out.println("Sorted Array: \n");
        printArray(array);
        System.out.println("=================");

        keyboard.close();
    }

    /**
     * This method sorts the array from smaller to greater.
     * It uses temp variable to hold the value of array[i]. So that we can contain
     * the j value in array[i].
     * In that way, we'll be able to compare -let's say- the first element and the
     * second element without using an extra array.
     * Then temp value (which is now array[i]) will be added to array[j]. So that we
     * can compare it in the next <b>"j"</b> turn.
     * 
     * @param array The array that will be sorted.
     * @return array The one that sorted and will be returned.
     */
    public static int[] sortArray(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * This method uses the Arrays.toString() method to print the given array.
     * 
     * @param array The array that will be printed.
     */
    public static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    /**
     * This is the method that asked user to add elements to the given array.
     * It asks user to give number till array's length.
     * When it is done, it returns the array, which is the one contains the numbers
     * user typed.
     * 
     * @param array The array that will contain the values that user give.
     * @return array The array that contains the values that user gave.
     */
    public static int[] addElements(int[] array) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". element: ");
            int element = keyboard.nextInt();
            array[i] = element;
        }

        return array;
    }
}
