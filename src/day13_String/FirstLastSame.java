package day13_String;

import java.util.Scanner;

public class FirstLastSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        input.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        String result = (firstChar==lastChar)? "Same" : "Different" ;

        System.out.println(result);

    }
}

/*
 write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */