package l17.animal;

public class Cat {
    String name;

    private int nowYear = 2023;
    double bornYear,  realAge;

    public Cat (double bornYear, String name){
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
            System.out.println("Cat Name is " + this.name + ", Cat is " + this.realAge + "y.o.");
        }

    }

}
