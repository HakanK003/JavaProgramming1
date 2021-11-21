package day13_String;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
            //index:   01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);
/*
        char tenthChar = word.charAt(9);        //this will give us error cause out of range
                                                //index number should exist
        System.out.println("tenthChar = " + tenthChar);
*/

        System.out.println("---------------------------------------------------------------------");


        String s1 = "Batch 25 is the best batch.";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);     // or totalChars-1

        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------------------------------------------------------");

        String str = "wooden spoon";

        str = str.toUpperCase();

        System.out.println(str);

        String sentence = "today is a great day to learn java programming language.";
        sentence=sentence.toUpperCase();

        System.out.println("sentence = " + sentence);









    }
}
