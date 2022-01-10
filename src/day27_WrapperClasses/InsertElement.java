package day27_WrapperClasses;

import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(insertElement(numbers1,3,9)));
        double[] numbers2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(Arrays.toString(insertElement(numbers2,3,9.9)));
        char[] ch1 ={'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(Arrays.toString(insertElement(ch1,3,'H')));
        String[] str1 ={"Java", "Python", "C++", "SQL", "JavaScript", "Ruby"};
        System.out.println(Arrays.toString(insertElement(str1,3,"C#")));


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
}

/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */