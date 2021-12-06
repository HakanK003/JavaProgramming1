package day20_Arrays;

import java.util.Scanner;

public class ArraysPracticeMaksMinScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will compared");
        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a number");
            numbers[i]=input.nextInt();  // each user entered input will be assigned to the indexes of the array numbers

        }

        int min=numbers[0],
            maks=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>maks){maks=numbers[i];}
            if (numbers[i]<min){min=numbers[i];}

        }

        System.out.println("Maks number is: " + maks + "\nMin number is: " + min);


    }
}
