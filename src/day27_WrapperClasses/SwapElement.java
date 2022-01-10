package day27_WrapperClasses;

import java.util.Arrays;

public class SwapElement {

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(swapElements(numbers1,3,5)));
        double[] numbers2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(Arrays.toString(swapElements(numbers2,3,5)));
        char[] ch1 ={'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(Arrays.toString(swapElements(ch1,3,5)));
        String[] str1 ={"Java", "Python", "C++", "SQL", "JavaScript", "Ruby"};
        System.out.println(Arrays.toString(swapElements(str1,3,5)));

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
}

/*
Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */