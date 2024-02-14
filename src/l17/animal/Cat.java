package l17.animal;

public class Cat extends animal{
    String name;

    private int nowYear = 2023;
    double bornYear,  realAge;

    public Cat (String status, int legsNumber, double bornYear, String name){
        super (status, legsNumber);
        this.bornYear = bornYear;
        this.name = name;
        realAge = nowYear - this.bornYear;

    }

    public String toString(){
        return "Status= "+this.getStatus()+"|"+"Has "+this.getLegsNumber()+" legs"+"|"+"Name is "+this.name+"|"+"is "+this.realAge+" y.o|";

    }

}
