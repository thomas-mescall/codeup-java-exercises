package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(double length){
        return length;
    }

    public double getWidth(double width){
        return width;
    }

    public abstract void setLength();

    public abstract void setWidth();
}
