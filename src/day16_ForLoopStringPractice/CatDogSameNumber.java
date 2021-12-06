package day16_ForLoopStringPractice;

import java.util.Locale;
import java.util.Scanner;

public class CatDogSameNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("Enter first word to count");
        String first = input.nextLine().toLowerCase();
        System.out.println("Enter second word to count");
        String second = input.nextLine().toLowerCase();
        input.close();

        int letters1 = first.length();
        int letters2 = second.length();

        int num1=((sentence.length())-(sentence.replace(first, "").length()))/letters1;
        int num2=((sentence.length())-(sentence.replace(second, "").length()))/letters2;

        if (num1==num2){System.out.println("true");}

    }
}

/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */