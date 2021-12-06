package day19_LoopPracticesAndExit;

import java.rmi.ServerError;
import java.util.Scanner;

public class AreaPerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean wantRepeat = true;

        do {

            double length;
                System.out.println("Enter length of the rectangle");
                length = input.nextDouble();
            while(length<=0){
                System.err.println("Invalid number, please re-enter");
                length = input.nextDouble();
            }

            double width;
            System.out.println("Enter length of the rectangle");
            width = input.nextDouble();
            while(width<=0){
                System.err.println("Invalid number, please re-enter");
                width = input.nextDouble();
            }

            double area = length*width;
            double perimeter = 2*(length+width);

            System.out.println("Area = " + area + "\nPerimeter = " + perimeter);

            String yesNo;
            do {
                System.out.println("Would you like to calculate another Rectangle?");
                yesNo = input.next();
                if (yesNo.equalsIgnoreCase("yes")){continue;}
                else if (yesNo.equalsIgnoreCase("no")){wantRepeat=false;
                    System.out.println("Thank you for using Cydeo Rectangle Calculator APP");}
                else {
                    System.err.println("Invalid answer");
                }
            }while(!(yesNo.equalsIgnoreCase("yes")||yesNo.equalsIgnoreCase("no")));

        }while(wantRepeat);


    }
}

/*
Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */