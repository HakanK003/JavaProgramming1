package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int cents = input.nextInt();

        input.close();

        int dollars= cents/100;
        int cents2 = cents%100;

        System.out.println(cents +" cents equal to: "+dollars+ " dollars and "+ cents2 + " cents");
    }
}
