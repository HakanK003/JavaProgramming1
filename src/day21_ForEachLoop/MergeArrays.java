package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] arr3 = new int[arr1.length+ arr2.length];

        int a =0;

        for (int i : arr1) {

            arr3[a++]=i;
            //a++;
        }

        for (int j : arr2) {

            arr3[a++]=j;
            //a++;
            
        }
        System.out.println(Arrays.toString(arr3));



    }
}

/*
write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}
            
        output
            arr3 = {1,2,3,4,5,6}
 */