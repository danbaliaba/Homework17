package l26;

public class Square extends Shapes{
    String colour;
    int side;
    Square (String colour, int side){
        this.colour = colour;
        this.side = side;

    }
    public void findPerimeter(){
        System.out.println("Периметр ромба = " + 4*this.side);

    }
    public void findArea(){
        System.out.println("Площадь квадрата = " + this.side * this.side);
    }


    public void setColour(){
        System.out.println("Цвет кварата - " + this.colour);
    }

    public void draw(){
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
    }
}
