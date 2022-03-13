package practice2_12_08_2021;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        long result=1L;
        for (int i = number; i>0; i--){
            result*=i;
        }
        System.out.println(result);
    }
}

/*
Write a program that can return the factorial number of any given number

                              Ex:
                                  input: 5
                                  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/