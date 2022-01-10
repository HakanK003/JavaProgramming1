package day23_CustomMethod;

import java.util.Scanner;

public class ConvertDollarToEuro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter dollar quantity");
        double dollars = input.nextDouble();
        System.out.println("Enter current currency");  // like0.9
        double currency = input.nextDouble();

        input.close();

        converterDollarToEuro(dollars,currency);

    }

    public static void converterDollarToEuro (double dollar, double currency){

        double euro = dollar * currency;
        System.out.println(dollar + " dollars equal to " + euro + " euros");
    }
}

/*
create a method that can convert dollar to euro
 */