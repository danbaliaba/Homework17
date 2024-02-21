package l26;

public class l26HW {
    public static void main(String[] args) {

        Shapes rectangle = new Rectangle("red", 2,3 );
        Shapes circle = new Circle("white", 5);
        Shapes rhombus = new Rhombus("green", 6);
        Shapes square = new Square("black", 7);
        Shapes triangle = new Triangle("yellow", 8,9,10);

        rectangle.draw();
        rectangle.findArea();
        rectangle.findPerimeter();
        rectangle.setColour();

        System.out.println(" ");
        System.out.println("||||||||||||||||||||||||||||||||||||");
        System.out.println(" ");

        circle.setColour();
        circle.draw();
        circle.findArea();
        circle.findPerimeter();

        System.out.println(" ");
        System.out.println("|||||||||||||");
        System.out.println(" ");

        rhombus.findPerimeter();
        rhombus.draw();
        rhombus.findArea();
        rhombus.setColour();

        System.out.println(" ");
        System.out.println("|||||||||||||");
        System.out.println(" ");

        square.setColour();
        square.draw();
        square.findArea();
        square.findPerimeter();

        System.out.println(" ");
        System.out.println("|||||||||||||");
        System.out.println(" ");

        triangle.findPerimeter();
        triangle.draw();
        triangle.findArea();
        triangle.setColour();

    }

}
