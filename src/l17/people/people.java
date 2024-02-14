package l17.people;

public class people {
    private int legsNumber = 2, armsNumber = 2;
    private String status = "alive";

    public people(int legsNumber, int armsNumber, String status)
    {
        this.legsNumber = legsNumber;
        this.armsNumber = armsNumber;
        this.status = status;
    }
    String getStatus(){
        return this.status;
    }
    int getLegsNumber(){
        return this.legsNumber;
    }
    int getArmsNumber(){
        return this.armsNumber;
    }

}
