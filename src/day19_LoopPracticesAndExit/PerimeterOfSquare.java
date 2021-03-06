package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class PerimeterOfSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean wantContinue=true;

        do {
            System.out.println("Enter a side of square");
            double side = input.nextDouble();

            double area = side * side;
            double perimeter = side * 4;

            System.out.println("Area = " + area + "\nPerimeter = " + perimeter);

            String answer = "";
            do {
                System.out.println("Would you like to calculate another square");
                answer = input.next();

                if (answer.equalsIgnoreCase("yes")){continue;}
                else if (answer.equalsIgnoreCase("no")){wantContinue=false;
                    System.out.println("Thank you for using Cydeo Square Calculator APP");}
                else {
                    System.err.println("You entered invalid word");
                }

            } while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));


        }while (wantContinue);


    }
}

/*
 Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */