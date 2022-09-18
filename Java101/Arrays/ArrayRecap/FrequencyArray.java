package Arrays.ArrayRecap;

import java.util.Arrays;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         Write a program that finds the frequency of the elements in the
 *         array.
 */
public class FrequencyArray {
    public static void main(String[] args) {

        int[] array = { 10, 20, 20, 10, 10, 20, 5, 20, 10, 15, 15, 2, 0, 0 };
        int count = 0;

        System.out.println("The array: " + Arrays.toString(array));
        System.out.println("Number of repetitions:");
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (i == 0 && array[i + 1] == array[i]) {
                System.out.println(array[i] + " repeated " + count + " times.");
            }

            if (i == 0 && array[i + 1] != array[i]) {
                System.out.println(array[i] + " repeated " + count + " times.");
            }

            if (i != 0 && array[i - 1] != array[i]) {
                System.out.println(array[i] + " repeated " + count + " times.");
            }
        }
    }
}
