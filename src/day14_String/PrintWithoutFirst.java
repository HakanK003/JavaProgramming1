package day14_String;

import java.util.Scanner;

public class PrintWithoutFirst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String word1 = input.nextLine();
        System.out.println("Enter second string");
        String word2 = input.nextLine();

        input.close();

        String result=word1.substring(1)+word2.substring(1);

        System.out.println(result);

    }
}

/*
Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */