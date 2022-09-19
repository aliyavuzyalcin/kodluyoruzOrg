package Arrays.ArrayRecap;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         Write a program that finds the transpose of a matrix constructed with
 *         multidimensional arrays.
 */
public class Transpose {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n, m;

        System.out.println("Enter row & column, n & m:");

        System.out.print("n: ");
        n = keyboard.nextInt();

        System.out.print("m: ");
        m = keyboard.nextInt();

        int[][] a = new int[n][m];

        addElements(a);

        System.out.println();

        System.out.println("MATRIX:");
        printArray(a);
        System.out.println();

        System.out.println("Transpose:");
        printArray(transpose(a));

        keyboard.close();
    }

    /**
     * This method calculates the transpose of the given array.
     * 
     * @param array The array that its transpose will be calculated.
     * @return <b>t</b> - The array that created locally. Then with the help of for
     *         loops it
     *         filled with the elements of the array we took as parameter. But this
     *         <b>"t"</b> array's row number is the number of columns of the array
     *         we took as parameter. And column number is the number of rows of the
     *         array we took as parameter.
     */
    public static int[][] transpose(int[][] array) {
        int n = array.length;
        int m = array[0].length;

        int[][] t = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[j][i] = array[i][j];
            }
        }
        return t;
    }

    /**
     * This method prints the given array.
     * 
     * @param array The array will be printed on the console.
     */
    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This method gets each elements from the user. Then it adds them to given
     * array.
     * 
     * @param array The array that will be filled.
     * @return array The array that filled with the numbers given by user.
     */
    public static int[][] addElements(int[][] array) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Add Element: ");
                array[i][j] = keyboard.nextInt();
            }
            System.out.println();
        }
        return array;
    }
}
