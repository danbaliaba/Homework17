package l26;

public class Circle extends Shapes {

    private final static double PI = 3.14;
    String colour;
    int radius;

    Circle(String colour, int radius) {
        this.colour = colour;
        this.radius = radius;
    }

    @Override
    public void findPerimeter() {
        System.out.println("Длина круга = " + 2 * PI * this.radius);

    }

    @Override
    public void findArea() {
        System.out.println("Площадь круга = " + PI*this.radius*this.radius);
    }

    @Override
    public void setColour() {
        System.out.println("Цвет круга - " + this.colour);
    }

    @Override
    public void draw() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
    }
}
