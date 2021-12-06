package day20_Arrays;

import java.util.Arrays;

public class ReverseArraysIntegers {

    public static void main(String[] args) {

        int[] number= {1, 2, 3, 4, 5};

        int[] reversedArray = new int[number.length];

        for (int i = 0, j = number.length-1; i < number.length; i++ ,j--) {

                reversedArray[i]=number[j];

        }

        System.out.println("Normal   ---> " + Arrays.toString(number));
        System.out.println("Reversed ---> " + Arrays.toString(reversedArray));

    }

}

/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */