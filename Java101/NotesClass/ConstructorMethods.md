# **Constructor Methods**

Constructor methods are written while the class is being designed. You can also define your constructor methods while writing your class. If you don't define any constructor method inside the class, an empty constructor method with no parameters is automatically defined by Java.

Constructor methods are special methods (functions) that are run during the object generation phase when you try to create an object from the related class. **The names of the constructor methods must be the same as the class name.** There is no need to define a return type or void.

When creating an object with the **"new"** keyword, the constructor method is invoked. There are two types of constructor methods:

*   Parameterless Default Constructor Method

*   Parameterized Constructor Method

Our **Car** class:

    public class Car {
        // attributes
        String type;
        String model;
        String color;
        int speed;

        // Constructor Method
        Car(String type, String model, String color) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.speed = 0;
        }

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

        void printInfo() {
            System.out.println("================");
            System.out.println("Model  : " + this.model);
            System.out.println("Color  : " + this.color);
            System.out.println("Type  : " + this.type);
            System.out.println("Speed  : " + this.speed);
        }
        // ...
    }

Our ***Objects***:

    public class Main {
        public static void main(String[] args) {
            
            Car audi = new Car("Sports", "Audi", "red");
            audi.increaseSpeed(20);
            audi.printInfo();

            Car bmw = new Car("Sports" , "BMW" , "blue");
            bmw.increaseSpeed(10);
            bmw.increaseSpeed(25);
            bmw.increaseSpeed(5);
            bmw.decreaseSpeed(25);
            bmw.printInfo();

            Car mercedes = new Car("Corporate" , "Mercedes" , "black");
            mercedes.speed = 20;
            mercedes.printInfo();
        }
    }

**Output** of the program:

    ================
    Model  : Audi
    Color  : red
    Type  : Sports
    Speed  : 20
    ================
    Model  : BMW
    Color  : blue
    Type  : Sports
    Speed  : 15
    ================
    Model  : Mercedes
    Color  : black
    Type  : Corporate
    Speed  : 20

---

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)