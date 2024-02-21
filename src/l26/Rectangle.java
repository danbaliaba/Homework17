package l26;

public class Rectangle extends Shapes{
    String colour;
    int side1, side2;
    Rectangle(String colour, int side1, int side2){
        this.colour = colour;
        this.side1 = side1;
        this.side2 = side2;

    }
    @Override
    public void findPerimeter(){
        System.out.println("Периметр прямоугольника = " + 2 * (side1 + side2));

    }
    @Override
     public void findArea(){
        System.out.println("Площадь прямоугольника =" + side1*side2);
     }

    @Override
    public void setColour(){
        System.out.println("Цвет прямоугольника - " + this.colour);
    }

    @Override
    public void draw(){
        System.out.println("************");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("************");
    }


}
