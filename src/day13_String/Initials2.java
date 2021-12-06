package day13_String;

import java.util.Scanner;

public class Initials2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.nextLine();

        System.out.println("Enter last name");
        String lastName = input.nextLine();

        input.close();

        firstName=""+firstName.toUpperCase().charAt(0);
        lastName=""+lastName.toUpperCase().charAt(0);

        System.out.println(firstName+"."+lastName);





        // harflerin arasinda nokta olucak ve buyuk harfe donmeli


    }
}

/*
 write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */