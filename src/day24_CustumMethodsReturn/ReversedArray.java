package day24_CustumMethodsReturn;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6};

        reversedArray(numbers);

    }

    public static void reversedArray(int[] arr){
        int[] reversedArr = new int[arr.length];

        for (int i = 0, j = arr.length-1; i < reversedArr.length; i++, j--) {
            reversedArr[i]=arr[j];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
}

/*
create a method that return the reversed array
 */