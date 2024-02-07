package l17.people;

public class Woman {
    String name;
    double height;

    public Woman (double height, String name){
        this.height = height;
        this.name = name;
    }
    public String toString() { return this.name + " is " + this.height + " cm tall";

    }
}
