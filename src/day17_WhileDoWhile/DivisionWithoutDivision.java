package day16_WhileDoWhile;

import java.util.Scanner;

public class DivisionWithoutDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int firstNum = input.nextInt();
        System.out.println("Enter a positive number");
        int secondNum = input.nextInt();

        int result = 0;
        int remainder = 0;

        if (firstNum>0&&secondNum>0){

        while (secondNum<=firstNum){
            firstNum = firstNum-secondNum;
            result++;
        }

        if (firstNum>0){remainder +=firstNum;}   //if (secondNum>0&&firstNum>secondNum)

        System.out.println("result = " + result);
        System.out.println("remainder = " + remainder);
            }
        else {
            System.out.println("Invalid numbers");
        }


    }


}

/*
 Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */