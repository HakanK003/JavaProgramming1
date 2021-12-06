package day17_NestedLoop;

import java.util.Scanner;

public class Calculator4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer="";

        do {

            System.out.println("Enter a number");
            int firstNum = input.nextInt();
            System.out.println("Enter a number");
            int secondNum = input.nextInt();
            System.out.println("Enter an operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {

                System.out.println("Invalid operator\nEnter an operator");
                operator = input.next().charAt(0);
            }

            int result = (operator == '+') ? firstNum + secondNum : (operator == '-') ? firstNum - secondNum
                    : (operator == '*') ? firstNum * secondNum : firstNum / secondNum;

            System.out.println("result = " + result);

            do {
                System.out.println("Do you want to continue? (yes/no)");
                answer = input.next();
            }while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")));

        }while(answer.equalsIgnoreCase("yes"));

        System.out.println("Thanks for using Cydeo calculator!");


    }

}

/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */