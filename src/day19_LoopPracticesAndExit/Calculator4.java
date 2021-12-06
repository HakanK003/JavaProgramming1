package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class Calculator4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = input.nextInt();

        System.out.println("Enter a math operator");
        char operator= input.next().charAt(0);

        if (!(operator=='+'||operator=='-')){
            System.err.println("Invalid math operator: " + operator);
            System.exit(0);
        }

        System.out.println("Enter a number");
        int num2 = input.nextInt();

        if (operator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }
    }
}
