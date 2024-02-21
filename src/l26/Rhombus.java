package l26;

public class Rhombus extends Shapes {
    String colour;
    int side;
    Rhombus(String colour, int side){
        this.colour = colour;
        this.side = side;

    }
    @Override
    public void findPerimeter(){
        System.out.println("Периметр ромба = " + 4*this.side);

    }
    @Override
    public void findArea(){
        System.out.println("Вы не сомжете найти площадь ромба без угла");
    }


    @Override
    public void setColour(){
        System.out.println("Цвет ромба - " + this.colour);
    }

    @Override
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
