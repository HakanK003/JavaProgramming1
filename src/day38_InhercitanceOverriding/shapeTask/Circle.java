package day38_InhercitanceOverriding.shapeTask;

public class Circle extends Shape{

    public double radius;
    public static double pi = 3.14;

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
        return "Shape{" +
                "name='" + name + '\'' +
                " radius='" + radius + '\'' +
                " pi='" + pi + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
