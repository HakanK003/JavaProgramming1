package day16_ForLoopStringPractice;

import java.util.Scanner;

public class HowManyPosNeg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int negative=0;
        int positive=0;

        for (int i=1; i<=5;i++) {

            System.out.println("Enter one number");
            int num = input.nextInt();

            if (num>0){positive+=1;}
            if (num<0){negative+=1;}

        }

        System.out.println(positive +" positive and " +negative+" negative");

    }
}

/*
Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */