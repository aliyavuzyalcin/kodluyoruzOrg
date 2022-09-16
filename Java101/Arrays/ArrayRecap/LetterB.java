package Arrays.ArrayRecap;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Program to Print Letter A with Multidimensional Arrays
 */
public class LetterB {
    public static void main(String[] args) {
       
        String[][] letterB = new String[7][4];
       
        for (int row = 0; row < letterB.length; row++) {
           
            for (int column = 0; column < letterB[row].length; column++) {
                
                if ((row == 0 || row == 3 || row == 6) || (column == 0 || column == 3)) {
                    
                    letterB[row][column] = "*";

                } else {
                    letterB[row][column] = " ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
