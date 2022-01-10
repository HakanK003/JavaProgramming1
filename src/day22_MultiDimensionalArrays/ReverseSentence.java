package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" ");
        String[] reversedWords = new String[words.length];
        String result = "";

        for (int i =0, a=1; i< words.length; i++, a++) {

            reversedWords[i]=words[words.length-a];

        }

        for (String each : reversedWords) {
            result+=each+" ";
        }

        System.out.println(Arrays.toString(reversedWords));
        System.out.println(result.trim());

    }
}

/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */