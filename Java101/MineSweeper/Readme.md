# **Mine Sweeper Game**

This class contains attributes and methods to allow user to play Mine Sweeper game.

* The game is string based. Multidimensional arrays were used and designed within the MineSweeper class.
* The size of the matrix, that is, the number of rows and columns, is determined by the user.

* A quarter of the number of elements in the array (number of elements / 4) were randomly placed.
  * For example, if the array is 4x3 in size, the number of elements should be calculated with the formula (Number of Rows * Number of Columns) and its size should be 12. In this case, the number of mines should be 12 / 4 = 3 pieces.

* The user selects a point on the matrix. Enters row and column values for point selection.
  * It is checked whether the selected point is within the borders of the array and if the condition is not met, it is requested to enter a point again.
  * If there is a mine at the point where the user enters, he loses the game.
  * If there are no mines, all positions that touch the relevant point should be looked at (right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) and the sum of the number of mines around should be written on the relevant point. If there is no mine touching the point, the value "0" should be assigned.

* If the user can select all the points without pressing any mines, he wins the game.

## ***An Example Output***

![Output-Mine-Sweeper](https://user-images.githubusercontent.com/63460173/192108788-95b79618-5a64-404f-933b-1a4b02652639.png)


----

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)
