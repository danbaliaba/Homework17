package l17.transport;

import java.util.Arrays;

public class Car extends transport{

    private int count = 0;

    public int countPublic = count;
    public String[] i = new String[5];
    public String[] arrayofAutos;
    String model, cl;
    double maxSpeed;

    public Car (String thickness, String status , String model, String cl, double maxSpeed) {
        super (thickness, status);
        this.cl = cl;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void arrayAdd (String model){

        i[count] = model;
        count++;
        countPublic = count;
        if ( count >= i.length)
        {
            i = Arrays.copyOf(i, i.length + 1);
        }


    }
    public String toString(){
        return "Status = "+this.getStatus()+"|"+"Thickness is "+this.getThickness()+"|"+"Model is "+this.model+"|"+"colour is "+this.cl+"|"+"max speed is "+this.maxSpeed;
    }
}
