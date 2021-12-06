package day20_Arrays;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        int[] numbers = {10, 0, 5, 0, 1, 0};
        int[] numbersNew = new int[numbers.length];

        int count = 0;

        for (int i = 0 ; i < numbers.length; i++) {

            if (numbers[i]!=0){
                numbersNew[count]=numbers[i];
                count++;
            }

        }

        System.out.println("Normal          ---> " + Arrays.toString(numbers));
        System.out.println("Zero at the end ---> " + Arrays.toString(numbersNew));

    }

}

/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */