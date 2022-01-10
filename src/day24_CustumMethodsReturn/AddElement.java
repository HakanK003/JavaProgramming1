package day24_CustumMethodsReturn;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(addElement(nums,6)));

    }

    public static int[] addElement(int[] arr,int newElement){

        int[] newArr = new int[arr.length+1];
        int count=0;
        for (int each : arr) {
            newArr[count++]=each;
        }
        newArr[count]=newElement;
        return newArr;
    }
}

/*
create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */