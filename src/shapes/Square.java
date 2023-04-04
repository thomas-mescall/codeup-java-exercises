package shapes;

public class Square extends Quadrilateral {
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        double perimeter = length * 4;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * length;
        return area;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

//    public Square(int side){
//        super(side, side);
//    }
//
//    @Override
//    public int getArea() {
//        return super.getArea();
//    }
//
//    @Override
//    public int getPerimeter() {
//        return super.getPerimeter();
//    }
}
