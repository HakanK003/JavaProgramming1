package day21_ForEachLoop;

public class CountOddEven {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int even=0;
        int odd=0;

        for (int each : numbers) {
            if (each%2==0){even++;}else{odd++;}
        }

        System.out.println(even + " even\n" + odd + " odd");

    }
}

/*
Write a program that can count the even and odd number from an array of integers
Note: MUST use for each loop
 */