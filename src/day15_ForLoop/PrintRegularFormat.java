package day15_ForLoop;

import java.util.Scanner;

public class PrintRegularFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Name");
        String firstName = input.nextLine();

        System.out.println("Enter last name");
        String lastName = input.nextLine();

        input.close();

        firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        //firstName= (""= firstName.charAt(0) ) .toUpperCase + firstName.substring(1).toLowerCase();
        //              for converting char to String (because toUpperCase works with String)
        //toUpperCase().charAt(0) can work to
        lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

    }
}

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */