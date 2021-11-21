package day13_String;

import java.util.Scanner;

public class LongestStringFromTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String word1 = input.nextLine();

        System.out.println("Enter second string");
        String word2 = input.nextLine();

        input.close();



        String result = (word1.length()>word2.length())? (word1)
                        :(word2.length()>word1.length())? (word2)
                        :("Equal long");


        System.out.println(result);


    }
}
