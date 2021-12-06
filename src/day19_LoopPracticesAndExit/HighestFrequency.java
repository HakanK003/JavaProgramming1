package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class HighestFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        input.close();

        String result ="";

        int maksFrequency =0;

        for (int j = 0; j < str.length(); j++) {

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == str.charAt(i)) {frequency++;}

                if (frequency > maksFrequency) {
                    maksFrequency = frequency;
                    result = "" + str.charAt(j) +" = "+ maksFrequency;
                }

            }
        }

        System.out.println(result);






    }



}

/*
 Write a program that can find the character that has the highest frequency from a string
 */