package l17.animal;

public class Dog extends animal{
    String name;

    private int nowYear = 2023;
    double bornYear,  realAge;

    public Dog (String status, int legsNumber, double bornYear, String name){
        super(status, legsNumber);
        this.bornYear = bornYear;
        this.name = name;
        realAge = nowYear - this.bornYear;
        if (realAge <= 0 | realAge > 20)
        {
            System.err.println("Кот еще не родился, либо уже умер");
        }
        else
        {
            this.realAge = realAge;
        }

    }


    public String toString(){
        return "Status= "+this.getStatus()+"|"+"Has "+this.getLegsNumber()+" legs"+"|"+"Name is "+this.name+"|"+"is "+this.realAge+" y.o|";

    }
}
