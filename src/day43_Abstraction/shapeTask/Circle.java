package day43_Abstraction.shapeTask;

public class Circle extends Shape{

    private double radius;
    public final double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return radius*2*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
