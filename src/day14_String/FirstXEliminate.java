package day14_String;

import java.util.Scanner;

public class FirstXEliminate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        input.close();

        String result = (word.startsWith("x")||word.startsWith("X"))? word.substring(1) : word;

        System.out.println(result);


    }
}

/*
Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */