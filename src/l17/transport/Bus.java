package l17.transport;

public class Bus extends  transport{    String cl;
    double crowd;

    public Bus (String thickness, String status , double crowd, String cl){
        super (thickness, status);
        this.crowd = crowd;
        this.cl = cl;
    }
    public String toString(){
        return "Status = "+this.getStatus()+"|"+"Thickness is "+this.getThickness()+"|"+"Number of People "+this.crowd+"|"+"colour is "+this.cl;
    }
}
