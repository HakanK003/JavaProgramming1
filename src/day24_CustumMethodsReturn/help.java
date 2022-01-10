package day24_CustumMethodsReturn;

import java.util.Arrays;

public class help {

    public static void main(String[] args) {

        int[] arrNum1 = {1, 2, 3, 4, 5};
        int[] arrNum2 = {6, 7, 8, 9};

        int[] arrMerged =mergeTwoArr(arrNum1,arrNum2);

        System.out.println(Arrays.toString(arrMerged));

    }


    public static int[] mergeTwoArr(int[]arr1,int[]arr2){

        int[] arr3 = new int[arr1.length+ arr2.length];

        int a =0;

        for (int each1 : arr1) {
            arr3[a]=each1;
            a++;
        }
        for (int each2 : arr2) {
            arr3[a]=each2;
            a++;
        }
        return arr3;
    }


}