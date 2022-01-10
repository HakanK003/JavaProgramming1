package day23_CustomMethod;

import java.util.Scanner;

public class PrintEachChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        input.close();

        printAllChars(word);

    }

    public static void printAllChars(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}

/*
 create a method named printEachChar that can print each characters of a string
 */