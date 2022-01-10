package day27_WrapperClasses;

import java.util.Arrays;

public class Replace1Element {

    public static void main(String[] args) {

        int[] arr1 ={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(replace1Element(arr1,3,40)));
        double[] arr2 ={1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(Arrays.toString(replace1Element(arr2,3,44.4)));
        char[] arr3 ={'A','B','C','D','F','E'};
        System.out.println(Arrays.toString(replace1Element(arr3,3,'H')));
        String[] arr4 ={"Java", "Python", "C++", "SQL", "JS", "BASIC"};
        System.out.println(Arrays.toString(replace1Element(arr4,3,"C#")));




    }

    public static int[]replace1Element(int[] arr,int indexNo,int newElement){
        if ( !(indexNo>=0 && indexNo< arr.length)){
            System.err.println("Invalid index number in Array replace method");
            System.exit(0);
        }
        arr[indexNo]=newElement;
        return arr;
    }
    public static double[]replace1Element(double[] arr,int indexNo,double newElement){
        if ( !(indexNo>=0 && indexNo< arr.length)){
            System.err.println("Invalid index number in Array replace method");
            System.exit(0);
        }
        arr[indexNo]=newElement;
        return arr;
    }
    public static char[]replace1Element(char[] arr,int indexNo,char newElement){
        if ( !(indexNo>=0 && indexNo< arr.length)){
            System.err.println("Invalid index number in Array replace method");
            System.exit(0);
        }
        arr[indexNo]=newElement;
        return arr;
    }
    public static String[]replace1Element(String[] arr,int indexNo,String newElement){
        if ( !(indexNo>=0 && indexNo< arr.length)){
            System.err.println("Invalid index number in Array replace method");
            System.exit(0);
        }
        arr[indexNo]=newElement;
        return arr;
    }
}

/*
 Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */