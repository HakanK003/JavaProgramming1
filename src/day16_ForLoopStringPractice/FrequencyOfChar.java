package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a char");
        char ch = input.next().charAt(0);

        int length1= str.length();

        str=str.replace(""+ch, "");

        int length2 =str.length();

        System.out.println(length1-length2);
    }
}

/*
Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */