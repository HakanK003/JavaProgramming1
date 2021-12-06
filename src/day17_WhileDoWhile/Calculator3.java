package day16_WhileDoWhile;

import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int firstNum = input.nextInt();
        System.out.println("Enter a number");
        int secondNum = input.nextInt();
        System.out.println("Enter an operator");
        char operator = input.next().charAt(0);

        while (!(operator=='+'||operator=='-'||operator=='*'||operator=='/')){

            System.out.println("Invalid operator\nEnter an operator");
            operator = input.next().charAt(0);
        }

        int result = (operator=='+')? firstNum+secondNum :(operator=='-')? firstNum-secondNum
                    :(operator=='*')? firstNum*secondNum : firstNum/secondNum;

        System.out.println("result = " + result);


    }

}

/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */