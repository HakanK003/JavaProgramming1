package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String building = input.next();

        input.nextLine();

        System.out.println("Enter your street name");
        String street = input.nextLine();

        System.out.println("Enter your city");
        String city = input.next();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name");
        String country = input.nextLine();

        input.close();


    }
}

/*

 */