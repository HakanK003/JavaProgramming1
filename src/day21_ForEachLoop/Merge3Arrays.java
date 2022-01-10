package day21_ForEachLoop;

import java.util.Arrays;

public class Merge3Arrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11, 12};
        int[] arr3 = {13, 14, 15, 16, 17, 18};
        int[] newArr = new int[arr1.length+ arr2.length+ arr3.length];

        int count =0;    // for finding index number of new array

        for (int eachArr1 : arr1) {

            newArr[count]=eachArr1;
            count++;    // to find next index number
        }
        for (int eachArr2 : arr2) {

            newArr[count]=eachArr2;
            count++;    // to find next index number
        }
        for (int eachArr3 : arr3) {

            newArr[count]=eachArr3;
            count++;    // to find next index number
        }

        System.out.println(Arrays.toString(newArr));

    }
}

/*
Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */