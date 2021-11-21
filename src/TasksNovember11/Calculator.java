package TasksNovember11;

import java.util.Scanner;

public class Calculator {
                                                    //HK003
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double n1 = input.nextDouble();
        System.out.println("Enter operator");
        char mathOperator = input.next().charAt(0);
        System.out.println("Enter second number");
        double n2 = input.nextDouble();


        if (mathOperator==43) {
            System.out.println(n1 + n2);
        }else if (mathOperator==45) {
            System.out.println(n1 - n2);
        }else if (mathOperator==42) {
            System.out.println(n1 * n2);
        }else if (mathOperator==47) {
            System.out.println(n1 / n2);
        }else{
            System.out.println("Invalid operator");
        }

    }
}

/*

Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30


 */