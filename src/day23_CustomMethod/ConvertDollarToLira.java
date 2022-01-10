package day23_CustomMethod;

import java.util.Scanner;

public class ConvertDollarToLira {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter dollar quantity");
        double dollars = input.nextDouble();
        System.out.println("Enter current currency");  // like13.75
        double currency = input.nextDouble();

        input.close();

        converterDollarToLira(dollars,currency);

    }

    public static void converterDollarToLira (double dollar, double currency){

        double lira = dollar * currency;
        System.out.println(dollar + " dollars equal to " + lira + " liras");
    }
}

/*
create a method that can can convert dollar to lira
 */

