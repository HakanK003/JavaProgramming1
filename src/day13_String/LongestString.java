package day13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String first = input.nextLine();

        System.out.println("Enter second string");
        String second = input.nextLine();

        input.close();

        int firstLong = first.length();
        int secondLong = second.length();

        String result =  (firstLong>secondLong)? first :(secondLong>firstLong)? second : "equal length" ;

        System.out.println(result);
    }

}

/*
write a program that asks user to enter two strings, and print out the longest string
 */