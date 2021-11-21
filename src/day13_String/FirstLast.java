package day13_String;

import java.util.Scanner;

public class FirstLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        input.close();

        char first = sentence.charAt(0);
        System.out.println("first = " + first);

        char last = sentence.charAt(sentence.length()-1);
        System.out.println("last = " + last);




    }

}

/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */