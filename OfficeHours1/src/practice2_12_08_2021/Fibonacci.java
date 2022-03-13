package practice2_12_08_2021;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hoe many series you want");
        int num = input.nextInt();

        int result =1;
        System.out.print(0+" "+1+" ");

        for (int i = 0; i < num; i++) {

            System.out.print(result+" ");
            result+=result;

        }


    }
}

/*
Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

*/