# **Arrays General Logic**

Arrays in Java are used to **store multiple values in a single variable** instead of creating separate variables for each value. Variables allow us to keep a single value in memory. But in some cases, we want to have multiple data together. For example, suppose there are 20 students studying in a class. Instead of creating 20 individual variables in memory for these 20 students, we may want to keep a collection of 20 students using a single variable.

In such cases we use arrays. Array is a unit of memory that allows us to hold more than one variable of the same type. ***In short, we use arrays to group elements of the same type.*** After creating the array, we access and replace the elements in the array with the index number. It is also possible to create multidimensional arrays. We can use one-dimensional arrays, or we can create 2 or 3-dimensional arrays. *2D arrays are called matrices.*

Array concept refers to a data type in programming languages. This data type is called the structure that holds the sequential data in the form of a list. Elements of this pipeline can be accessed via index. Arrays are of fixed size and their dimensions are specified when they are defined.

![array](https://user-images.githubusercontent.com/63460173/189629720-7721f2e4-d031-4c35-8d44-d14b436f53f8.jpg)

The example above is an array holding the data type "Integer" with a size of 10 elements. Index numbers are used to access any element in arrays. Array indices always start at 0, so the value of the last element of the array is not equal to the array size, and this is something to be aware of.

The array has a starting address in memory, and other consecutive elements are placed in memory in order. Arrays are created with the "new" keyword. Thus, they take up space in the **Heap Memory region**.

    double[] myList;   // preferred way

veya 

    double myList[];   // other form of definition

Arrays are specified with the data type and [] brackets. Two different definitions are shown above. The **"new"** keyword is used to allocate space to the array.

    double[] myList = new double[10];

Above, an array of "double" data type that can take up to 10 elements has been created.

The variable **"myList"** holds the starting address of the directory. Since there is a sequential order in the arrays, the memory addresses of the elements following the first element also increase one by one. The array takes up space in blocks. The index number is used to access the array. For example: Saying **"myList[0]"** will return the **1st Element** of the array. Indexes of arrays in Java start at zero. ***For example: "myList[5]", that is, when we say give the array element at index 5, we actually reach the 6th element of the array.***

Examples:

    // In Java, the initial values of the array are enclosed in curly braces.
    double[] myList = { 1.9, 2.9, 3.4, 3.5 };

    // prints all array elements to the screen sequentially, leaving a space in between.
    for (int i = 0; i < myList.length; i++)
    {
        System.out.println(myList[i] + " ");
    }

In the above example, the array named myList is given its initial values immediately. Values between the curly brackets are array elements.

Then, the array elements are printed to the screen with a "for" loop.

## **Passing Arrays as Parameters to Functions**

You can send the arrays you define as parameters to the functions.

For example, suppose we have a static function. If we want to give an array with int type data as input to this function, it will be as follows.

    public static void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

In Java, all variables are passed with the **"Pass by Value"** method. This means this. ***An exact copy of the variable, object or array you define is created. This duplicate value goes to the function as a local variable.*** This is a detail that you may be asked in Java interviews.

## **Returning Arrays from Functions**

***Functions are code blocks that can do a certain job and return a value as a result.*** *The golden rule for functions is that each function should have only one job.* For example: a function that does array averaging should not print arrays to the screen. Or the averaging of the arrays and the addition of the arrays should not be in the same function. Each should be separate functions.

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
   
        return result;
    }

Above is a function that returns an inverted array. Here we say that we will return an array and the data type of this array. Here our data type is "int".

----

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)