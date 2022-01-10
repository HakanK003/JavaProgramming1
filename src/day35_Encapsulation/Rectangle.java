package day35_Encapsulation;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        if (length>0) setLength(length); else System.err.println("Invalid entry");
        if (width>0) setWidth(width); else System.err.println("Invalid entry");
    }

    public void setWidth(double width) {
        if (width>0) this.width = width; else System.err.println("Invalid entry");
    }

    public void setLength(double length) {
        if (length>0) this.length = length; else System.err.println("Invalid entry");
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
 Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */