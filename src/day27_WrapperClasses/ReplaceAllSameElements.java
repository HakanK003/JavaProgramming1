package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAllSameElements {

    public static void main(String[] args) {

        int[] arr1 ={1, 1, 1, 2, 2, 3, 4, 5, 6, 1, 1, 1};
        System.out.println(Arrays.toString(replaceAllSameElements(arr1,1,3)));
        double[] arr2 ={1.1, 1.1, 1.1, 2.2, 2.2, 3.3, 4.4, 5.5, 6.6, 1.1, 1.1, 1.1};
        System.out.println(Arrays.toString(replaceAllSameElements(arr2,1.1,3.3)));
        char[] arr3 ={'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(Arrays.toString(replaceAllSameElements(arr3,'A','H')));
        String[] arr4 ={"Java", "Python", "C++", "SQL","SQL","SQL","SQL", "JS", "BASIC"};
        System.out.println(Arrays.toString(replaceAllSameElements(arr4,"SQL","Java")));

    }
    public static int[] replaceAllSameElements(int[] arr,int oldElement,int newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldElement){arr[i]=newElement;}
        }
        return arr;
    }
    public static double[] replaceAllSameElements(double[] arr,double oldElement,double newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldElement){arr[i]=newElement;}
        }
        return arr;
    }
    public static char[] replaceAllSameElements(char[] arr,char oldElement,char newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldElement){arr[i]=newElement;}
        }
        return arr;
    }
    public static String[] replaceAllSameElements(String[] arr,String oldElement,String newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldElement)){arr[i]=newElement;}
        }
        return arr;
    }
}

/*
ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */