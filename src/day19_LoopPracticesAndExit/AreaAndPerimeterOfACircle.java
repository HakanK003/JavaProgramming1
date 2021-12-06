package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class AreaAndPerimeterOfACircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean wantRepeat =true;

        do {
            System.out.println("Enter radius of the circle");
            double radius= input.nextDouble();

            double diameter=radius*2,
                   area=radius*radius*3.14,
                   perimeter=diameter*3.14;

            System.out.println("Diameter is: "+diameter+"\nPerimeter is: "+perimeter+"\nArea is: "+area);

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")){continue;}
            else if (answer.equalsIgnoreCase("no")){wantRepeat = false;
                System.out.println("Thank you for using Cydeo Circle Calculator App");}

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid answer please re-enter");
                answer = input.next();
            }

        }while (wantRepeat);

    }
}

/*
Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */