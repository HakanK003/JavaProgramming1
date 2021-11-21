package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        input.close();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = "" + f + l ;// we can't use like=f+k; because it has to be a string for that we add empty string

        System.out.println("initial = " + initial);











    }
}
