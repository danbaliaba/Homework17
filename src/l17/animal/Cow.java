package l17.animal;

public class Cow extends animal{

    String namecow;

    private int nowYear = 2023;
    double bornYearcow,  realAgecow;

    public Cow (String status, int legsNumber, String namecow, double bornYearcow){
        super (status, legsNumber);
        this.bornYearcow = bornYearcow;
        this.namecow = namecow;
        realAgecow = nowYear - bornYearcow;
        if (realAgecow <= 0 | realAgecow > 20)
        {
            System.err.println("Кот еще не родился, либо уже умер");
        }
        else
        {
            this.realAgecow = realAgecow;
        }

    }


    public String toString(){
        return "Status= "+this.getStatus()+"|"+"Has "+this.getLegsNumber()+" legs"+"|"+"Name is "+this.namecow+"|"+"is "+this.realAgecow+" y.o|";

    }
}
