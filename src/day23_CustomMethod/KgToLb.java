package day23_CustomMethod;

import java.util.Scanner;

public class KgToLb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many kg");
        double kg = input.nextDouble();

        input.close();

        kgToLbConverter(kg);


    }

    public static void kgToLbConverter (double kg){

        double lb = kg * 2.204;
        System.out.println(kg + " kg equal to " + lb + " lb");
    }
}

/*
 create a method that can convert kg to lb
 */