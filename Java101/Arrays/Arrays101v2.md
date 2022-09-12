# **One-Dimensional Arrays**

One-dimensional arrays are simply a structure that holds a list of elements of the same type. To create an array, first the type of elements to be included in the array is specified, then a name is given to the array and square brackets ( [ and ] ) are placed after the name.

    int numbers[]; // Here an array called numbers is created

Instead of putting the square brackets after the variable name, you can also write it after the type name. For example, the following code is no different from the above:

    int[] numbers; // Here an array called numbers is created

Arrays are created with the new statement. It is mandatory to give a capacity value when creating an array. The capacity value specifies how many elements the array will contain. The following example creates an array that can hold 5 int variables:

    int[] numbers = new int[5];

When this statement is executed, enough space is allocated in memory for 5 int variables. We use index numbers to edit this field. Array indexes start at 0 and go up to 1 less than capacity. For example, the indexes of the above array are from 0 to 4. Now let's give the first element of this array:

    numbers[0] = 10; // The first element of the array is set to 10.

Let's give the other elements of the array as follows:

    numbers[1] = 15;
    numbers[2] = 20;
    numbers[3] = 25;
    numbers[4] = 30;

When these codes are run, the elements of the array will be as follows, respectively:

{ 10, 15, 20, 25, 30 }

When you run the following code, it writes 25 to the console:

    System.out.println(numbers[3]);

You have to be very careful with index numbers when dealing with arrays. If you try to access an index outside the range of the array, ****IndexOutOfBoundsException**** error will occur.

    System.out.println(numbers[5]); //Error!

The above line will cause the error; because we are trying to access the 6th element of the array, even though the numbers array has a capacity of 5.

If the elements in the array are obvious when creating the array, we can give the elements in curly braces and separated by commas when creating the array:


    String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

We don't need to give capacity to arrays created this way; because the capacity value is already determined by the number of elements. In the above example, the capacity of the weekDays array is automatically 7.

There is no need to use the new statement when creating an array as above. So, we can write the above code as follows:

    String[] weekDays = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

## **Learning the Capacity of the Series**

Each array has a property called length. You can find out the capacity of the array using this feature.

For example, let's examine the following code:

    int[] numbers = new int[100];
    System.out.println(numbers.length); // Writes 100 in console

## **Changing an Element of an Array**

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    cars[2] = "Toyota";

    System.out.println(cars[0]);


----

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)