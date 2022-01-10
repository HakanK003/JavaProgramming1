package day25_CustomMethodsOverloading;

import java.util.Arrays;

public class ElementAdderToArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        numbers = elementAdder(numbers, 13);

        System.out.println(Arrays.toString(numbers));

        double[] arr2 ={1.2,2.3,3.4,4.5,5.6};

        arr2 = elementAdder(arr2,6.7);

        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Hello", "Ciao", "Merhaba", "Salut"};

        arr3 = elementAdder(arr3,"Hola");

        System.out.println(Arrays.toString(arr3));

        char[] arr4 = {'A', 'B', 'C', 'D'};

        arr4 = elementAdder(arr4,'E');
        arr4 = elementAdder(arr4,'F');

        System.out.println(Arrays.toString(arr4));



    }

    public static int[] elementAdder (int[] arr1, int newElement){

        int[] newArr = new int[arr1.length+1];

        int i=0;
        for (int each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    public static double[] elementAdder (double[] arr1, double newElement){

        double[] newArr = new double[arr1.length+1];

        int i=0;
        for (double each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    public static char[] elementAdder (char[] arr1, char newElement){

        char[] newArr = new char[arr1.length+1];

        int i=0;
        for (char each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    public static String[] elementAdder (String[] arr1, String newElement){

        String[] newArr = new String[arr1.length+1];

        int i=0;
        for (String each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
}

/*
Task2:
        1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array
 */