package l26;
import java.lang.Math.*;

import static java.lang.Math.sqrt;

public class Triangle extends Shapes {
    String colour;
    int side1, side2, side3;
    Triangle(String colour, int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public void findPerimeter(){
        System.out.println("Периметр треугольника = "+ (this.side1 +this.side2+this.side3));
    }

    @Override
    public void findArea(){
        int p =(this.side1 + this.side2 + this.side3) /2;
        double a = sqrt((p - this.side1)*(p-this.side2)*(p-this.side3));
        System.out.println("Площадь треугольника = " + a);
    }


    @Override

    public void setColour(){System.out.println("Цвет круга - " + this.colour);}

    @Override

    public void draw(){
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*       *");
        System.out.println("*********");
    }
}
