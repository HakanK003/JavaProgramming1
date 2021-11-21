package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        double length = 30;
        double width = 60;

        double perimeter = 2 * (length+width);
        double area = length * width;

        System.out.println("length = " + length);
        System.out.println("with = " + width);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}

/*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */