package l17.people;

public class Woman extends people{
    String name;
    double height;

    public Woman (int legsNumber, int armsNumber, String status, double height, String name){
        super (legsNumber, armsNumber, status);
        this.height = height;
        this.name = name;
    }
    public String toString() {
        return "Status = "+this.getStatus()+"|"+"Has "+this.getLegsNumber()+" legs, "+this.getArmsNumber()+" arms|"+this.height+" cm|"+"Name "+this.name+"|";

    }
}
