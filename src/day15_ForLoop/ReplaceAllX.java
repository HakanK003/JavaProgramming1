package day15_ForLoop;

import java.util.Scanner;

public class ReplaceAllX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        input.close();

        if (word.contains("x")||word.contains("X")){word=word.replace("x" , "a").replace("X","a");}

        System.out.println(word);


    }
}

/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        code
 */