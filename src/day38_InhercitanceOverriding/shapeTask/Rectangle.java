package day38_InhercitanceOverriding.shapeTask;

public class Rectangle extends Shape{

    public double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
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
        return "Shape{" +
                "name='" + name + '\'' +
                " length='" + length + '\'' +
                " width='" + width + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
