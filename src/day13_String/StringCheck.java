package day13_String;

import java.util.Scanner;

public class StringCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter s String");
        String word = input.nextLine();

        input.close();

        int length = word.length();

        String result = (word.isEmpty())? "string is empty" :(length<=3)? word : ""+word.charAt(length-3)+word.charAt(length-2)+word.charAt(length-1);

        System.out.println(result);

    }
}
/*
Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */