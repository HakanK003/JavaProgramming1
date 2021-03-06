package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODES HERE:
        scan.close();

        int underSIndex = email.indexOf("_");
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");

        String firstName =email.substring(0,1).toUpperCase()+email.substring(1,underSIndex),
                lastName =email.substring(underSIndex+1,underSIndex+2).toUpperCase()+email.substring(underSIndex+2,atIndex),
                domain=email.substring(atIndex+1, dotIndex);

        System.out.println("First name: " +firstName+ "\nLast name: "+lastName+"\nDomain: "+domain);



    }
}

/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */