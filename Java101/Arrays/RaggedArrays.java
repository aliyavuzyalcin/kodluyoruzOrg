package Arrays;


/**
 * Ragged arrays can be defined as arrays of arrays. Two dimensional arrays are basically matrices.
 * But in this Ragged arrays we can add new one-dimensional arrays to each row of the main array.
 * Let say we have a ragged array with 3 rows. Each rows will have different amount of columns because this is a ragged arrray.
 * Say we put "1" to first row. Put "2" to second row. Put "3" to third row. It looks like this;
 * int[][] ragged = new int[3][];
 * ragged[0] = ragged[1]; ==> First Row.
 * ragged[1] = ragged[2]; ==> Second Row.
 * ragged[2] = ragged[3]; ==> Third Row.
 * 
 * Output will be;
 * 
 *  [0]
 *  [1][2]
 *  [2][3][4]
 */
public class RaggedArrays {
    public static void main(String[] args) {
        
        //Created a ragged array.
        int[][] ragged = new int[3][];
        ragged[0] = new int[1];         // added 1 column to first row.
        ragged[1] = new int[2];         // added 2 column to second row.
        ragged[2] = new int[3];         // added 3 column to third row.
        
        printRaggedArray(raggedAddElements(ragged));
    }
    /**
     * Add elements to the ragged array. It adds number starting from its value of row. If row is 2, then it will start from 2 to add numbers.
     * @param ragged array which elements will be assigned to.
     * @return  ragged array.
     */
    public static int[][] raggedAddElements(int[][] ragged){
        
        int number = 0;
        for (int row = 0; row < ragged.length; row++) {
            number = row;
            for (int column = 0; column < ragged[row].length; column++) {
                ragged[row][column] = number++;
            }
        }
        return ragged;
    }
    /**
     * This will print the ragged array row by row.
     * @param ragged the array will be printed on screen.
     */
    public static void printRaggedArray(int[][] ragged){
        
        for (int row = 0; row < ragged.length; row++) {
            for (int colum = 0; colum < ragged[row].length; colum++) {
                System.out.print(ragged[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
