package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles");
        double miles= input.nextDouble();

        input.close();

        double km = miles*1.009;

        System.out.println(miles+" miles equal to "+km+" kilometers");

    }
}
