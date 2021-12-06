package day15_ForLoop;

import java.util.Scanner;

public class CalculateWithForLoop {

    public static void main(String[] args) {

        /*
        for (int i=1; i<=100; i++) {
            int result = 0;
            result += i;
            System.out.println(result);
        }
*/

        int sum = 0;

        for (int i = 1; i <101 ; i++) {
            sum +=i;
        }

        System.out.println(sum);

        System.out.println("---------------------------------------------");

        Scanner input = new Scanner(System.in);

        double sum2 = 0;

        for (int i =0; i <5 ; i++) {
            System.out.println("enter a number:");
            sum2 +=input.nextInt();
        }

        System.out.println(sum2);

        input.close();

    }
}
