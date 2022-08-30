package OOP.WorkCar;

public class Car {
    //attributes
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 120;

    Car(String type, String model, String color){
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    //behaviors
    int increaseSpeed(int increment){
        if((this.speed + increment) < this.speedLimit){
            this.speed = this.speed + increment;
        }
        return this.speed;
    }

    int decreaseSpeed (int decrease){
        if(this.speed > 0){
            this.speed = this.speed - decrease;
        }
        return this.speed;
    }

    void printSpeed(){
        System.out.println(this.model + " speed: " + this.speed);
    }

    void printInfo(){
        System.out.println("===============================" 
            + "\nType: " + this.type 
            + "\nModel: " + this.model
            + "\nColor: " + this.color 
            + "\nSpeed: " + this.speed);
    }
}
