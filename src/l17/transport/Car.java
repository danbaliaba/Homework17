package l17.transport;

public class Car {
    String model, cl;
    double maxSpeed;

    public Car (String model, String cl, double maxSpeed){
        this.model = model;
        this.cl = cl;
        this.maxSpeed = maxSpeed;
    }
    public String toString() { return "Car Model is " + this.model + ", colour is " + this.cl + ", MaxSpeed = " + this.maxSpeed;

    }
}
