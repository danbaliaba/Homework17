package l26;

public class Rhombus extends Shapes {
    String colour;
    int side;
    Rhombus(String colour, int side){
        this.colour = colour;
        this.side = side;

    }
    public void findPerimeter(){
        System.out.println("Периметр ромба = " + 4*this.side);

    }
    public void findArea(){
        System.out.println("Вы не сомжете найти площадь ромба без угла");
    }


    public void setColour(){
        System.out.println("Цвет ромба - " + this.colour);
    }

    public void draw(){
        System.out.println("    *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*       *");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("    *");
    }

    }
