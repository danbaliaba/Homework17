package l17.transport;

public class Bike {
    String cl;
    double weight;

    public Bike (double weight, String cl){
        this.weight = weight;
        this.cl = cl;
    }
    public String toString() { return this.weight + " kg" + ", bike colour is " + this.cl ;

    }
}
