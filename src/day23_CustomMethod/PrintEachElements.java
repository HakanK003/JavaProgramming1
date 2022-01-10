package day23_CustomMethod;

import java.util.Arrays;
import java.util.Scanner;

public class PrintEachElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Arrays length");
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter arrays element");
            numbers[i]= input.nextInt();
        }

        elementsFromIntArray(numbers);


    }

    public static void elementsFromIntArray(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

    }
}

/*
create a method named printEachElement that can print each element of an integer array
 */