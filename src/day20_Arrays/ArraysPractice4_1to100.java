package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice4_1to100 {

    public static void main(String[] args) {

        int[] numbers= new int[100];

        for (int i=0, no=1; i< numbers.length; i++,no++){
            numbers[i]=no;
        }

        System.out.println(Arrays.toString(numbers));

    }
}

/*
create an array that has the numbers 1 to 100
 */