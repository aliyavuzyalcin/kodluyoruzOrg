# **Classes**

**Java is an Object Oriented programming language**. Everything in Java is associated with ***classes and objects***, along with their ***variables and methods***. For example: in real life **the car is an object**. The car has **variables such as weight and color, and methods such as driving and braking**. 

> **The purpose of object-oriented programming is to turn the code we write into an abstract concept.**

Classes have **attributes and behaviors**. In programming, *variables* are defined for attributes and methods are defined for behaviors.

### **SYNTAX**

    class <CLASS_NAME> {
	<variable>;
	<methods>;
    }

When defining a **"class"** in Java, the **"class"** statement is used and then the class name is written. *Class names* in Java **must always start with a capital letter and must have the same name as the generated Java file**.

After giving the class name, we create the **scope of the class**, *namely the code block*, with the **"{"** sign. We close the scope of the class with the **"}"** parenthesis. Thus, the codes we will write for our class will be written in the area between **"{}"**. This represents the scope of the class.

After we open the class code block, we write the variables and methods for this code block. Remember that methods also have their own *code blocks*, namely scopes. We also denote them with **"{}"**.

    class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
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

***Class and function definitions are given above in detail.***

### **Summary**
-   ***Classes are templates created in the software world to create objects. This template ensures that all the properties and behaviors to be modeled for the object are coded into a blueprint. Thus, we can create thousands of objects from a defined class.***

---

[Ali Yavuz YALCIN](https://www.linkedin.com/in/ali-yavuz-yalcin/)

[Patika.dev](https://www.patika.dev/tr)