package day24_CustumMethodsReturn;

import java.util.Arrays;

public class RemoveElement2 {
    public static void main(String[] args) {

        int[] nums ={10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(removeElement(nums,3)));

    }
    public static int[] removeElement(int[] arr,int indexNo){
        int[] newArr = new int[arr.length-1];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==indexNo){continue;}
            newArr[count++]=arr[i];
        }
        return newArr;
    }
}

/*
 create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */