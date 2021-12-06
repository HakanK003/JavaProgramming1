package day14_String;

import java.util.Scanner;

public class FirstCharIs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        input.close();

        int firstChar = word.charAt(0);

        String result =  (firstChar>=97&&firstChar<=122)?   "first character is lowercase letter"
                        :(firstChar>=65&&firstChar<=90)?    "first character is uppercase letter"
                        :(firstChar>=48&&firstChar<=57)?    "first character is digit"
                        :                                   "first character is special character" ;

        System.out.println(result);

    }
}

/*
Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */