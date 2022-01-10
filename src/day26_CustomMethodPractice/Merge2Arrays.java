package day26_CustomMethodPractice;

import utility.ArrayUtility;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};

        int[] nums3 =mergeArray(nums1,nums2);
        System.out.println(Arrays.toString(nums3));

        double[] nums4 = {1.1, 2.2, 3.3};
        double[] nums5 = {4.4, 5.5, 6.6};

        double[] nums6 =mergeArray(nums4,nums5);
        System.out.println(Arrays.toString(nums6));

        String[] arr1 = {"Hello", "World"};
        String[] arr2 = {"Java", "Python"};

        String[] arr3 =mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        char[] arr4 = {'A', 'B', 'C'};
        char[] arr5 = {'D', 'E', 'F'};

        char[] arr6 =mergeArray(arr4,arr5);
        System.out.println(Arrays.toString(arr6));


    }
    //merge int[] arrays
    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[] result =new int[arr1.length+ arr2.length];
        int count=0;
        for (int each : arr1) {
            result[count++]=each;
        }
        for (int each : arr2) {
            result[count++]=each;
        }
        return result;
    }
    
    //merge double[] arrays
    public static double[] mergeArray(double[]arr1,double[]arr2){
        double[] result =new double[arr1.length+ arr2.length];
        int count=0;
        for (double each : arr1) {
            result[count++]=each;
        }
        for (double each : arr2) {
            result[count++]=each;
        }
        return result;
    }

    //merge char[] arrays
    public static char[] mergeArray(char[]arr1,char[]arr2){
        char[] result =new char[arr1.length+ arr2.length];
        int count=0;
        for (char each : arr1) {
            result[count++]=each;
        }
        for (char each : arr2) {
            result[count++]=each;
        }
        return result;
    }

    //merge String[] arrays
    public static String[] mergeArray(String[]arr1,String[]arr2){
        String[] result =new String[arr1.length+ arr2.length];
        int count=0;
        for (String each : arr1) {
            result[count++]=each;
        }
        for (String each : arr2) {
            result[count++]=each;
        }
        return result;
    }
}

/*
1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
 */