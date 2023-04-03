package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("Width is: " + box1.width);
        System.out.println("Length is: " + box1.length);
        System.out.println("This is your rectangle: " + box1);
        System.out.println("Your area is: " + box1.getArea());
        System.out.println("Your perimeter is: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("Width is: " + box2.width);
        System.out.println("Length is: " + box2.length);
        System.out.println("This is your square: " + box2);
        System.out.println("Your area is: " + box2.getArea());
        System.out.println("Your perimeter is: " + box2.getPerimeter());
    }
}
