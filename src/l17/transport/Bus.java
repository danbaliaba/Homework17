package l17.transport;

public class Bus {    String cl;
    double crowd;

    public Bus (double crowd, String cl){
        this.crowd = crowd;
        this.cl = cl;
    }
    public String toString() { return "People in Bus : " + this.crowd + ", colour is " + this.cl ;

    }
}
