package MineSweeper;

import java.util.Random;
import java.util.Scanner;

/**
 * This class contains attributes and methods to allow user to play Mine Sweeper
 * game.
 * 
 * The game is string based.
 * 
 * Multidimensional arrays were used and designed within the MineSweeper class.
 * 
 * The size of the matrix, that is, the number of rows and columns, is
 * determined by the user.
 * 
 * A quarter of the number of elements in the array (number of elements / 4)
 * were randomly placed. For example, if the array is 4x3 in size, the number of
 * elements should be calculated with the formula (Number of Rows * Number of
 * Columns) and its size should be 12. In this case, the number of mines should
 * be 12 / 4 = 3 pieces.
 * 
 * The user selects a point on the matrix. Enters row and column values for
 * point selection. It is checked whether the selected point is within the
 * borders of the array and if the condition is not met, it is requested to
 * enter a point again.
 * 
 * If there is a mine at the point where the user enters, he loses the game.
 * 
 * If there are no mines, all positions that touch the relevant point should be
 * looked at (right, left, up, down, upper left diagonal, upper right diagonal,
 * lower right diagonal, lower left diagonal) and the sum of the number of mines
 * around should be written on the relevant point. If there is no mine touching
 * the point, the value "0" should be assigned.
 * 
 * If the user can select all the points without pressing any mines, he wins the
 * game.
 * 
 * @author Ali Yavuz YALCIN
 * @version 0.0.1
 * 
 */
public class MineSweeper {

    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();

    private int row;
    private int column;
    private int selectionRow;
    private int selectionColumn;
    private int mineCounter;
    private String[][] mineFree;
    private String[][] mineMap;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mineFree = createArray();
        this.selectionRow = 0;
        this.selectionColumn = 0;
        this.mineCounter = 0;
    }

    /**
     * This method lets the game begin and play.
     */
    public void playGame() {
        int gameRound = this.row * (this.column - 1); // Determines how many rounds the user will play.

        System.out.println();
        System.out.println("======== WELCOME TO MINE SWEEPER GAME ========");
        printArray(mineFree);
        System.out.println("====================");
        System.out.println();
        // printArray(createMineField(mineMap)); // You can see the mined map by
        // uncommenting this line.
        createMineField(mineMap); // Mined field is created.
        // System.out.println("====================");
        // Game starts
        while (gameRound > 0) {

            System.out.print("Enter row number: ");
            this.selectionRow = keyboard.nextInt() - 1; // Takes row number from the user
            System.out.print("Enter column number: ");
            this.selectionColumn = keyboard.nextInt() - 1; // Takes column number from the user

            if (isValid(this.selectionRow, this.selectionColumn)) {
                // Check them if they are in the range of the
                // minedMap array

                if (isMined(this.selectionRow, this.selectionColumn) == true) {
                    // Checks if there is mine in that
                    // point. If yes, then game over.
                    System.out.println();
                    System.out.println("====================");
                    System.out.println("Boom!! You stepped on a mine.. Game Over!");
                    System.out.println();
                    printArray(this.mineMap);
                    break;
                } else {
                    // If there is no mine in that point, then it checks the other points and assign
                    // the number of mines
                    // to the selected point of mined map.
                    this.mineMap[this.selectionRow][this.selectionColumn] = String
                            .valueOf(mineCount(selectionRow, selectionColumn));

                    System.out.println();
                    printArrayMineless(mineMap); // Then it prints the customed mined map on the secreen.

                }
            } else {
                System.out.println("Please enter valid value!");
                // If the user pass an invalid range of array, it
                // prints the error message on the secreen.
            }
            System.out.println("===============");
            gameRound--; // Decrement the game round number.

            if (gameRound == 0) {
                // If game number is equal to 0 and the user hasn't stepped on a mine yet then
                // it means he won the game.
                System.out.println("Congratulations! You Won!");
                printArray(this.mineMap);
            }

        }

    }

    /**
     * This method prints the mine free map on the screen.
     * It takes mined map and checks the mines locations. Once it found the location
     * of mines, it DOESN'T REPLACE the '*' elements but prints '-' element instead
     * of printing '*' elements.
     * 
     * @param minedMap The mined map which will be printed on the screen.
     */
    private void printArrayMineless(String[][] minedMap) {
        for (int i = 0; i < minedMap.length; i++) {
            for (int j = 0; j < minedMap[i].length; j++) {
                if (minedMap[i][j].equals("*")) {
                    System.out.print("-" + " ");
                } else {
                    System.out.print(minedMap[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * This is a boolean method checks the row and column values if they are in the
     * range of created array.
     * 
     * @param row    value.
     * @param column value.
     * @return false if row or column out of array length.
     * @return true if row or column within the lenght of array.
     */
    private boolean isValid(int row, int column) {
        if (!((row >= 0 && column >= 0) && (row < this.mineMap.length && column < this.mineMap[0].length))) {
            return false;
        }
        return true;
    }

    /**
     * This boolean method checks if the array has '*' in any of its elements.
     * If there is '*' in any element, then it will
     * 
     * @param row    The row value of the mined array.
     * @param column The column value of the mined array.
     * @return true If there is '*' in any element.
     * @return false If there is no '*' in any element.
     */
    private boolean isMined(int row, int column) {
        if (this.mineMap[row][column].equals("*")) {

            return true;
        }
        return false;
    }

    /**
     * This is a method returns amount of mines in the mined array.
     * It takes a specific point such as minedMap[2][2]. Then it starts to check
     * every points this specific point touches to if they have mine '*'. If so,
     * then the counter will be increased by one. If row and column are out of range
     * then it will return -1.
     * 
     * @param row    The row value of the mined array.
     * @param column The column value of the mined array.
     * @return this.mineCounter The variable hold the amount of mines.
     */
    private int mineCount(int row, int column) {
        this.mineCounter = 0;
        if (this.row >= row && this.column >= column && row >= 0 && column >= 0) {
            if (row - 1 >= 0 && column - 1 >= 0) {
                if (this.mineMap[row - 1][column - 1].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (row - 1 >= 0) {
                if (this.mineMap[row - 1][column].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (row - 1 >= 0 && column + 1 < this.column) {
                if ((column - 1 > 0) && this.mineMap[row][column - 1].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (column - 1 > 0) {
                if (this.mineMap[row][column - 1].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (column + 1 < this.column) {
                if (this.mineMap[row][column + 1].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (row + 1 < this.row && column - 1 >= 0) {
                if (this.mineMap[row + 1][column - 1].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (row + 1 < this.row) {
                if (this.mineMap[row + 1][column].equals("*")) {
                    this.mineCounter++;
                }
            }
            if (row + 1 < this.row && column + 1 < this.column) {
                if (this.mineMap[row + 1][column + 1].equals("*")) {
                    this.mineCounter++;
                }
            }
        } else {
            return -1;
        }
        return this.mineCounter;
    }

    /**
     * This method generate the map without mines.
     * 
     * @return this.mineMap The map will be filled with mines.
     */
    private String[][] createArray() {

        this.mineMap = new String[this.row][this.column];
        for (int i = 0; i < this.mineMap.length; i++) {
            for (int j = 0; j < this.mineMap[i].length; j++) {
                this.mineMap[i][j] = "-";
            }
        }
        return this.mineMap;
    }

    /**
     * This method creates mined field. It adds '*' mines randomly to the array it
     * takes.
     * 
     * @param mineFree The array that has no mine in it.
     * @return this.mineMap The array that has filled with mines.
     */
    private String[][] createMineField(String[][] mineFree) {
        this.mineMap = mineFree;
        int randomRow = random.nextInt(0, mineFree.length);
        int randomColumn = random.nextInt(0, mineFree.length);
        int counter = 0;
        while (randomRow < mineFree.length && randomColumn < mineFree[0].length) {
            if (counter != mineNumbers()) {
                counter++;
                this.mineMap[randomRow][randomColumn] = "*";
            } else {
                break;
            }
            randomRow = random.nextInt(0, mineFree.length);
            randomColumn = random.nextInt(0, mineFree.length);
        }
        return this.mineMap;
    }

    /**
     * This method prints the array it takes as parameter.
     * 
     * @param array The array will be printed on the consol.
     */
    public void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This method calculates the amount of mines. It multiplies row and column then
     * divide the result with 4.
     * 
     * @return mineNumber The amount of mines that will be added into map.
     */
    private int mineNumbers() {
        int mineNumber = (this.row * this.column) / 4;
        return mineNumber;
    }

}
