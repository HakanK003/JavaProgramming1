package day20_Arrays;

import java.util.Scanner;

public class MonthsWithArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter the number of the month");
        int number = input.nextInt();

        if (number>12||number<1){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(months[number-1]);

    }
}
