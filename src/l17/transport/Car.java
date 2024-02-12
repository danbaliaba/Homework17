package l17.transport;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Car {

    private int count = 0;
    public String[] i = new String[5];
    public String[] arrayofAutos;
    String model, cl;
    double maxSpeed;

    public Car (String model, String cl, double maxSpeed) {
        this.cl = cl;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void arrayAdd (String model){

        i[count] = model;
        count++;
        if ( count >= i.length)
        {
            i = Arrays.copyOf(i, i.length + 1);
        }


    }
    public String toString() { return "Car Model is " + this.model + ", colour is " + this.cl + ", MaxSpeed = " + this.maxSpeed;

    }
}
