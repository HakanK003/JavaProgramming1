package day35_Encapsulation;

public class Circle {

    private double radius;
    public static double pi=3.14;

    public void setRadius(double radius) {
        if (radius>0)setRadius(radius);else System.err.println("Invalid radius");
    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return radius*2*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }

}

/*
 Create a class named Circle

            private variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the radius of circle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
 */