package l17.transport;

public class Bike extends transport{
    String cl;
    double weight;

    public Bike (String thickness, String status , double weight, String cl){
        super (thickness, status);
        this.weight = weight;
        this.cl = cl;
    }
    public String toString(){
        return "Status = "+this.getStatus()+"|"+"Thickness is "+this.getThickness()+"|"+this.weight+"kg|"+"colour is "+this.cl;
    }
}
