package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6};
        reversedArray(numbers);

        double[] numbers2 ={1.1,2.2,3.3,4.4,5.5,6.6};
        reversedArray(numbers2);

        char[] ch ={'A','B','C','D','E','F'};
        reversedArray(ch);

        String[] str ={"Java","Python","C++"};
        reversedArray(str);

    }

    public static void reversedArray(int[] arr){
        int[] reversedArr = new int[arr.length];

        for (int i = 0, j = arr.length-1; i < reversedArr.length; i++, j--) {
            reversedArr[i]=arr[j];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
    public static void reversedArray(double[] arr){
        double[] reversedArr = new double[arr.length];

        for (int i = 0, j = arr.length-1; i < reversedArr.length; i++, j--) {
            reversedArr[i]=arr[j];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
    public static void reversedArray(char[] arr){
        char[] reversedArr = new char[arr.length];

        for (int i = 0, j = arr.length-1; i < reversedArr.length; i++, j--) {
            reversedArr[i]=arr[j];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
    public static void reversedArray(String[] arr){
        String[] reversedArr = new String[arr.length];

        for (int i = 0, j = arr.length-1; i < reversedArr.length; i++, j--) {
            reversedArr[i]=arr[j];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
}

/*
 1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */