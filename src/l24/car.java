package l24;
import java.util.Objects;

public class car extends transports{

    String model, cl;
    double maxSpeed;

    public car (String thickness, String status , String model, String cl, double maxSpeed) {
        super (thickness, status);
        this.cl = cl;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String toString(){
        return "Status = "+this.getStatus()+"|"+"Thickness is "+this.getThickness()+"|"+"Model is "+this.model+"|"+"colour is "+this.cl+"|"+"max speed is "+this.maxSpeed;
    }
}
