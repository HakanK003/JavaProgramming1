package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter word");
        String  word1 = input.nextLine();

        input.close();

        String wordReversed = "";  //contain the reversed version of word1

        for (int i = word1.length()-1;i>=0;i--){

            wordReversed += word1.charAt(i);

        }

        System.out.println(wordReversed);

    }
}

/*
Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */