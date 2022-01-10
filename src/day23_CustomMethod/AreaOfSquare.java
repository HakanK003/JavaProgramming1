package day23_CustomMethod;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a side of the square");
        double side = input.nextDouble();

        input.close();

        areaOfSquareCalculator(side);

    }

    public static void areaOfSquareCalculator(double side){

        double area = side * side ;
        System.out.println("Area of the square is = " + area);

    }
}

/*
create a method that can calculate the area of a square
 */