package day20_Arrays;

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Arrays length");
        int arrayLength = input.nextInt();

        int[] numbers1 = new int[arrayLength];
        int[] numbers2 = new int[arrayLength];

        String result ="";

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter a number for first array");
            numbers1[i]= input.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter a number for second array");
            numbers2[i]= input.nextInt();
        }

        input.close();

        for (int i = 0; i < numbers1.length; i++) {

            for (int j = 0; j < numbers2.length; j++) {

                if (numbers1[i]==numbers2[j]){result+=numbers1[i]+" ";}

            }

        }

            System.out.println("Common elements: "+result.trim());

    }
}

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */