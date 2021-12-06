package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Enter a math operator");
        char ch = input.next().charAt(0);

        while(!(ch=='+'||ch=='-')){
            System.err.println("Invalid Operator, please re-enter");
            ch = input.next().charAt(0);
        }

        input.close();

        System.out.println((ch=='+')? num1+num2 : num1-num2);

    }
}
