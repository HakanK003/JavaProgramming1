package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseMultiDArray2 {

    public static void main(String[] args) {

        int[][] nums ={{0}, {1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10, 11, 12, 13, 14}};
        int[][] reversedNums = new int[nums.length][];

        for (int i = 0, j=nums.length-1; i < reversedNums.length; i++, j--) {
            int[] elements = new int[nums[j].length];
            for (int x = 0,y=nums[nums.length-1-i].length-1 ; x <reversedNums[i].length ; x++,y--) {
                elements[x]=nums[j][y];
            }
            reversedNums[i]=elements;
        }

        System.out.println(Arrays.deepToString(reversedNums));

        /*
        2D_Reverse {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
int [][] reverse = new int[nums.length][nums[1].length];
        for (int i = nums.length-1; i >= 0; i--) {

            for (int j = nums[i].length-1 ; j >= 0; j--) {
               reverse[nums.length-1-i][nums[i].length-1-j]=nums[i][j];
            }

        }
        System.out.println(Arrays.deepToString(reverse));

    }
}
-----------------------------------------------------------------------------------
        package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Task1_Reverse2 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 11}};
        int[][] reversed = new int[array.length][];

        for (int i = 0; i < array.length; i++) {

            int[] elements = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                elements[(elements.length-1)-j] = array[i][j];
            }
            reversed[(array.length-1)-i] = elements;
        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
         */

    }
}

/*
 Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */