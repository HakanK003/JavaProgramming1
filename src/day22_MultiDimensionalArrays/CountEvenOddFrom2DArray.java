package day22_MultiDimensionalArrays;

public class CountEvenOddFrom2DArray {

    public static void main(String[] args) {

        int [][] arr2D = {{0, 1, 2, 3, 4, 5}, { 6, 7, 8, 9, 10}, {20, 19, 18, 17, 16}, {15, 14, 13, 12, 11}};
        int even =0;
        int odd =0;

        for (int[] each1D : arr2D) {
            for (int elements : each1D) {
                if(elements%2==0){even++;}else{odd++;}
            }
        }

        System.out.println("There are " + even + " even numbers\nThere are " + odd+" odd numbers");

    }
}

/*
Write a program that can count the total odd and even numbers from a two dimensional array
 */