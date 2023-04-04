package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public void setLength() {
    }

    @Override
    public void setWidth() {
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength(int length){
//        return length;
//    }
//
//    public int getWidth(int width){
//        return width;
//    }
//
//    public void setLength(int length){
//        this.length = length;
//    }
//
//    public void setWidth(int width){
//        this.width = width;
//    }
//
//    public int getArea(){
//        int area = length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }
}
