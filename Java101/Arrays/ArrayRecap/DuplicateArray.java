package Arrays.ArrayRecap;

import java.util.Arrays;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         A program that specifies repeating even and odd numbers in a string
 *         of numbers.
 */
public class DuplicateArray {
    public static void main(String[] args) {

        int[] array = { 2, 2, 3, 3, 12, 21, 6, 6, 0, 12, 1 };

        System.out.print("Original Array: ");
        printArray(array);

        System.out.println("\n===============");

        System.out.print("Even Duplicated Array: ");
        printArray(duplicateEven(array));

        System.out.println("\n===============");

        System.out.print("Odd Duplicated Array: ");
        printArray(duplicateOdd(array));

    }

    /**
     * Takes an array and a value. Then looks for the same value in the array.
     * 
     * @param array is the one collected duplicated elememnts in it.
     * @param value is the one compared with the elements of the array.
     * @return true if there is duplicated elements in the array we collected
     *         duplicated elements in from the original array
     * @return false if there is no duplicated elements in the array we collected
     *         duplicated elements in from the original array.
     */
    public static boolean isFind(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Controls the duplicated <b>Odd</b> elements thru the original array.
     * If there is no duplicated elements or no more duplicated elements, then it
     * will return the duplicate array and its elements will be 0.
     * 
     * @param array The original array which will be controlled within this method.
     * @return duplicate array, which is the one created in this method. It collects
     *         the duplicated odd numbers.
     */
    public static int[] duplicateOdd(int[] array) {
        int startIndex = 0;
        int[] duplicate = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]) && (array[i] % 2 != 0)) {
                    if (!isFind(duplicate, array[i])) {
                        duplicate[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }
        return duplicate;
    }

    /**
     * Controls the duplicated <b>Even</b> elements thru the original array.
     * If there is no duplicated elements or no more duplicated elements, then it
     * will return the duplicate array and its elements will be 0.
     * 
     * @param array The original array which will be controlled within this method.
     * @return duplicate array, which is the one created in this method. It collects
     *         the duplicated odd numbers.
     */
    public static int[] duplicateEven(int[] array) {
        int startIndex = 0;
        int[] duplicate = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]) && (array[i] % 2 == 0)) {
                    if (!isFind(duplicate, array[i])) {
                        duplicate[startIndex++] = array[i];
                    }
                }
            }
        }
        return duplicate;
    }

    /**
     * Prints the array. Using Array.toString method.
     * 
     * @param array The array that will be printed.
     */
    public static void printArray(int[] array) {
        System.out.print(Arrays.toString(array));
    }

}
