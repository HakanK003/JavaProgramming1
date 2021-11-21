package day11_SwitchScanner;

import java.util.Scanner;

public class Cydeo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter batch type (US morning/US evening/EU)");
        String batch = input.nextLine();

        input.close();

        String result;

        switch (batch){

            case "US morning":
                result="Class times are 10-5 EST. M, T, Th, F";
                break;

            case "US evening":
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;

            case "EU":
                result="Class times are  10-5 EST. M, T, W, Th, ";
                break;

            default:
                result="Invalid Batch";

        }

        System.out.println(result);

    }
}
