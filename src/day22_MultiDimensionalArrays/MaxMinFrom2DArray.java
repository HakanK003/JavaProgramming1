package day22_MultiDimensionalArrays;

public class MaxMinFrom2DArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3, 4, 5}, {10, 9, 8, 7, 6}};
        
        int max =arr2D[0][0];
        int min =arr2D[0][0];

        for (int[] each1D : arr2D) {
            for (int each : each1D) {

                if (each>max){max=each;}
                if (each<min){min=each;}
                
            }
        }

        System.out.println("Maximum number is = "+max+"\nMinimum number is = "+min);


    }
}

/*
 Write a program that can find the minimum and maximum numbers from a two-dimensional array
 */