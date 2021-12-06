package day15_ForLoop;

import java.util.Scanner;

public class ReplaceStart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        input.close();

        if (word.startsWith("x")){word=word.replaceFirst("x","a");}
        System.out.println(word);

            }
}

/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */