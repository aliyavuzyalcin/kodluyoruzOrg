package Arrays;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * In this document, you can find two dimensional operations like adding elements, creating two-dimensional array and multiply them.
 */
public class TwoDimensional {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int rows, rows2 = 0;
        int columns, columns2 = 0;
        int operation;
        boolean flag = false;

        System.out.println("\n=========== WELCOME TO ARRAY PROGRAM! =============\n");
        
        do {
            System.out.print("Enter the number of rows: ");
            rows = keyboard.nextInt();
            System.out.print("Enter the number of columns: ");
            columns = keyboard.nextInt();

            System.out.print("Enter the number of rows for second matris: ");
            rows2 = keyboard.nextInt();
            System.out.print("Enter the number of columns for second matris: ");
            columns2 = keyboard.nextInt();

            System.out.println("Creating first array...");
            int[][] array = new int[rows][columns];
            addElements(array);

            System.out.println("\nCreating second array...");
            int[][] array2 = new int[rows2][columns2];
            addElements(array2);

            System.out.print("\nPlease select an operation => 1- Matrices Multiplication || 2- Matrices Addition || 0- Exit: ");
            operation = keyboard.nextInt();
            
            switch (operation) {
                case 0:
                    System.out.println("Goodby!");
                    flag = false;
                    break;
                case 1:
                    printArray(multiplyMatrices(array, array2));                        
                    break;

                case 2:
                    printArray(additionMatrices(array, array2));
                    break;

                default:
                    System.out.println("Please enter valid number!");
                    break;
            }
           
            if(operation == 0){
                break;
            }else{

                System.out.println("Do you want to exit? (0 for continue || -1 for exit)");
                operation = keyboard.nextInt();
                if(operation == -1){
                    System.out.println("Goodby!");
                    break;
                }
            }
        } while (!flag);

        keyboard.close();
    }

    /**
     * This method let user to add new elements to array. It takes an array as a parameter. 
     * Then takes each elements from user and add elements into array via for loops.
     * Then return that array.
     * @param array taken to add elements into it.
     * @return <b>array</b> ,which just created.
     */
    public static int[][] addElements(int[][] array) {
        Scanner keyboard = new Scanner(System.in);

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.print("Enter number: ");
                array[row][column] = keyboard.nextInt();
            }
            System.out.println();
        }
        
        return array;
    }

    /**
     * This method takes a two dimensional array and print it on the screen.
     * @param array to be printed on the screen.
     */
    public static void printArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This method calculates the multiplication of two matrices. Takes two multidimensional int arrays as parameters.
     * Assing the rows and columns of these arrays to locally created two dimensional array, which is <b>"result"</b>.
     * After that it controls the rule of multiplication via <b>isEqualToMultiply()</b> method. 
     * <b>If it is true</b> then it calculates the result.
     * In for loop, rows of the matris will be smaller than the value of rows of result array.
     * While the rows of the matris is smaller than the value of rows of result array, the columns of the matris will be smaller than the value of
     * columns of result array. So that loops can visit each elements of result array and add calculated values to the array.
     * To calculate the multiplication, used <b>multiplyMatricesCell()</b> method.
     * <b>If it is NOT true</b> then it prints the error message.
     * 
     * @param array first array
     * @param array2    second array    
     * @return <b>result</b> the array locally created and the result of the math.
     */
    public static int[][] multiplyMatrices(int[][] array, int[][] array2) {

        int numberOfRows = array.length;
        int numberOfColumns = array2[0].length;
        int[][] result = new int[numberOfRows][numberOfColumns];

        if(isEqualToMultiply(array, array2)){

            for (int row = 0; row < result.length; row++) {
                for (int column = 0; column < result[0].length; column++) {
                    result[row][column] = multiplyMatricesCell(array, array2, row, column);
                }
            }
        }else {
            System.out.println("Number of columns of the first matris isn't equal to the number of rows of the second matris!");
        }

        return result;
    }

    /**
     * Multiplying the row of array with the column of array2. 
     * Let say row = 3 and col=4. 
     * If i = 0 firstMatrix[3][0] * secondMatrix[0][4] 
     * If i = 1 firstMatrix[3][1] * secondMatrix[1][4] 
     * If i = 2 firstMatrix[3][2] * secondMatrix[2][4] 
     * As <b>i</b> changes, the row and column are multiplied.
     * 
     * @param array first matrix.
     * @param array2    second matrix.
     * @param row   value of first array's row.
     * @param column    value of second array's column.
     * @return  <b>cell</b> each cell of result array.
     */
    public static int multiplyMatricesCell(int[][] array, int[][] array2, int row, int column) {
        int cell = 0;
        for (int i = 0; i < array2.length; i++) {
            cell = cell + array[row][i] * array2[i][column];
        }
        return cell;
    }

    /**
     * This method calculates the addition of two matrices. Takes two multidimensional int arrays as parameters.
     * Assing the rows and columns of these arrays to locally created two dimensional array, which is <b>"result"</b>.
     * After that it controls the rule of addition via <b>isEqualToAdd()</b> method. 
     * <b>If it is true</b> then it calculates the result.
     * In for loop, rows of the matris will be smaller than the value of rows of result array.
     * While the rows of the matris is smaller than the value of rows of result array, the columns of the matris will be smaller than the value of
     * columns of result array. So that loops can visit each elements of result array and add calculated values to the array.
     * To calculate the addition, used <b>additionMatricesCell()</b> method.
     * <b>If it is NOT true</b> then it prints the error message.
     * 
     * @param array first matrix
     * @param array2 second matrix
     * @return <b>result</b> 
     */
    public static int[][] additionMatrices(int[][] array, int[][] array2) {
        int numberOfRows = array.length;
        int numberOfColumns = array2[0].length;
        int[][] result = new int[numberOfRows][numberOfColumns];

        if (isEqualToAdd(array, array2)) {

            for (int row = 0; row < numberOfRows; row++) {
                for (int column = 0; column < result[0].length; column++) {
                    result[row][column] = additionMatricesCell(array, array2, row, column);
                }
            }
        }else{
            System.out.println("Number of rows and columns are not equal!");
        }
        return result;
    }
    /**
     * Adding the row of array with the row of array2. 
     * Let say row= 3 and col= 4. 
     * If i = 0 firstMatrix[0][4] * secondMatrix[0][4]
     * If i = 1 firstMatrix[1][4] * secondMatrix[1][4]
     * If i = 2 firstMatrix[2][4] * secondMatrix[2][4]
     * As <b>i</b> changes, the row and row are added.
     * 
     * @param array first matrix
     * @param array2 second matrix
     * @param row
     * @param column
     * @return <b>result</b>
     */
    public static int additionMatricesCell(int[][] array, int[][] array2, int row, int column) {
        int cell = 0;
        for (int i = 0; i < array2.length; i++) {
            cell = cell + array[i][column] + array2[i][column];
        }
        return cell;
    }
    /**
     * The rule of add two matrix is that their row & column values must be equal.
     * An example= Matrix A is 3x4, since Matrix B has to be the same with A so Matrix B would be 3x4 too.
     * To control this rule, isEqualToAdd method helps. It takes two two-dimensional array and controls their row and column values.
     * If they are same then it returns true. If not, then returns false.
     * 
     * @param array first matrix
     * @param array2 second matrix
     * @return  flag, which is a boolean value let us understand if the matrices are equal.
     */
    public static boolean isEqualToAdd(int[][] array, int[][] array2) {

        boolean flag = false;
        if ((array.length == array2.length) && (array[0].length == array2[0].length)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
    /**
     * The rule of multiplication of two matrices is that the first matrix' column & second matrix' row values must be equal.
     * An example= Matrix A is 3x4, since Matrix B's row has to be the same with A's column so Matrix B would be 4x4.
     * To control this rule, isEqualToMultiply method helps. It takes two two-dimensional array and controls their row and column values.
     * If they are same then it returns true. If not, then returns false.
     * 
     * @param array first matrix
     * @param array2 second matrix
     * @return  flag, which is a boolean value let us understand if the matrices can be multiplied.
     */
    public static boolean isEqualToMultiply(int[][] array, int[][] array2) {

        boolean flag = false;
        if ((array[0].length == array2.length)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

}
