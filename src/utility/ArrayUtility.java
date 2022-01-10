package utility;

import java.util.Arrays;

public class ArrayUtility {

    //prints each integer of an integer array in separate lines
    public static void printlnEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    //prints each double of double array in separate lines
    public static void printlnEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    //prints each char of char array in separate lines
    public static void printlnEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    //prints each String of String array in separate lines
    public static void printlnEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number for integer array
    public static int maxNum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    //returns the maximum number for double array
    public static double maxNum(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    //returns the minimum number for integer array
    public static int minNum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    //returns the minimum number for double array
    public static double minNum(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //contains method for int arrays
    public static boolean contains(int[] array,int element){
        boolean result = false;
        for (int each : array) {
            if (each==element){result=true;}
        }
        return result;
    }
    //contains method for double arrays
    public static boolean contains(double[] array,double element){
        boolean result = false;
        for (double each : array) {
            if (each==element){result=true;}
        }
        return result;
    }
    //contains method for char arrays
    public static boolean contains(char[] array,char element){
        boolean result = false;
        for (char each : array) {
            if (each==element){result=true;}
        }
        return result;
    }
    //contains method for String arrays
    public static boolean contains(String[] array,String element){
        boolean result = false;
        for (String each : array) {
            if (each==element){result=true;}
        }
        return result;
    }

    //add the given integer to array
    public static int[] elementAdder (int[] arr1, int newElement){

        int[] newArr = new int[arr1.length+1];

        int i=0;
        for (int each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    //add the given double to array
    public static double[] elementAdder (double[] arr1, double newElement){

        double[] newArr = new double[arr1.length+1];

        int i=0;
        for (double each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    //add the given char to array
    public static char[] elementAdder (char[] arr1, char newElement){

        char[] newArr = new char[arr1.length+1];

        int i=0;
        for (char each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }
    //add the given String to array
    public static String[] elementAdder (String[] arr1, String newElement){

        String[] newArr = new String[arr1.length+1];

        int i=0;
        for (String each : arr1){
            newArr[i++]=each;
        }
        newArr[i]=newElement;

        return newArr;
    }

    //return frequency of int from int array
    public static  int frequencyOfElement(int[] arr, int num){

        int count =0;
        for (int each : arr) {
            if (each==num){count++;}
        }
        return count;
    }
    //return frequency of double from double array
    public static int frequencyOfElement(double[] arr, double num){

        int count =0;
        for (double each : arr) {
            if (each==num){count++;}
        }
        return count;
    }
    //return frequency of char from char array
    public static int frequencyOfElement(char[] arr, char ch){

        int count =0;
        for (char each : arr) {
            if (each==ch){count++;}
        }
        return count;
    }
    //return frequency of String from String array
    public static int frequencyOfElement(String[] arr, String str){

        int count =0;
        for (String each : arr) {
            if (each.equals(str)){count++;}
        }
        return count;
    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {

            if( ArrayUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArrayUtility.elementAdder(result, each);
            }

        }

        return result;
    }
    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if( ArrayUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArrayUtility.elementAdder(result, each);
            }

        }

        return result;
    }
    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if( ArrayUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArrayUtility.elementAdder(result, each);
            }

        }

        return result;
    }
    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if( ArrayUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArrayUtility.elementAdder(result, each);
            }

        }

        return result;
    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }
    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }
    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }
    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // merge the given two arrays and returns the new array
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
    // merge the given two arrays and returns the new array
    public static double[] mergeArray(double[]arr1,double[]arr2){
        double[] result = {};

        for (double each : arr1) {
            result = ArrayUtility.elementAdder(result,each);
        }
        for (double each : arr2) {
            result = ArrayUtility.elementAdder(result,each);
        }
        return result;
    }
    // merge the given two arrays and returns the new array
    public static String[] mergeArray(String[]arr1,String[]arr2){
        String[] result = {};

        for (String each : arr1) {
            result = ArrayUtility.elementAdder(result,each);
        }
        for (String each : arr2) {
            result = ArrayUtility.elementAdder(result,each);
        }
        return result;
    }
    // merge the given two arrays and returns the new array
    public static char[] mergeArray(char[]arr1,char[]arr2){
        char[] result = {};

        for (char each : arr1) {
            result = ArrayUtility.elementAdder(result,each);
        }
        for (char each : arr2) {
            result = ArrayUtility.elementAdder(result,each);
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
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

    //insert an element to a specific index in int array
    public static int[] insertElement(int[] array, int indexNo, int newElement){

        int [] newArr = new int[array.length+1];

        int count =0;
        newArr[indexNo]=newElement;
        for (int i = 0; i < newArr.length; i++) {
            if (i==indexNo){continue;}
            newArr[i]=array[count++];
        }
        return newArr;
    }
    //insert an element to a specific index in double array
    public static double[] insertElement(double[] array, int indexNo, double newElement){

        double [] newArr = new double[array.length+1];

        int count =0;
        newArr[indexNo]=newElement;
        for (int i = 0; i < newArr.length; i++) {
            if (i==indexNo){continue;}
            newArr[i]=array[count++];
        }
        return newArr;
    }
    //insert an element to a specific index in char array
    public static char[] insertElement(char[] array, int indexNo, char newElement){

        char [] newArr = new char[array.length+1];

        int count =0;
        newArr[indexNo]=newElement;
        for (int i = 0; i < newArr.length; i++) {
            if (i==indexNo){continue;}
            newArr[i]=array[count++];
        }
        return newArr;
    }
    //insert an element to a specific index in String array
    public static String[] insertElement(String[] array, int indexNo, String newElement){

        String [] newArr = new String[array.length+1];

        int count =0;
        newArr[indexNo]=newElement;
        for (int i = 0; i < newArr.length; i++) {
            if (i==indexNo){continue;}
            newArr[i]=array[count++];
        }
        return newArr;
    }

    //swaps elements of the int array
    public static int[] swapElements(int[] array, int indexNo1, int indexNo2){
        int station  = array[indexNo1];
        array[indexNo1] = array[indexNo2];
        array[indexNo2] = station;
        return array;
    }
    //swaps elements of the double array
    public static double[] swapElements(double[] array, int indexNo1, int indexNo2){
        double station  = array[indexNo1];
        array[indexNo1] = array[indexNo2];
        array[indexNo2] = station;
        return array;
    }
    //swaps elements of the char array
    public static char[] swapElements(char[] array, int indexNo1, int indexNo2){
        char station  = array[indexNo1];
        array[indexNo1] = array[indexNo2];
        array[indexNo2] = station;
        return array;
    }
    //swaps elements of the String array
    public static String[] swapElements(String[] array, int indexNo1, int indexNo2){
        String station  = array[indexNo1];
        array[indexNo1] = array[indexNo2];
        array[indexNo2] = station;
        return array;
    }

    //merge
    //add elements
    //remove elements
    //reverse
    //frequencyOfElements
    //uniqueElements
    //removeDuplicates
    
}
