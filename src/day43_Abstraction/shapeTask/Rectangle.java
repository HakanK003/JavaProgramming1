package day43_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
       setLength(length);
       setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
