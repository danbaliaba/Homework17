package l26;

public class Square extends Shapes{
    String colour;
    int side;
    Square (String colour, int side){
        this.colour = colour;
        this.side = side;

    }
    @Override
    public void findPerimeter(){
        System.out.println("Периметр ромба = " + 4*this.side);

    }
    @Override
    public void findArea(){
        System.out.println("Площадь квадрата = " + this.side * this.side);
    }


    @Override
    public void setColour(){
        System.out.println("Цвет кварата - " + this.colour);
    }

    @Override
    public void draw(){
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
    }
}
