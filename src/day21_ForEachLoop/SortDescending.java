package day21_ForEachLoop;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 10, 8, 6, 4, 2, 0};
        int[] numbers2 = new int[numbers.length];

        Arrays.sort(numbers);

        int count = numbers2.length-1;

        for (int each : numbers) {

            numbers2[count]=each;
            count--;

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

    }
}

/*
Write a program that sort the array of integer in descending order
 */