package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(removeElement(numbers,2)));
        double[] numbers2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(Arrays.toString(removeElement(numbers2,2)));
        char[] chars ={'a', 'a', 'b', 'c', 'd', 'a', 'a', 'b'};
        System.out.println(Arrays.toString(removeElement(chars,2)));
        String[] str ={"Hello", "Python", "Java", "Hello", "Java"};
        System.out.println(Arrays.toString(removeElement(str,2)));


    }
    //returns new array without int from indexNo
    public static int[] removeElement(int[] arr, int indexNo){

        int[] newArr= new int[arr.length-1];
        int count=0;
        for (int i=0; i< arr.length; i++) {
            if(i==indexNo){continue;}
            newArr[count++]=arr[i];
        }
        return newArr;
    }
    //returns new array without double from indexNo
    public static double[] removeElement(double[] arr, int indexNo){

        double[] newArr= new double[arr.length-1];
        int count=0;
        for (int i=0; i< arr.length; i++) {
            if(i==indexNo){continue;}
            newArr[count++]=arr[i];
        }
        return newArr;
    }
    //returns new array without char from indexNo
    public static char[] removeElement(char[] arr, int indexNo){

        char[] newArr= new char[arr.length-1];
        int count=0;
        for (int i=0; i< arr.length; i++) {
            if(i==indexNo){continue;}
            newArr[count++]=arr[i];
        }
        return newArr;
    }
    //returns new array without String from indexNo
    public static String[] removeElement(String[] arr, int indexNo){

        String[] newArr= new String[arr.length-1];
        int count=0;
        for (int i=0; i< arr.length; i++) {
            if(i==indexNo){continue;}
            newArr[count++]=arr[i];
        }
        return newArr;
    }
}

/*
Create a class named RemoveElements:
            2.1 Create a method that passes two parameters: an integer array and an integer index.
            the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}

            2.2 Create a method that passes two parameters: a double array and an integer index.
            the method removes the element at the given index of the array and returns the new array


            2.3 Create a method that passes two parameters: a char array and an integer index.
            the method removes the element at the given index of the array and returns the new array

            2.4 Create a method that passes two parameters: a String array and an integer index.
            the method removes the element at the given index of the array and returns the new array
 */