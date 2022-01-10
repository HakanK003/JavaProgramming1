package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseMultiDArray {

    public static void main(String[] args) {

        int[][] nums ={{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] reversedNums = new int[nums.length][nums[0].length];


            for (int i = nums.length-1, a=0; i>=0 ; i--,a++) {
                for (int j = 0 , b = nums.length-1; j < nums.length; j++,b--) {
                    reversedNums[a][j]=nums[i][b];
                }
            }

        System.out.println(Arrays.deepToString(reversedNums));

    }
}

/*
 Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */