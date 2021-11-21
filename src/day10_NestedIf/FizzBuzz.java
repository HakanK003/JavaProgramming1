package day10_NestedIf;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number%3==0||number%5==0) {
            if (number % 3 == 0) {
                System.out.print("Fizz");
            }
            if (number % 5 == 0) {
                System.out.print("Buzz");
            }
        }else{
            System.out.println("Number can't divide evenly with 3 or 5");
        }



    }

}
/*
Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz


 */