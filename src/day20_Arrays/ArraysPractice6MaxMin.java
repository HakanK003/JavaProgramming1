package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice6MaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        int min=2099999999;
        int max=-2099999999;

        System.out.println("Enter 10 number");

        for (int i =1, index=0; i<=10; i++,index++){
            numbers[index]= input.nextInt();

            if (numbers[index]<min){min=numbers[index];}
            if (numbers[index]>max){max=numbers[index];}
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Max number is: " + max + "\nMin number is: " + min);

        //Arrays.sort(numbers);

        //System.out.println("Max number is " + numbers[numbers.length-1]);
        //System.out.println("Min number is " + numbers[0]);

    }
}

/*
 Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */