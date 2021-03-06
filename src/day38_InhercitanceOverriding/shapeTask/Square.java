package day38_InhercitanceOverriding.shapeTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("Square");
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " side='" + side + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
