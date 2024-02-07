package l17.animal;

public class Cow {

    String namecow;

    private int nowYear = 2023;
    double bornYearcow,  realAgecow;

    public Cow (double bornYearcow, String namecow){
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


    public String toString() { return "Cow Name is " + this.namecow + ", Cow is " + this.realAgecow + "y.o.";

    }
}
