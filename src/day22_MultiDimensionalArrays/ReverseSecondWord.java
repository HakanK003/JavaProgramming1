package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence="I love Java";
        String[] words= sentence.split(" ");

        String reversedSecond="";
        String result ="";

        for (int i = words[1].length()-1; i >=0 ; i--) {

            reversedSecond+=""+words[1].charAt(i);

        }

        words[1]=reversedSecond;

        for (String each : words) {
            result+=each+" ";
        }

        System.out.println(Arrays.toString(words));
        System.out.println(result.trim());

    }
}

/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */