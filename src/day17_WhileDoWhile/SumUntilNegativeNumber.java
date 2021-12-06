package day16_WhileDoWhile;

import java.util.Scanner;

public class SumUntilNegativeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  sum = 0;

        int num = 1;

        while(num>0){

            System.out.println("Enter a number" );
            num = input.nextInt();
            if (num>0){sum += num;}
        }

        System.out.println("sum = " + sum);
    }
}

/*
 Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */