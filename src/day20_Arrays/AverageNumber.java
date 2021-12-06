package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50, 60};

        double sum= 0;     // we use double for right division

        for (int i = 0; i < numbers.length; i++) {

            sum+= numbers[i];

        }

        double averageNumber = sum/ numbers.length;

        System.out.println("Average Number = " + averageNumber);


    }
}
