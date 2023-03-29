package shapes;

import java.util.Scanner;

public class Circles {
    private int radius;
    Scanner myScanner = Scanner(System.in);
    public Circle(double radius){
        System.out.println("Enter the radius");
        int userInput = myScanner.nextInt();
    }
    public double getArea(){
        int area = Math.pi * (Math.pow(radius, 2));
        return area;
    }
    public double getCircumference(){
        int circumference = 2 * Math.pi * radius;
        return circumference;
    }

}
