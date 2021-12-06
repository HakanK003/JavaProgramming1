package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class GradeCalculatorLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean wantRepeat= true;
        do {

            System.out.println("Enter your score");
            int score = input.nextInt();
            if (score < 0 || score > 100) {
                System.err.println("Invalid score");
                System.exit(0);
            }

            char grade = (score>90)? 'A' :(score>80)? 'B' :(score>70)? 'C' :(score>60)? 'D' : 'F';

            System.out.println(grade);

            System.out.println("Would you like to continue");
            String answer = input.next();

            if (answer.equalsIgnoreCase("yes")){continue;}
            else if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade calculator App");
                wantRepeat=false;
            }else{
                System.err.println("Invalid answer"); System.exit(0);
            }


        }while(wantRepeat);


    }
}

/*
 Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */