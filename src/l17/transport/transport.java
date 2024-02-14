package l17.transport;

public class transport {

    public String thickness;
    public String status;

    public transport (String thickness, String status)
    {
        this.thickness = thickness;
        this.status = status;

    }
    String getStatus(){
        return this.status;
    }
    String getThickness(){
        return this.thickness;
    }




}
