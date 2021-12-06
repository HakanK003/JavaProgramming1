package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplicationWithoutMultiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        input.close();

        int result=0;

        if (num1>0&&num2>0){

            for (int i = num2; num2>0; num2--){
                result+=num1;
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid Number");
        }
    }
}

/*
Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */