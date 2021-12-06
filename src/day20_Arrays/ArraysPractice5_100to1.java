package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice5_100to1 {

    public static void main(String[] args) {

        int[] numbers=new int[100];

        for (int i= 0, no=100; i<= numbers.length-1; i++,no--){
            numbers[i]=no;
        }

        System.out.println(Arrays.toString(numbers));

    }
}

/*
 create an array that has the numbers 100 to 1
 */