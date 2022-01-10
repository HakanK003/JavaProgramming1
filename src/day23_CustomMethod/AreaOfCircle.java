package day23_CustomMethod;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();

        input.close();

        areaOfCircleCalculator(radius);

    }

    public static void areaOfCircleCalculator(double radius){

        double area = radius * radius * 3.14;
        System.out.println("Area of the circle = " + area);

    }
}

/*
create a method that can calculate the area of a circle
 */