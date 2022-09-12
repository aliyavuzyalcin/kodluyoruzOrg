# **Object Creation**

Classes are templates that describe objects. Objects are physical structures produced from these templates. Each generated object is kept in the Account Memory Region. Thus, we obtain a structure that has a physical counterpart from the class. We can create tens or hundreds of objects from the class. They all point to other addresses in memory.

    public class Car {
    // attributes
    String type;
    String model;
    String color;
    int speed;

    // behavior
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }
    
    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
    }

Syntax for generating objects in Java:

    ClassName object = new ClassName();  

*   **ClassName :** We specify the class we want to create an object. This class must have been defined in our project before.

*   **Object :** It is the name we give to the object and more than one object with the same name cannot be created.

*   **New :** We use the "new" keyword to create objects in Java.

*   **ClassName(); :** Represents the Constructor Method of the class. By default it is defined without parameters.

Creating an example object of the Car class:

    Car audi = new Car();
    Car bmw = new Car();
    Car mercedes = new Car();

*   In the example above, we produced 3 different objects of the "Car" class. Although the qualities of each of these objects are different, they occupy a separate place in the memory.

## **Accessing Class Attributes**

*   **A period (.)** is used to access attributes of classes. The name of the attribute to be accessed is written by putting a dot at the end of the name of the relevant object.

        public class Main {
        public static void main(String[] args) {
            Car audi = new Car();
            audi.speed = 10;
            System.out.println("Audi Speed : " + audi.speed);

            Car bmw = new Car();
            bmw.speed = 25;
            System.out.println("Bmw Speed : " + bmw.speed);

            Car mercedes = new Car();
            mercedes.speed = 30;
            System.out.println("Mercedes Speed : " + mercedes.speed);

            }
        }

Output of the program:

    Audi Speed : 10
    Bmw Speed : 25
    Mercedes Speed : 30

## **Accessing Class Methods**

*   **The dot (.)** is used to access the behaviors (i.e. methods) belonging to the class. The name of the method to be accessed is written by putting a dot at the end of the name of the relevant object and its parameters, if any, are entered.

        public class Main {
        public static void main(String[] args) {
            Car audi = new Car();
            audi.speed = 10;
            audi.increaseSpeed(20);
            audi.printSpeed();

            Car bmw = new Car();
            bmw.increaseSpeed(10);
            bmw.increaseSpeed(25);
            bmw.increaseSpeed(5);
            bmw.decreaseSpeed(25);
            bmw.printSpeed();

            Car mercedes = new Car();
            mercedes.speed = 20;
            mercedes.printSpeed();

            }
        }

Output of the program:

    Speed : 30
    Speed : 15
    Speed : 20


---

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)