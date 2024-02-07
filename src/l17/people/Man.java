package l17.people;

public class Man {
    String name;
    double height;

    public Man (double height, String name){
        this.height = height;
        this.name = name;
    }
    public String toString() { return this.name + " is " + this.height + " cm tall";

    }
}
