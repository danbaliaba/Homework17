package l17.animal;

public class Dog {
    String name;

    private int nowYear = 2023;
    double bornYear,  realAge;

    public Dog (double bornYear, String name){
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


    public String toString() { return "Dog Name is " + this.name + ", Dog is " + this.realAge + "y.o.";

    }
}
