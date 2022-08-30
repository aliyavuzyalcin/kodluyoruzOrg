package OOP.WorkCar;

public class Main {
    public static void main(String[] args) {
        
        Car audi = new Car("Sports", "Audi", "Red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports", "BMW", "Blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate", "Mercedes", "Black");
        mercedes.speed = 20;
        mercedes.printInfo();


    }
}
