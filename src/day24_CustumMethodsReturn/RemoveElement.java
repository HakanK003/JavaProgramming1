package day24_CustumMethodsReturn;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums ={10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(removeElement(nums,60)));

    }
    public static int[] removeElement(int[] arr,int element){
        int[] newArr = new int[arr.length-1];
        int count =0;
        for (int each: arr) {
            if (each==element){continue;}
            newArr[count++]=each;
        }
        return newArr;
    }
}

/*
create a method named removeElement that passes one integer array and one integer,
the method removes the integer element from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				element = 30


				removeElement(array, element) ==== {10, 20, 40, 50, 60}
 */