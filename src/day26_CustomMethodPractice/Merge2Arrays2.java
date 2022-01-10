package day26_CustomMethodPractice;

import utility.ArrayUtility;

import java.util.Arrays;

public class Merge2Arrays2 {

    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};

        int[] nums3 =mergeArray(nums1,nums2);
        System.out.println(Arrays.toString(nums3));
    }

    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArrayUtility.elementAdder(result,each);
        }
        for (int each : arr2) {
            result = ArrayUtility.elementAdder(result,each);
        }
        return result;
    }


}
