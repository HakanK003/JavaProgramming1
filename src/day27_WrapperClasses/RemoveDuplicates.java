package day27_WrapperClasses;

import utility.ArrayUtility;

public class RemoveDuplicates {

    //removes duplicated elements from int[] array
    public static int[] removeDuplicates(int[] array){

        int[] result={};

        for (int each: array){
            if (!ArrayUtility.contains(result,each)){
                result=ArrayUtility.elementAdder(result,each);
            }
        }
        return result;
    }
    //removes duplicated elements from double[] array
    public static double[] removeDuplicates(double[] array){

        double[] result={};

        for (double each: array){
            if (!ArrayUtility.contains(result,each)){
                result=ArrayUtility.elementAdder(result,each);
            }
        }
        return result;
    }
    //removes duplicated elements from char[] array
    public static char[] removeDuplicates(char[] array){

        char[] result={};

        for (char each: array){
            if (!ArrayUtility.contains(result,each)){
                result=ArrayUtility.elementAdder(result,each);
            }
        }
        return result;
    }
    //removes duplicated elements from String[] array
    public static String[] removeDuplicates(String[] array){

        String[] result={};

        for (String each: array){
            if (!ArrayUtility.contains(result,each)){
                result=ArrayUtility.elementAdder(result,each);
            }
        }
        return result;
    }


}
