package day25_CustomMethodsOverloading;

import utility.ArrayUtility;

public class ImportingClass2 {

    public static void main(String[] args) {

        int[] arr1 ={1, 2, 3, 4, 5};
        ArrayUtility.printlnEach(arr1);

        double[] arr2 ={1.2, 2.3, 3.4, 4.5, 5.6};
        ArrayUtility.printlnEach(arr2);

        char[] arr3 ={'A', 'B', 'C', 'D', 'E'};
        ArrayUtility.printlnEach(arr3);

        String[] arr4 ={"Hello", "How", "Are", "You"};
        ArrayUtility.printlnEach(arr4);

        int[] arr5 ={1, 3, 5, 7, 9};
        int max1 = ArrayUtility.maxNum(arr5);
        int min1 = ArrayUtility.minNum(arr5);
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        double[] arr6 ={1.1, 2.2, 3.3, 4.4, 5.5};
        double max2 = ArrayUtility.maxNum(arr6);
        double min2 = ArrayUtility.minNum(arr6);
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);



    }
}
