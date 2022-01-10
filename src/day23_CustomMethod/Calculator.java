package day23_CustomMethod;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter first number");
        double firstNum = input.nextDouble();
        System.out.println("Enter second number");
        double secondNum = input.nextDouble();
        System.out.println("Enter math operator (+,-,*,/,%)");
        char operator = input.next().charAt(0);

        calculator(firstNum,secondNum,operator);

    }

    public static void calculator(double num1,double num2,char operator){

        double result=0;
        if (operator=='+'){result=num1+num2;}else if (operator=='-'){result=num1-num2;}
        else if (operator=='*'){result=num1*num2;} else if (operator=='/'){result=num1/num2;}
        else if (operator=='%'){result=num1%num2;} else {
            System.err.println("Invalid entry"); System.exit(0);
        }
        System.out.println(result);
    }
}

/*
 create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

 */