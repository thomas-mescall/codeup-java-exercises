package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Quadrilateral rectangle = new Rectangle(10,5);
        Quadrilateral square = new Square(50);

        Measurable myShape1;
        Measurable myShape2;
        myShape1 = rectangle;
        myShape2 = square;

        System.out.println("SHAPE1");
//        System.out.println("Width is: " + myShape.width);
//        System.out.println("Length is: " + myShape.length);
        System.out.println("This is your rectangle: " + myShape1);
        System.out.println("Your area is: " + myShape1.getArea());
        System.out.println("Your perimeter is: " + myShape1.getPerimeter());
//        System.out.println("Q2: " + myShape.getLength(10));
//        System.out.println("Q2: " + myShape.getWidth(5));

        System.out.println("SHAPE1");
        System.out.println("This is your rectangle: " + myShape2);
        System.out.println("Your area is: " + myShape2.getArea());
        System.out.println("Your perimeter is: " + myShape2.getPerimeter());

        //Rectangle box1 = new Rectangle(5,4);
        System.out.println("RECTANGLE");
        System.out.println("Width is: " + rectangle.width);
        System.out.println("Length is: " + rectangle.length);
        System.out.println("This is your rectangle: " + rectangle);
        System.out.println("Your area is: " + rectangle.getArea());
        System.out.println("Your perimeter is: " + rectangle.getPerimeter());
        System.out.println("Q2: " + rectangle.getLength(10));
        System.out.println("Q2: " + rectangle.getWidth(5));

        //Rectangle box2 = new Square(5);
        System.out.println("SQUARE");
        System.out.println("Width is: " + square.width);
        System.out.println("Length is: " + square.length);
        System.out.println("This is your square: " + square);
        System.out.println("Your area is: " + square.getArea());
        System.out.println("Your perimeter is: " + square.getPerimeter());
    }
}

//Q1: The getPerimeter must be included in Rectangle because it is part of the interface Measurable. Without it, you get an error because part of the foundation of the entire program is missing.

//Q2: You cannot access the getLength/ getWidth methods through the myShape variable because it does not reside within the Measurable interface and that is the class that is being used to create the variable myShape.
