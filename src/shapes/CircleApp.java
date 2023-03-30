package shapes;
import util.Input;
public class CircleApp {
    //insert something to ask user for radius and connect it to circles using Input class

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        //System.out.println(circles.Circle(5.0));
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
