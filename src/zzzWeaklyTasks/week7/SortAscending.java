package zzzWeaklyTasks.week7;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(new int[]{1, 3, 4, 9, 7, 5, 2, 8, 4, 6, 0})));

    }

    public static int[] sortAscending(int[] nums){

        int x = nums.length;

        int[] sorted = new int[x];

        int a = 0;

        for (int i = 0; i < x; i++) {

            int min = nums[i];
            int minsIndex=i;

            for (int j = 0; j < x; j++) {

                if (min>nums[j]){
                    min=nums[j];
                    minsIndex=j;
                }

            }


            sorted[a]=min;
            a++;

            nums[minsIndex]=Integer.MAX_VALUE;

        }

        return sorted;

    }

}

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */